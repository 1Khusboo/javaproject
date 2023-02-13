package com.example.StudentCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class StudentCrudApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(StudentCrudApplication.class).build().run(args);
	}

}
