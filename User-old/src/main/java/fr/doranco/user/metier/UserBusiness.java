package fr.doranco.user.metier;

import java.util.ArrayList;
import java.util.List;

import fr.doranco.user.entity.Adress;
import fr.doranco.user.entity.User;

public abstract class UserBusiness {

	private static List<User> userList = new ArrayList<User>();

	public static User getUserByEmail(String email) {

		for (User user : userList) {
			if (user.getEmail().equals(email)) {
				return user;
			}

		}

		return null;

	}

	public static List<User> getUsersByCity(String city) {

		List<User> userListReturned = new ArrayList<User>();
		for (User user : userList) {
			for (Adress adress : user.getAdresses()) {
				if (adress.getCity().equals(city))
					userListReturned.add(user);
				continue;

			}
		}

		return null;
	}

	public static void addUser(User user) {
		userList.add(user);

	}

}
