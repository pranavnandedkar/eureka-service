package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import ch.qos.logback.core.net.SyslogOutputStream;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

	
	
	public static void main(String[] args) {
		System.out.println("starting the application");
		SpringApplication.run(EurekaServiceApplication.class, args);
	}
}
	