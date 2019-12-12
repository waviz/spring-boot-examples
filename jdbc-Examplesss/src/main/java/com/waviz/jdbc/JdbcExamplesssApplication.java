package com.waviz.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@ComponentScan({"com.waviz.jdbc"})
@EnableAutoConfiguration
@Configuration
public class JdbcExamplesssApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcExamplesssApplication.class, args);
	}

}
