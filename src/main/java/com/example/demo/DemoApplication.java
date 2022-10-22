package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	//rodar uma função main com spring boot ja sobe um tomcat embutido (embbeded) ao spring-boot
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
