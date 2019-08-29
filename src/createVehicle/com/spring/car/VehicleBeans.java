package com.spring.car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleBeans {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		Vehicle v1 = context.getBean("myCar", Car.class);
		Vehicle v2 = context.getBean("motorcycle", Motorcycle.class);
		Vehicle v3 = context.getBean("beanTruckId", Truck.class);
		
		//execute methods
		System.out.println(v1.vehicleType());
		System.out.println("Number of wheels: "+ v1.getNumWheels());
		System.out.println("MPG: "+ v1.milesToGallon());
		
		System.out.println("****************************************");
		
		System.out.println(v2.vehicleType());
		System.out.println("Number of wheels: " + v2.getNumWheels());
		System.out.println("MPG: " + v2.milesToGallon());
		
		System.out.println("****************************************");
		
		System.out.println(v3.vehicleType());
		System.out.println("Number of wheels: " + v3.getNumWheels());
		System.out.println("MPG: " + v3.milesToGallon());
		
		//close context
		context.close();

	}

}
