package fr.emile.clients.main;

import fr.emile.clients.control.ClientControl;
import fr.emile.clients.entity.Account;
import fr.emile.clients.entity.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client1 = new Client("HUGO", "Victor");
		client1.addAccount(new Account((float)0.01,(float)1000, "Compte Principal" ));
		client1.addAccount(new Account( (float)0.02,(float)2000,"Compte d'épargne" ));

		
		Client client2 = new Client("CAMUS", "Albert");
		client2.addAccount(new Account( (float)0.01,(float)3000,"Compte Principal" ));
		client2.addAccount(new Account((float)0.02,(float)4000, "Compte d'épargne" ));
		client2.addAccount(new Account((float)0.12,(float)5654000, "Compte Black box" ));
		
		
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
		
		System.out.printf("décimal %.4f\n", 1/3.0);
		System.out.printf("décimal %.4f\n", 1.0);

		
	}

}
