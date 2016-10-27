package com.lesson.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lesson.dao.PersonDao;
import com.lesson.model.Person;
import com.lesson.utils.JdbcUtils;

public class PersonDaoImpl implements PersonDao {

	private static final String ADD_PERSON = "insert into person (`name`) values (?)";
	private static final String FIND_PERSON_BY_ID = "select * from person where id=?";
	private static final String FIND_ALL_PERSON = "select * from person";
	private static final String UPDATE_PERSON_BY_ID = "update person set  name=? where id=?";
	private static final String DELETE_PERSON_BY_ID = "update person set   is_deleted=1 where id=?";
	private static Connection connection;

	@Override
	public void add(Person p) {

		PreparedStatement ps = null;
		connection = JdbcUtils.getConnection();

		try {
			ps = connection.prepareStatement(ADD_PERSON);
			ps.setString(1, p.getName());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<Person> findAll() {
		PreparedStatement ps = null;
		connection = JdbcUtils.getConnection();
		List<Person> personList = new ArrayList<Person>();

		try {
			ps = connection.prepareStatement(FIND_ALL_PERSON);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				personList.add(new Person(rs.getString("name"), rs.getBoolean("is deleted")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personList;
	}

	@Override
	public Person findById(int id) {

		PreparedStatement ps = null;
		connection = JdbcUtils.getConnection();
		Person person = null;

		try {
			ps = connection.prepareStatement(FIND_PERSON_BY_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				person = new Person(rs.getString("name"), rs.getBoolean("is deleted"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return person;
	}

	@Override
	public void updateById(Person p) {

		PreparedStatement ps = null;
		connection = JdbcUtils.getConnection();

		try {
			ps = connection.prepareStatement(UPDATE_PERSON_BY_ID);
			ps.setString(1, p.getName());
			ps.setInt(2, p.getId());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void delete(int id) {
		PreparedStatement ps = null;
		connection = JdbcUtils.getConnection();
		Person person = null;

		try {
			ps = connection.prepareStatement(FIND_PERSON_BY_ID);
			ps.setInt(2, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				person = new Person(rs.getString("name"), rs.getBoolean("is deleted"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
