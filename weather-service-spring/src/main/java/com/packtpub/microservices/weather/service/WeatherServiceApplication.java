package com.packtpub.microservices.weather.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.packtpub.microservices.weather"})
@EnableAutoConfiguration
public class WeatherServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeatherServiceApplication.class, args);
	}
}
