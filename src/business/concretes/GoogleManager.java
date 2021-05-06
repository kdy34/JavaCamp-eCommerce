package business.concretes;

import business.abstracts.GoogleManagerService;
import entities.concretes.User;

public class GoogleManager implements GoogleManagerService{

	@Override
	public void register(User user) {
		if(user.getEmail().endsWith("@gmail.com") || user.getEmail().endsWith("@hotmail.com")){
			System.out.println("Registeration is successful. Welcome " + user.getFirstName() + " " + user.getLastName());
			
		}
		
	}

	@Override
	public boolean logInWithGoogle(User user) {
		
		System.out.println("Logged in with Google account.");
		return true;
	}

}
