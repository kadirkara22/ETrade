package ETrade.core.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ETrade.core.dataAccess.abstracts.Repository;


public class BaseRepository <T> implements Repository<T>{

	private List<T> TArrayList;
	public BaseRepository() {
		
		this.TArrayList=new ArrayList<>();
	}
	
	
	@Override
	public List<T> getAll() {
		return this.TArrayList.stream().collect(Collectors.toList());
		
	}

	@Override
	public T get(int id) {
		return this.TArrayList.stream().findFirst().orElse(null);
		
	}

	@Override
	public void add(T entity) {
		TArrayList.add(entity);
		System.out.println("Added to Database !");
		
	}

	@Override
	public void delete(T entity) {
	TArrayList.remove(this.TArrayList.indexOf(entity));
	System.out.println("Deleted to Database !");
	}

	@Override
	public void update(T entity) {
		TArrayList.set(this.TArrayList.indexOf(entity), entity);
		System.out.println("Updated to Database !");
	}


	
}
