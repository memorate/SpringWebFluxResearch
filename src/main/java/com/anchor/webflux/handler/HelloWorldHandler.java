package com.anchor.webflux.handler;

import com.anchor.webflux.query.ObtainQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class HelloWorldHandler {

    public Mono<ServerResponse> helloWorld(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("Hello world!I am " + request.pathVariable("name")));
    }

    public Mono<ServerResponse> obtain(ServerRequest request) {
        return request.bodyToMono(ObtainQuery.class).flatMap(
                t -> ServerResponse
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromValue(t.toString())));
    }

    public Mono<ServerResponse> map(ServerRequest request) {
        Flux.just(1, 2, 3, 4)
                .log()
                .map(t -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return t * 2;
                }).subscribe(t -> log.info("get:{}", t));
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromValue("ok"));
    }

    public Mono<ServerResponse> flatmap(ServerRequest request) throws InterruptedException {
        Flux.just(1, 2, 3, 4)
                .log()
                .flatMap(t -> Flux.just(t * 2).delayElements(Duration.ofSeconds(1)))
                .subscribe(t -> log.info("get:{}", t));
        TimeUnit.SECONDS.sleep(10);
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromValue("ok"));
    }
}
