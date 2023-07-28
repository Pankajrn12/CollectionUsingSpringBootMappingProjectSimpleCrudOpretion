package com.simpleProject.simpleProjectCrudeOpretion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@AutoConfiguration
public class SimpleProjectCrudeOpretionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleProjectCrudeOpretionApplication.class, args);
	}

}
