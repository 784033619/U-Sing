package com.QST.Using.Util.CorsConfigurerAdapter;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class CorsConfigurerAdapter {
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/*").allowedOrigins("*");
    }
}
