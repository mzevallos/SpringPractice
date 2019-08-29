package com.spring.car;

import org.springframework.stereotype.Component;

@Component("beanTruckId") // user created bean id
public class Truck implements Vehicle {
	
	//Instance Variable
	private double cost;
	private String vehicle;

	//Constructor
	public Truck(double cost, String vehicle) {
		super();
		this.cost = cost;
		this.vehicle = vehicle;
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
	
	public void startApp()
	{
		System.out.println("Starting App - Allocating memory for Truck process");
	}
	public void killApp()
	{
		System.out.println("Closing App - Dumping Truck process memory");
	}

}
