package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootMvcApplication {

	public static void main(String[] args) {

		System.out.println("AJIT");
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMvcApplication.class, args);

		Alien alien = context.getBean(Alien.class);

		alien.show();
	}

}
