package com.spring.car;

import org.springframework.beans.factory.annotation.Value;

public class Car implements Vehicle {
	
	//Instance Variables
	@Value("${foo.cost}") //bypass the need for setter injection by using value annotation to inject properties
	private double cost;
	@Value("${foo.vehicle}")
	private String vehicle;

	//Accessors
	public double getCost() {
		return cost;
	}
	public String getVehicle() {
		return vehicle;
	}

	//Mutators
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	//Special Purpose
	@Override
	public double milesToGallon() {
		return 25.5;
	}
	@Override
	public int getNumWheels() {
		return 4;
	}
	@Override
	public String vehicleType() {
		return "Vehicle Type: " + this.getVehicle() +
				"\nCost: " + this.getCost();
	}
	
	public void startApp()
	{
		System.out.println("Starting App - Allocating memory for Car process");
	}
	public void killApp()
	{
		System.out.println("Closing App - Dumping Car process memory");
	}

}
