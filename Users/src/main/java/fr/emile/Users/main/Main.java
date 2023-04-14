package fr.emile.Users.main;

import java.util.HashSet;
import java.util.Set;

import fr.emile.users.control.UserControl;
import fr.emile.users.entity.Address;
import fr.emile.users.entity.User;

public class Main {

	public static void main(String[] args) {
		
		User myUser = new User("emile","duboudin","emile@duboudin.com");
		Address oneAddress = new Address("12", "Rue Lafayette", "Paris", "75001");
		myUser.addAddress(oneAddress);
		myUser.addAddress(new Address("312", "Rue Lyette", "Marseille", "13001"));
		myUser.addAddress(new Address("9", "Rue ttitte", "Lilles", "59012"));
		
		UserControl.add(myUser);

		myUser = new User("lulu","deMarcel","lulu@rognogno.com");
		myUser.addAddress(new Address("1119", "Rue entity", "Lilles", "59012"));
		UserControl.add(myUser);

//		System.out.println(myUser);
		
		System.out.printf("user email found %s\n",UserControl.getUserByEmail("emile@duboudin.com"));
		Set<User> userList = new HashSet<User>();
		String city = "Marseille" ;
		userList = UserControl.getUserSetByCity(city);
		
		System.out.printf("user with address at %s\n",city);
		for (User user : userList) {
			System.out.printf("%s\n",user);
					
		}
	}

}
