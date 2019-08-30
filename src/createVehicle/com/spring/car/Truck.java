package com.spring.car;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanTruckId") // user created bean id
public class Truck implements Vehicle {
	
	//Instance Variable
	@Value("30421.31") //annotation can be read from properties file or hardcoded, removes need for setter and constructor injection
	private double cost;
	@Value("18-wheeler")
	private String vehicle;

	//Constructor
	public Truck(){
	}

	//Accessors
	public double getCost() {
		return cost;
	}
	public String getVehicle() {
		return vehicle;
	}

	//Special Purpose
	@Override
	public double milesToGallon() {
		// TODO Auto-generated method stub
		return 5.3;
	}
	@Override
	public int getNumWheels() {
		// TODO Auto-generated method stub
		return 18;
	}
	@Override
	public String vehicleType() {
		// TODO Auto-generated method stub
		return "Vehicle Type: " + this.getVehicle() +
				"\nCost: " + this.getCost();
	} 
	
	@PostConstruct //annotation for init-method in xml
	public void startApp()
	{
		System.out.println("Starting App - Allocating memory for Truck process");
	}
	@PreDestroy //annotation for destroy-method in xml
	public void killApp()
	{
		System.out.println("Closing App - Dumping Truck process memory");
	}

}
