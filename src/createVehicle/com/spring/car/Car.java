package com.spring.car;

public class Car implements Vehicle {
	
	//Instance Variables
	private double cost;
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
