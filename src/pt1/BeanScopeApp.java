package com.spring.pt1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		
		/**
		 * bean scope is singleton by default: Spring Container will only create one instance of a bean
		 * 
		 * Coach c1 = context.getBean("myCoach", Coach.class);
		 * Coach c2 = context.getBean("myCoach", Coach.class);
		 * both of these point to the exact same object reference
		 * 
		 * when defining a bean, you can change the type by adding scope
		 * <bean id="idName" class="className" scope="scopeType"></bean>
		 * 
		 * scope types include:
		 * singleton - A single shared instance of a bean. Default scope
		 * prototype - Creates a new bean instance for every container request
		 * request - Scoped to an HTTP web request. Only used for web apps
		 * session - Scoped to an HTTP web session. Only used for web apps
		 * global-session - Scoped to a global HTTP web session. Only used for web apps
		 * 
		 * */
		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach c1 = context.getBean("myCoach", Coach.class);
		Coach c2 = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		boolean result = (c1==c2);
		
		//print results
		System.out.println("Same object reference: " + result); // false: scoped was defined as prototype in .xml file
		System.out.println("Memory location for c1: "+ c1);
		System.out.println("Memory location for c2: "+ c2);
		
		//close context
		context.close();
	}

}
