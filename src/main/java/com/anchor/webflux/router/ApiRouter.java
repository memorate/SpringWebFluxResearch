package com.anchor.webflux.router;

import com.anchor.webflux.handler.HelloWorldHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import javax.annotation.Resource;

@Configuration
public class ApiRouter {

    @Resource
    private HelloWorldHandler helloWorldHandler;

    @Bean("anchor")
    public RouterFunction<ServerResponse> helloWorld() {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello/{name}").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloWorldHandler::helloWorld)
                .andRoute(RequestPredicates.POST("/obtain").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), helloWorldHandler::obtain);
    }
}
