package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void remove(User user);
	void update(User user);
	
	List<User> getAll();

}
