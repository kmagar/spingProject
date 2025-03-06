package com.springcore.steretype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/steretype/stereoconfig.xml");
		Student student=context.getBean("student",Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddresses());
		
		System.out.println(student.hashCode());
		
		Student student1=context.getBean("student",Student.class);
		System.out.println(student1.hashCode());
	}

}
