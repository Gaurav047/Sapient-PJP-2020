package com.sapient.SpringQuestions.springDemoUsingJava;

import org.springframework.context.annotation.*;

@Configuration
public class Config {
	@Bean
	public Employee employeeCreation() {
		return new Employee();
	}
}
