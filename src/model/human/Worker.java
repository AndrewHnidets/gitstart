package model.human;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Human{

	private String position;
	private String placeOfWork;
	private List<String> duties = new ArrayList<>();
	
	public Worker(){}
	public Worker(String name, String surname, int age, String sex, String phoneNumber, String position,
			String placeOfWork, List<String> duties) {
		super(name, surname, age, sex, phoneNumber);
		this.position = position;
		this.placeOfWork = placeOfWork;
		this.duties = duties;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPlaceOfWork() {
		return placeOfWork;
	}
	public void setPlaceOfWork(String placeOfWork) {
		this.placeOfWork = placeOfWork;
	}
	public List<String> getDuties() {
		return duties;
	}
	public void setDuties(List<String> duties) {
		this.duties = duties;
	}
	@Override
	public String toString() {
		return super.toString() + "Worker [position=" + position + ", placeOfWork=" + placeOfWork + ", duties=" + duties + "]";
	}
}
