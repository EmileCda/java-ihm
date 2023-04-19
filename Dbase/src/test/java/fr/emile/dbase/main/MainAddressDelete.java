package fr.emile.dbase.main;


import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.User;
import fr.emile.dbase.model.dao.AddressDao;
import fr.emile.dbase.model.dao.IAddressDao;
import fr.emile.dbase.model.dao.IUserDao;
import fr.emile.dbase.model.dao.UserDao;

public class MainAddressDelete {

	public MainAddressDelete() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final IAddressDao myAddressDao = new AddressDao();
		final int idAddress = 1;
		try {
			myAddressDao.delete(idAddress);
			Utils.trace("Delete succed");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.printf("Error add %s", idAddress);
			
		}
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
