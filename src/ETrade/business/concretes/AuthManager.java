package ETrade.business.concretes;

import ETrade.business.abstracts.AuthService;
import ETrade.business.abstracts.UserService;
import ETrade.business.validation.AuthValidation;
import ETrade.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;
	
	
	public AuthManager(UserService userService)
	{
		this.userService=userService;
	}
	


	@Override
	public void login(String email, String password) {
		
		if (!AuthValidation.emailPasswordValidation(email,password)) {
			System.out.println("Login Successful !");
			return;
		}
		else {
			System.out.println("Login  fail !");
		}
		
		
		
		
	}

	public void register(int id,String firstName, String lastName, String email, String password) {
		User user = new User(id, firstName, lastName, email, password);
		
		
		if (AuthValidation.userValidator(user)) {
			System.out.println("Register Successful !");
			return;
		}
		else {
			System.out.println("Register Fail !");
		}
		
		
		
	
		
		
		
		
	}

	

}
