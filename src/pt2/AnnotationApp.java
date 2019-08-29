package com.spring.pt2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextPt2.xml");
		
		//get bean from spring container
		Coach c = context.getBean("tennisCoach", Coach.class);
		
		//call on bean methods
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		
		//close context
		context.close();

	}

}
