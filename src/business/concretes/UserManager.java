package business.concretes;

import java.util.ArrayList;

import java.util.List;

import business.abstracts.UserService;
import core.abstracts.EmailVerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	
	private UserDao userDao;
	private EmailVerificationService emailVerificationService;
	
	private ArrayList<String> email = new ArrayList<String>();
	
	public UserManager(UserDao userDao, EmailVerificationService emailVerificationService) {
		super();
		this.userDao = userDao;
		this.emailVerificationService = emailVerificationService;
	}
	
	
	@Override
	public void add(User user) {
		if(user.getPassword().length() < 6) {
			
			System.out.println("Your password must be includes 6 or over 6 digits.");
			return;
		}
		else if(user.getFirstName().length() < 2) {
			
			System.out.println("Your first name must be contains 2 or over 2 digits.");
			return;
		}
		else if(user.getLastName().length() < 2) {
			
			System.out.println("Your last name must be contains 2 or over 2 digits.");
			return;
		}
		else if(this.emailVerificationService.validate(user.getEmail()) == false) {
			
			System.out.println("Your email is invalid!");
			return;
		}
		else if(email.contains(user.getEmail())) {
			
			System.out.println("Your email has been used.");
			return;
		}
		else {
			email.add(user.getEmail());
			System.out.println("Your verification code has been sent to your email address.");
			this.userDao.enter(user);
			this.userDao.link(user);
		}
		
	}

	@Override
	public void remove(User user) {
		this.userDao.remove(user);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}


}
