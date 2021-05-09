package ETrade.core.verification;

import ETrade.entities.concretes.User;

public class EmailManager implements VerificationService {

	@Override
	public boolean sendMail(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()+" Kullan�c� kabul edildi");
		return true;
	}

}
