package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	//creating new student object
	@Bean
	public Student getStudent() {
		Student student=new Student();
		return student;
	}
}
