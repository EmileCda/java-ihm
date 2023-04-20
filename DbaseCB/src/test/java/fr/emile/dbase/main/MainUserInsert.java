package fr.emile.dbase.main;

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
		int id = -1 ;
		User myUser = null; 
		try {
			myUser = new User( "Zoerin", "grohli",Utils.string2Date("14071884","ddMMyyyy"));
			id= myUserDao.add(myUser);
			myUser.setId(id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.printf("Error add %s", myUser);
			
		}finally {
			System.out.printf("%s", myUser);
			
		}
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
