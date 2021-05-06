import business.abstracts.GoogleManagerService;
import business.abstracts.LogInService;
import business.abstracts.UserService;
import business.concretes.GoogleManager;
import business.concretes.LogInManager;
import business.concretes.UserManager;
import core.concretes.EmailVerificationManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		UserService userService = new UserManager(new HibernateUserDao(), new EmailVerificationManager());
		
		User user1 = new User(1, "Deniz", "Yazýcýoðlu", "denizbes46@gmail.com", "12345678");
		User user2 = new User(2, "Baran", "Baþaran", "baranvork1@hotmail.com", "1234567890");
		User user3 = new User(2, "Edward", "Caudwell", "example12345@gmail.com", "1234567890123");
		
		LogInService logInService = new LogInManager();
		
		GoogleManagerService googleManagerService = new GoogleManager();
		
		
		
		userService.add(user1);
		userService.remove(user2);
		googleManagerService.register(user3);
		userService.update(user3);
		
		logInService.login(user1, "denizbes46@gmail.com", "12345678");
		googleManagerService.logInWithGoogle(user1);

	}

}
