package com.example.CurriculoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "controller")


public class CurriculoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurriculoApiApplication.class, args);
	}

}
