package com.cts.health;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.cts.*"})
public class HealthInspectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthInspectorApplication.class, args);
	}

}
