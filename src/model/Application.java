package model;

import java.util.ArrayList;
import java.util.List;

import model.human.Human;
import model.human.Worker;
import model.vehicle.Vehicle;
import model.vehicle.impl.Car;

public class Application {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Design site");
		list.add("Edit code");
		
		Human human = new Worker("Ivan", "Dzyuba", 38, "male", "22-22-22", "Junior web developer", "Softserve", list);
		System.out.println(human.toString());
		human.setName("Oleg");
		human.setSurname("Petergerin");
		human.setAge(25);
		System.out.println(human.toString());
		
		Vehicle car = new Car("Mercedes-Benz");
		
		car.startEngine();
		car.move();
		car.moveLeft();
		car.stopEngine();
	}
}
