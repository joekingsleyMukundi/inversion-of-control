package com.example.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve bean from spring container
		Coach coach1 = context.getBean("myCoach",Coach.class);
		//call methods on the bean
		System.out.println(coach1.getDailyWorkout());
		//close context
		context.close();

	}

}
