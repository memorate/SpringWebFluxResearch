package com.anchor.webflux.handler;

import com.anchor.webflux.query.ObtainQuery;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
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
}
