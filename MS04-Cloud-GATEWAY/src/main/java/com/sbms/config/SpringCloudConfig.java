package com.sbms.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
	
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/emp/**")
                        .uri("lb://EMP-REST-SERVICE")
                        .id("employeeModule"))

                .route(r -> r.path("/custService/**")
                        .uri("lb://CUSTOMER-SERVICE")
                        .id("consumerModule"))
                .build();
    }

}
