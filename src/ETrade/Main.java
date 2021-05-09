package ETrade;

import ETrade.business.concretes.AuthManager;
import ETrade.business.concretes.UserManager;
import ETrade.core.verification.EmailManager;
import ETrade.dataAccess.concretes.InMemoryUserDao;
import ETrade.googleAuth.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		
		
		AuthManager authManager=new AuthManager(new UserManager(new InMemoryUserDao(),new EmailManager()));
           authManager.register(1,"Kadir","Kara","kadir@kadir.com","123456");
           
           System.out.println("-------------------------------");
           
           authManager.login("kadir@kadir.com", "12345a");
           
           System.out.println("-------------------------------");
           
           GoogleAuthManager googleAuthManager = new GoogleAuthManager();
   		        googleAuthManager.authWithGoogle("Tebrikler");
   		              System.out.println("-------------------------------");
           
	}

}
