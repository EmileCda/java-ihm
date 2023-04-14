package fr.emile.clients.control;

import fr.emile.clients.entity.Account;
import fr.emile.clients.entity.Client;

public class ClientControl {
	
	public static void UpdateAccount(Client client) {
		
		Account accountProcessing = client.getAccount1();
		accountProcessing.process();
		
		client.setAccount1(	accountProcessing);

		accountProcessing = client.getAccount2();
		accountProcessing.process();

		client.setAccount2(	accountProcessing);
	}

}
