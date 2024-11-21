package com.enokdev.spring_boot_starter_auth_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = "com.enokdev.spring_boot_starter_auth")
public class SpringBootStarterAuthTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterAuthTestApplication.class, args);
	}



}
