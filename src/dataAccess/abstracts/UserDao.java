package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	
	void enter(User user);
	void remove(User user);
	void update(User user);
	void link(User user);
	
	User get(int id);
	
	List<User> getAll();
	

}
