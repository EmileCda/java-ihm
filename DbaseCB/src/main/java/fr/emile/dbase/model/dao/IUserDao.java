package fr.emile.dbase.model.dao;
import java.util.List;

import fr.emile.dbase.entity.User;

public interface IUserDao {
	
	int add(User user) throws Exception;
	User get(int id) throws Exception;
	List<User> get() throws Exception;
	void Update(User user)throws Exception;
	void delete (int id)throws Exception;

}
