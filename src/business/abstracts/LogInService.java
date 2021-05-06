package business.abstracts;

import entities.concretes.User;

public interface LogInService {

	void login(User user, String email, String password);
}
