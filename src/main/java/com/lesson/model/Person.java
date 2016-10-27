package com.lesson.model;

public class Person {

	private Integer id;
	private String name;
	private Boolean isDeleted;
	public Person(String name, Boolean isDeleted) {
		super();
		this.name = name;
		this.isDeleted = isDeleted;
	}
	public Person() {
		super();
	}
	public Person(String name){
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", isDeleted=" + isDeleted + "]";
	}
	
	
	
	
}
