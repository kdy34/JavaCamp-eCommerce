package business.abstracts;

import entities.concretes.User;

public interface GoogleManagerService {
	
	void register(User user);
	boolean logInWithGoogle(User user);

}
