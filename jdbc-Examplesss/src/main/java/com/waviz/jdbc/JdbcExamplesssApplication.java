package com.waviz.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.waviz.jdbc"})
public class JdbcExamplesssApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcExamplesssApplication.class, args);
	}

}
