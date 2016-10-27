package com.lesson;

import com.lesson.model.Person;

import impl.PersonServiceImpl;

public class Application {

	public static void main(String[] args) {

		PersonServiceImpl ps = PersonServiceImpl.getPersonServiceImpl();

		Person p = new Person("Yurii");
		ps.add(p);
		
		
		
		
		System.out.println("App done");

	}

}
