package fr.emile.dbase.model.dao;

import java.util.List;

import fr.emile.dbase.entity.Address;
import fr.emile.dbase.entity.User;


public interface IAddressDao {

	int add(Address address) throws Exception; 
	List<Address> get(int userId) throws Exception;
	List<Address> get(User user) throws Exception;
	List<Address> get() throws Exception;
	void Update(Address address)throws Exception;
	void delete (int id)throws Exception;

}
	

