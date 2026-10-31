package com.flowtech.eventhub_spring_boot_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class EventhubSpringBootBackendApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(EventhubSpringBootBackendApplication.class, args);
	
		 Environment environment =applicationContext.getEnvironment();
		
		System.out.println("Event-Hub is running on port = "+environment.getProperty("server.port"));
	}

}
