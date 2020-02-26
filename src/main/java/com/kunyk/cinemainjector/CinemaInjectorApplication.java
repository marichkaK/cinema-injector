package com.kunyk.cinemainjector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CinemaInjectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaInjectorApplication.class, args);
	}

}
