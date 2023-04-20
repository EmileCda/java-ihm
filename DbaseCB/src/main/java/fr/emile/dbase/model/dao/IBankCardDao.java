package fr.emile.dbase.model.dao;

import java.util.List;

import fr.emile.dbase.entity.Address;
import fr.emile.dbase.entity.BankCard;
import fr.emile.dbase.entity.User;


public interface IBankCardDao {

	int add(BankCard bankCard) throws Exception; 
	BankCard get(int id) throws Exception;
	List<BankCard> get(User user) throws Exception;
	List<BankCard> get() throws Exception;
	int Update(BankCard bankCard, boolean isValid) throws Exception;
	int delete (BankCard bankCard)throws Exception;

}
	

