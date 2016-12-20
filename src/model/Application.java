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
		
		Bus bus = new Bus("Isuzu", 7.1, 136.4, 190, 21.2);
		Bus bus1 = new Bus("Volvo", 5.5, 150, 180, 18);
		Vehicle [] vehicles = {bus1, bus, new Car("Mercedes-Benz", 20, 40, 9), new Bus("Icarus", 4.4, 20, 130, 17.3)};
		System.out.println();
		for (Vehicle vehicle : vehicles) {
			vehicle.prognoseCurrent();
		}
		bus.prognoseMax();
		bus1.prognoseMax();
	}
}
