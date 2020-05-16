package com.anchor.webflux.Router;

import com.anchor.webflux.Handler.WebFluxHandler;
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
    private WebFluxHandler helloWorldHandler;

    @Bean("anchor")
    public RouterFunction<ServerResponse> helloWorld()  {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello/{name}").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloWorldHandler::helloWorld)
                .andRoute(RequestPredicates.POST("/obtain").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), helloWorldHandler::obtain)
                .andRoute(RequestPredicates.GET("/map").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloWorldHandler::map)
                .andRoute(RequestPredicates.GET("/flatmap").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloWorldHandler::flatmap)
                .andRoute(RequestPredicates.GET("/prepare").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloWorldHandler::prepareData);
    }
}
