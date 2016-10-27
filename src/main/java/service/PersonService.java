package service;

import java.util.List;

import com.lesson.model.Person;

public interface PersonService {
	
	void add(Person p);
	
	List<Person> findAll();
	
	Person findById(int id);
	
	void updateById(Person p);
	
	void delete(int id);
}
