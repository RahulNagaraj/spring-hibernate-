package com.rahul.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean
		Coach coach = context.getBean("coach", Coach.class);
		
		// Call the methods
		System.out.println(coach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}
