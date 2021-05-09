package ETrade.core.adapters;

import ETrade.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleService {

	@Override
	public void AuthToSystem(String message) {
		GoogleAuthManager auth=new GoogleAuthManager();
		auth.authWithGoogle(message);
	}

}
