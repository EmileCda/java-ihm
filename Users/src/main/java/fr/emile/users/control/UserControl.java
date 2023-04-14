package fr.emile.users.control;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.emile.users.entity.Address;
import fr.emile.users.entity.User;

public class UserControl {

	private static List<User> userList = new ArrayList<User>();

	public UserControl() {

		UserControl.userList = new ArrayList<User>();
		// TODO Auto-generated constructor stub
	}

	public static void add(User user) {
		userList.add(user);

	}

	public static Set<User> getUserSetByCity(String city) {
		Set<User> userSetFound = new HashSet<User>();

		for (User user : userList) {

			Set<Address> userAddressList = new HashSet<Address>();
			userAddressList = user.getAddressList();
			for (Address userAddress : userAddressList) {
				if (userAddress.getCity().equals(city)) {
					userSetFound.add(user);
					break;
				}

			}

		}

		return userSetFound;
	}

	public static User getUserByEmail(String email) {
		User userReturn = null;
		for (User user : userList) {
			if (user.getEmail().equals(email)) {
				System.out.print(user);
				System.out.println("email found");
				return user;
			}
			
		}
		System.out.println("email no found");
		return userReturn;
	}
}
