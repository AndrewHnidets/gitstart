package impl;

import java.util.List;

import com.lesson.dao.PersonDao;
import com.lesson.dao.impl.PersonDaoImpl;
import com.lesson.model.Person;

import service.PersonService;

public class PersonServiceImpl implements PersonService {

	private PersonDao personDao = new PersonDaoImpl();
	private static PersonServiceImpl personServiceImpl;

	private PersonServiceImpl() {};

	public static PersonServiceImpl getPersonServiceImpl() {
		if (personServiceImpl == null)
			personServiceImpl = new PersonServiceImpl();
		return personServiceImpl;
	}

	@Override
	public void add(Person p) {
		personDao.add(p);
	}

	@Override
	public List<Person> findAll() {
		return personDao.findAll();
	}

	@Override
	public Person findById(int id) {
		return personDao.findById(id);
	}

	@Override
	public void updateById(Person p) {
		personDao.updateById(p);
	}

	@Override
	public void delete(int id) {
		personDao.delete(id);
	}
}
