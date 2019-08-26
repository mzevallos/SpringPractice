package com.spring.pt1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterTest {

	public static void main(String[] args) {
		
		//load Spring config file
		ClassPathXmlApplicationContext test = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring container
		CricketCoach c = test.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		System.out.println(c.getEmail());
		System.out.println(c.getTeam());
		
		//close context
		test.close();

	}

}
