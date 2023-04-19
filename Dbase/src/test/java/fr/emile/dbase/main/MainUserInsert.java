package fr.emile.dbase.main;

import fr.emile.Dbase.utils.Dates;
import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.User;
import fr.emile.dbase.model.dao.IUserDao;
import fr.emile.dbase.model.dao.UserDao;

public class MainUserInsert {

	public MainUserInsert() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final IUserDao myUserDao = new UserDao();
		User myUser = null; 
		try {
			myUser = new User( "Marvin", "Gayle",Dates.convertStringToDate("15/12/1975"));
			myUserDao.add(myUser);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.printf("Error add %s", myUser);
			
		}
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
