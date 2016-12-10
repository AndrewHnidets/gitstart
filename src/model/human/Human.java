package model.human;

public class Human {

	private String name;
	private String surname;
	private int age;
	private String sex;
	private String phoneNumber;
	
	public Human(){}
	public Human(String name, String surname, int age, String sex, String phoneNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String toString() {
		return "Human [name=" + name + ", surname=" + surname + ", age=" + age + ", sex=" + sex + ", phoneNumber="
				+ phoneNumber + "]";
	}
}
