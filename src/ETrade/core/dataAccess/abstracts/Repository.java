package ETrade.core.dataAccess.abstracts;

import java.util.List;



public interface Repository<T>{

	List<T> getAll();
	T get(int id);
	void add(T entity);
	void delete(T entity);
	void update(T entity);
}
