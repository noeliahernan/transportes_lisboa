package com.prueba.lisboa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LisboaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LisboaApplication.class, args);
	}

}
