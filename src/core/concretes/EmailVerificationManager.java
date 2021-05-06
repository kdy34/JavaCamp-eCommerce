package core.concretes;

import core.abstracts.EmailVerificationService;

import java.util.regex.Matcher;

import java.util.regex.Pattern;


public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public boolean validate(String mail) {
		
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = java.util.regex.Pattern.compile(emailRegex, java.util.regex.Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(mail);
		return matcher.find();
		
	}

}
