package model;

import java.util.ArrayList;
import java.util.List;

import model.human.Human;
import model.human.Worker;
import model.vehicle.Vehicle;
import model.vehicle.impl.Bus;
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
		
		
		Vehicle [] vehicles = {new Bus("Volvo", 5.5), new Bus("Isuzu", 7.1), new Car("Mercedes-Benz"), new Bus("Icarus", 4.4)};
		
		for (Vehicle vehicle : vehicles) {
			System.out.println();
			vehicle.startEngine();
			vehicle.moveLeft();
			vehicle.stopEngine();
		}
	}
}
