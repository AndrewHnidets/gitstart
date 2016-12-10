package model.vehicle.impl;

import model.vehicle.Vehicle;

public class Car implements Vehicle{

	private String model;
	private boolean isEngineRunning = false;
	
	public Car(String model) {
		super();
		this.model = model;
	}
	@Override
	public void startEngine() {
		System.out.println("Engine started.");
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
	@Override
	public String toString() {
		return "Car [model=" + model + ", isEngineRunning=" + isEngineRunning + "]";
	}
}
