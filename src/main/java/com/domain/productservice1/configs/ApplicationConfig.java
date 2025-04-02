package com.domain.productservice1.configs;


import com.domain.productservice1.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

public class ApplicationConfig {
    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
