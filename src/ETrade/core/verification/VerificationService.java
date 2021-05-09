package ETrade.core.verification;

import ETrade.entities.concretes.User;

public interface VerificationService {
	boolean sendMail(User user);
}
