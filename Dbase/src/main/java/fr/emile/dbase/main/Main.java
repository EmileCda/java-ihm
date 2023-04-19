package fr.emile.dbase.main;

import fr.emile.Dbase.utils.Dates;
import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.User;
import fr.emile.dbase.model.dao.IUserDao;
import fr.emile.dbase.model.dao.UserDao;

public class Main {

	public static void main(String[] args) {

		final IUserDao myUserDao = new UserDao();
		Utils.trace("titi");
		User myUser = null; 
		try {
//			User myUser = new User(-1, "firstName", "lastname",(java.util.Date) Dates.convertStringToDate("25/12/1960"));
			myUser = new User( "Jonh", "Doe",Dates.convertStringToDate("25/05/1968"));
			myUserDao.add(myUser);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.printf("Error add %s", myUser);
			
		}
	}

}
