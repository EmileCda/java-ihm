package fr.emile.dbase.main;

import fr.emile.Dbase.utils.Dates;
import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.Address;
import fr.emile.dbase.model.dao.AddressDao;
import fr.emile.dbase.model.dao.IAddressDao;

public class MainAddressInsert {

	public MainAddressInsert() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		final IAddressDao myAddressDao = new AddressDao();
		final int userId = 12 ;
		Address myAddress = null; 
		try {
			myAddress = new Address( "85","boulevard de la ruelle","grosactic","00190",userId);
			myAddressDao.add(myAddress);
			Utils.trace(myAddress.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.printf("Error add %s", myAddress);
			
		}

	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
