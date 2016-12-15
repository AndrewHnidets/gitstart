package model.human;

public class Driver extends Human{

	private String typeOfDriversLicense;
	private boolean personalCar;
	
	public Driver(String name, String surname, int age, String sex, String phoneNumber, 
			String typeOfDriversLicense, boolean personalCar) {
		super(name, surname, age, sex, phoneNumber);
		this.typeOfDriversLicense = typeOfDriversLicense;
		this.personalCar = personalCar;
	}
	public String getTypeOfDriversLicense() {
		return typeOfDriversLicense;
	}
	public void setTypeOfDriversLicense(String typeOfDriversLicense) {
		this.typeOfDriversLicense = typeOfDriversLicense;
	}
	public boolean isPersonalCar() {
		return personalCar;
	}
	public void setPersonalCar(boolean personalCar) {
		this.personalCar = personalCar;
	}
}
