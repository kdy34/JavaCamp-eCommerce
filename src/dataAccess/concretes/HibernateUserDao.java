package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void enter(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " has been entered to system with hibernate.");
		
	}

	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " has been removed to system with hibernate.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " has been updated to system with hibernate.");
		
	}

	@Override
	public void link(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Welcome!!!");
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
