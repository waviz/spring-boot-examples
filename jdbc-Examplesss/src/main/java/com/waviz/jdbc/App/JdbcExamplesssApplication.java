package com.waviz.jdbc.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.waviz.jdbc"})
public class JdbcExamplesssApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcExamplesssApplication.class, args);
	}

}
