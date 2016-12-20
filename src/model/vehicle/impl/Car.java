package model.vehicle.impl;

import model.vehicle.Vehicle;

public class Car implements Vehicle{

	private String model;
	private boolean isEngineRunning = false;
	private double currentFuel;
	private double maxFuel;
	private double fuelForOneHundredKm;
	
	
	public Car(String model, double currentFuel, double maxFuel, double fuelForOneHundredKm) {
		super();
		this.model = model;
		if((currentFuel > 0 && currentFuel < maxFuel) || (maxFuel < 100 && maxFuel > 0)){
			this.currentFuel = currentFuel;
			this.maxFuel = maxFuel;
		}
		else
			System.out.println("Wrong data.");
		if(fuelForOneHundredKm > 0 && fuelForOneHundredKm < 30){
			this.fuelForOneHundredKm = fuelForOneHundredKm;
		}
		else
			System.out.println("Wrong data.");
	}
	
	@Override
	public void prognoseCurrent() {
		System.out.println("Car " + model + " can move with current fuel " + currentFuel + 
				" for " + (int) (currentFuel/fuelForOneHundredKm) * 100 + " kms.");
	}
	@Override
	public void startEngine() {
		System.out.println("Engine of car " + getModel() + " started.");
		setEngineRunning(true);
	}
	@Override
	public void moveRight() {
		System.out.println("Car moved right.");
	}
	@Override
	public void moveLeft() {
		System.out.println("Car moved left.");
	}
	@Override
	public void move() {
		System.out.println("Car moved straight  ahead.");
	}
	@Override
	public void stopEngine() {
		System.out.println("Car stopped engine.");
		setEngineRunning(false);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isEngineRunning() {
		return isEngineRunning;
	}
	public void setEngineRunning(boolean isEngineRunning) {
		this.isEngineRunning = isEngineRunning;
	}
	public double getCurrentFuel() {
		return currentFuel;
	}
	public void setCurrentFuel(double currentFuel) {
		this.currentFuel = currentFuel;
	}
	public double getMaxFuel() {
		return maxFuel;
	}
	public void setMaxFuel(double maxFuel) {
		this.maxFuel = maxFuel;
	}
	
	public double getFuelForOneHundredKm() {
		return fuelForOneHundredKm;
	}
	public void setFuelForOneHundredKm(double fuelForOneHundredKm) {
		this.fuelForOneHundredKm = fuelForOneHundredKm;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", isEngineRunning=" + isEngineRunning + "]";
	}
}
