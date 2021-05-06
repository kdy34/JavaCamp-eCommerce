package business.concretes;

import business.abstracts.LogInService;
import entities.concretes.User;

public class LogInManager implements LogInService{

	@Override
	public void login(User user, String email, String password) {
		
		if(email != user.getEmail()) {
			System.out.println("Please enter a valid email.");
		}
		
		else if(password != user.getPassword()) {
			System.out.println("Please enter a valid password");
		}
		else {
			System.out.println("Entrance is successful!");
		}
		
	}

}
