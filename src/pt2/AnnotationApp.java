package com.spring.pt2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextPt2.xml");
		
		//get bean from spring container
		Coach c = context.getBean("bean_id_tennis", Coach.class);
		
		//call on bean methods
		System.out.println(c.getDailyWorkout());
		
		//close context
		context.close();

	}

}
