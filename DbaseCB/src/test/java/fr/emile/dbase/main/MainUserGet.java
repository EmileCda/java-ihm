package fr.emile.dbase.main;

import java.util.List;

import fr.emile.Dbase.utils.Dates;
import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.User;
import fr.emile.dbase.model.dao.IUserDao;
import fr.emile.dbase.model.dao.UserDao;

public class MainUserGet {

	public MainUserGet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final IUserDao myUserDao = new UserDao();
		User myUser = null; 
		try {
			User user = myUserDao.get(10);
			System.out.println(user);
			
			System.out.println("========================");
			List<User> userList = myUserDao.get();
			
			if (userList != null) {
				for (User oneUser : userList) {
					System.out.println(oneUser);
				}
			}else
				System.out.println("userList est vide\n");
				
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
