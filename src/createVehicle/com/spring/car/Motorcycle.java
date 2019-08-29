package com.spring.car;

import org.springframework.stereotype.Component;

@Component // default bean id "motorcycle" - uses class name if no id is given
public class Motorcycle implements Vehicle {

	private double cost;
	private String vehicle;
	
	public Motorcycle(double cost, String vehicle) {
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
		return 35.7;
	}
	@Override
	public int getNumWheels() {
		return 2;
	}
	@Override
	public String vehicleType() {
		return "Vehicle Type: " + this.getVehicle() +
				"\nCost: " + this.getCost();
	}
	
	public void startApp()
	{
		System.out.println("Starting App - Allocating memory for Motorcycle process");
	}
	public void killApp()
	{
		System.out.println("Closing App - Dumping Motorcycle process memory");
	}

}
