package fr.emile.dbase.main;


import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.User;
import fr.emile.dbase.model.dao.IUserDao;
import fr.emile.dbase.model.dao.UserDao;

public class MainUserDelete {

	public MainUserDelete() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final IUserDao myUserDao = new UserDao();
		User myUser = null; 
		try {
			myUserDao.delete(9);
			Utils.trace("Delete succed");
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
