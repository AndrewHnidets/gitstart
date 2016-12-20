package model.vehicle.impl;

import model.vehicle.Vehicle;

public class Bus implements Vehicle{

	private String model;
	private boolean isEngineRunning = false;
	private double sizeOfCab;
	private double currentFuel;
	private double maxFuel;
	private double fuelForOneHundredKm;
	private static double possibleError = 1.001;
	
	public Bus(String model, double sizeOfCab, double currentFuel, double maxFuel, double fuelForOneHundredKm) {
		super();
		this.model = model;
		this.sizeOfCab = sizeOfCab;
		if((currentFuel > 0 && currentFuel < maxFuel) || (maxFuel < 200 && maxFuel > 0)){
			this.currentFuel = currentFuel;
			this.maxFuel = maxFuel;
		}
		else
			System.out.println("Wrong data.");
		if(fuelForOneHundredKm > 0 && fuelForOneHundredKm < 100){
			this.fuelForOneHundredKm = fuelForOneHundredKm;
		}
		else
			System.out.println("Wrong data.");
	}

	@Override
	public void prognoseCurrent() {
		System.out.println("Bus " + model + " can move with current fuel " + currentFuel + 
				" for " + (int) (((currentFuel/fuelForOneHundredKm) * 100) * possibleError) + " kms.");
	}
	public void prognoseMax() {
		System.out.println("Bus " + model + " can move with max fuel " + maxFuel + " for " +
				(int) (((maxFuel/fuelForOneHundredKm) * 100) * possibleError) + " kms.");
	}
	@Override
	public void startEngine() {
		System.out.println("Engine of bus " + getModel() + " started.");
		setEngineRunning(true);
	}
	@Override
	public void moveRight() {
		System.out.println("Bus moved right.");
	}
	@Override
	public void moveLeft() {
		System.out.println("Bus moved left.");
	}
	@Override
	public void move() {
		System.out.println("Bus moved straight  ahead.");
	}
	@Override
	public void stopEngine() {
		System.out.println("Bus stopped engine.");
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
	public double getSizeOfCab() {
		return sizeOfCab;
	}
	public void setSizeOfCab(double sizeOfCab) {
		this.sizeOfCab = sizeOfCab;
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
}
