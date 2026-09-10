package com.Library.CIT.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestClient;

@Configuration
public class ClientConfig {

    // Plain builder — Eureka's internal client autowires this by default
    @Primary
    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }

    // Load-balanced builder — only used where you explicitly ask for it
    @LoadBalanced
    @Bean
    public RestClient.Builder loadBalancedRestClientBuilder() {
        return RestClient.builder();
    }

    @Bean
    public RestClient restClient(
            @org.springframework.cloud.client.loadbalancer.LoadBalanced RestClient.Builder builder) {
        return builder.build();
    }
}