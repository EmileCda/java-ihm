package fr.emile.clients.control;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import fr.emile.clients.entity.Account;
import fr.emile.clients.entity.Client;

public class ClientControl {
	
	public static void UpdateAccount(Client client) {
		
		List<Account> accountListProcessing = new ArrayList<Account>();
		accountListProcessing  = client.getAccountList();
		
		for (Account account : accountListProcessing) {
			
			account.process();
			
		}
	}

}
