package model.vehicle.impl;

import model.vehicle.Vehicle;

public class Bus implements Vehicle{

	private String model;
	private boolean isEngineRunning = false;
	private double sizeOfCab;
	
	public Bus(String model, double sizeOfCab) {
		super();
		this.model = model;
		this.sizeOfCab = sizeOfCab;
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
}
