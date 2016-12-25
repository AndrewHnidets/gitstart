package model.vehicle.impl;

import java.time.LocalDateTime;

import model.vehicle.Vehicle;

public class Bicycle implements Vehicle{

	private int numberOfWheels;
	private String typeOfBicycle;
	private int yearOfBuying;
	private int currentYear = LocalDateTime.now().getYear();
	private double weight;
	private int energy;
	private double timeToBreakage;
	
	
	public Bicycle(int numberOfWheels, String typeOfBicycle, int yearOfBuying, double weight,
			int energy, double timeToBreakage) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.typeOfBicycle = typeOfBicycle;
		this.yearOfBuying = yearOfBuying;
		this.weight = weight;
		this.energy = energy;
		this.timeToBreakage = timeToBreakage;
	}
	
	public void AgeOfBicycle(){
		if(yearOfBuying == currentYear){
			System.out.println("Bicycle '" + typeOfBicycle + "' is a new purchase.");
		}
		else
			System.out.println("Age of bicycle '" + typeOfBicycle + "' is " + (currentYear - yearOfBuying) +".");
	}
	@Override
	public void moveRight() {
		System.out.println("Bicycle moved right.");
	}
	@Override
	public void moveLeft() {
		System.out.println("Bicycle moved left.");
	}
	@Override
	public void move() {
		System.out.println("Bicycle moved straight  ahead.");
	}
	@Override
	public void prognoseCurrent() {
		System.out.println("Bicycle '" + typeOfBicycle + "' can move with current energy " + energy + 
				" for " + (int) (energy/weight) * timeToBreakage + " kms.");
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String getTypeOfBicycle() {
		return typeOfBicycle;
	}
	public void setTypeOfBicycle(String typeOfBicycle) {
		this.typeOfBicycle = typeOfBicycle;
	}
	public int getYearOfBuying() {
		return yearOfBuying;
	}
	public void setYearOfBuying(int yearOfBuying) {
		this.yearOfBuying = yearOfBuying;
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public double getTimeToBreakage() {
		return timeToBreakage;
	}
	public void setTimeToBreakage(double timeToBreakage) {
		this.timeToBreakage = timeToBreakage;
	}
}
