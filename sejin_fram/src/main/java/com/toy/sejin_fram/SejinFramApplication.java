package com.toy.sejin_fram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SejinFramApplication {

	public static void main(String[] args) {
		SpringApplication.run(SejinFramApplication.class, args);
	}

}
