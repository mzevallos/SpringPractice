package com.spring.pt2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {

		//load spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		Coach c = context.getBean("swimCoach", Coach.class);
		
		//call on bean methods
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		
		//close context
		context.close();

	}

}
