package fr.emile.clients.main;

import fr.emile.clients.control.ClientControl;
import fr.emile.clients.entity.Client;

public class Main {

	public static void main(String[] args) {

		Client client1 = new Client("HUGO", "Victor", 1000.00f, 0.01f, 2000.00f, 0.02f);
		Client client2 = new Client("CAMUS", "Albert", 3000.00f, 0.01f, 4000.00f, 0.02f);
		
		
		System.out.println("Solde actuel des comptes avant bouclage :");
		client1.displayBalance();
		client2.displayBalance();
		System.out.println("");
		System.out.println("Bouclage de tous les comptes :");
		ClientControl.UpdateAccount(client1);
		ClientControl.UpdateAccount(client2);

		System.out.println("");
		System.out.println("Solde de compte après bouclage:");
		client1.displayBalance();
		client2.displayBalance();
		

		
	}

}
