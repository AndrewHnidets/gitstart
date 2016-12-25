package model;

import java.util.ArrayList;
import java.util.List;

import model.human.Human;
import model.human.Worker;
import model.vehicle.Vehicle;
import model.vehicle.impl.Bicycle;
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
		
		Bicycle bic1 = new Bicycle(2, "mountain", 2012, 10.0, 500, 0.15);
		Bicycle bic2 = new Bicycle(2, "speed", 2013, 10.0, 375, 0.15);
		
		Vehicle [] vehicles = {new Car("Mercedes-Benz", 20, 40, 9), bic1, bic2};
		System.out.println();
		for (Vehicle vehicle : vehicles) {
			vehicle.prognoseCurrent();
		}
		bic1.AgeOfBicycle();
		bic2.AgeOfBicycle();
	}
}
