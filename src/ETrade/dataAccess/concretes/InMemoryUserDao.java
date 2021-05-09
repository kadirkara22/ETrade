package ETrade.dataAccess.concretes;

import ETrade.core.dataAccess.concretes.BaseRepository;
import ETrade.dataAccess.abstracts.UserDao;
import ETrade.entities.concretes.User;

public class InMemoryUserDao extends BaseRepository <User> implements UserDao {



}
