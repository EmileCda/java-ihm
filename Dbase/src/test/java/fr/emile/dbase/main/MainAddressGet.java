package fr.emile.dbase.main;

import java.util.List;

import fr.emile.dbase.entity.Address;
import fr.emile.dbase.model.dao.AddressDao;
import fr.emile.dbase.model.dao.IAddressDao;

public class MainAddressGet {

	public MainAddressGet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final IAddressDao myAddressDao = new AddressDao();
		List<Address>  addressList = null;
		Address myAddress = null; 
		try {
			addressList = myAddressDao.get(10);
			
			if (addressList != null) {
				for (Address oneAddress : addressList) {
					System.out.println(oneAddress);
				}
			}else
				System.out.println("addressList est vide\n");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
