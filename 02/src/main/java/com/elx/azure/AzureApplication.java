package com.elx.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elx.azure.Components.Fibonacci;

@SpringBootApplication
public class AzureApplication {
	static Fibonacci fibonacci = new Fibonacci();

	public static void main(String[] args) {
		// Run the sequence before Spring Boots run() is called so it actually runs before Spring Boot starts
		fibonacci.run();
		SpringApplication.run(AzureApplication.class, args);
	}

}
