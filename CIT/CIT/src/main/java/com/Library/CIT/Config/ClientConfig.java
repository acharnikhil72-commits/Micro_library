package com.Library.CIT.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ClientConfig {

    @Bean
    @LoadBalanced
    public RestClient restClient() {
        return RestClient.create();
    }
}