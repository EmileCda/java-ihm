package fr.emile.dbase.main;

import fr.emile.Dbase.utils.Dates;
import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.User;
import fr.emile.dbase.model.dao.IUserDao;
import fr.emile.dbase.model.dao.UserDao;

public class MainUserUpdate {


	public static void main(String[] args) {
		try {
			IUserDao userDao = new UserDao();
			User user = userDao.get(10);
			user.setFirstname("Papa");
			user.setLastname("Noel");
			user.setDateOfBirth(Dates.convertStringToDate("25/12/0001"));
			Utils.trace(user.toString()	);
//			userDao.Update(user);
			userDao.Update(user);
			Utils.trace("update ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
