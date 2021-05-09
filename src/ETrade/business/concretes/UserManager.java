package ETrade.business.concretes;

import java.util.List;

import ETrade.business.abstracts.UserService;
import ETrade.business.validation.AuthValidation;
import ETrade.core.verification.VerificationService;
import ETrade.dataAccess.abstracts.UserDao;
import ETrade.entities.concretes.User;

public class UserManager implements UserService {

   private	UserDao userDao;
   private VerificationService verificationService;
	public UserManager(	UserDao userDao,VerificationService verificationService) {
		this.userDao=userDao;
		this.verificationService=verificationService;
	}
	
	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public void add(User user) {
		if (!AuthValidation.userValidator(user)) {
			return;
		}
		else if (verificationService.sendMail(user)) {
			userDao.add(user);
		}
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

}
