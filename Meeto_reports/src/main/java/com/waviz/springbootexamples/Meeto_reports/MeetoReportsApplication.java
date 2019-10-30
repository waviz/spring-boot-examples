package com.waviz.springbootexamples.Meeto_reports;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import com.waviz.springbootexamples.Meeto_reports.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("com.waviz.springbootexamples.Meeto_reports.mappers")
@SpringBootApplication
public class MeetoReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetoReportsApplication.class, args);
	}

}
