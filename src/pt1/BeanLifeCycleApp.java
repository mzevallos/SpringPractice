package com.spring.pt1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach c = context.getBean("myCoach", Coach.class);
		
		//run bean methods
		System.out.println(c.getDailyWorkout());
		
		//close context
		context.close();
	}

}
