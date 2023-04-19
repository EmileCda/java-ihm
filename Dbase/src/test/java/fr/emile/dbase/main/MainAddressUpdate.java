package fr.emile.dbase.main;

import java.util.List;

import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.Address;
import fr.emile.dbase.model.dao.AddressDao;
import fr.emile.dbase.model.dao.IAddressDao;

public class MainAddressUpdate {

	public MainAddressUpdate() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		final IAddressDao myAddressDao = new AddressDao();
		List<Address>  addressList = null;   
		final int userId = 10 ;
		try {
			addressList = myAddressDao.get(userId);
			Address firstAddress = addressList.get(0);
			firstAddress.setCity("City-mod");
			Utils.trace(firstAddress.toString());
			myAddressDao.Update(firstAddress);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
