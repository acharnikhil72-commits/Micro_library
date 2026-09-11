// package com.Library.CIT.Config;

// import org.springframework.cloud.client.loadbalancer.LoadBalanced;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
// import org.springframework.web.client.RestClient;
// import org.springframework.web.client.RestClient.Builder;

// @Configuration
// public class ClientConfig {

//     // Plain builder - used by Eureka client internals and anything
//     // that just asks for RestClient.Builder with no qualifier
//     @Bean
//     @Primary
//     public Builder restClientBuilder() {
//         return RestClient.builder();
//     }

//     // Load-balanced builder - use this explicitly for calling
//     // other microservices by their Eureka service-id
//     @Bean
//     @LoadBalanced
//     public Builder loadBalancedRestClientBuilder() {
//         return RestClient.builder();
//     }

//     @Bean
//     public RestClient restClient(@LoadBalanced Builder loadBalancedRestClientBuilder) {
//         return loadBalancedRestClientBuilder.build();
//     }
// }