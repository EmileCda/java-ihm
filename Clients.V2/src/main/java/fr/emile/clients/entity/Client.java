package fr.emile.clients.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String firstname;
	private String lastname;
	List<Account> accountList;

//	------------ constructor -----------------

	/**
	 * @param firstname
	 * @param lastname
	 * @param rate1
	 * @param rate2
	 * @param balance1
	 * @param balance2
	 */
	public Client(String lastname, String firstname ) {

		this.firstname = firstname;
		this.lastname = lastname;
		accountList= new ArrayList<Account>();
		
		

	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void addAccount(Account newAccount) {
		this.getAccountList().add(newAccount);
	}

	public String displayAccount() {
		String stringReturn = "";
		List<Account> accountListForLoop= new ArrayList<Account>();
		accountListForLoop= this.getAccountList();
		for (Account account : accountListForLoop) {
			stringReturn += account.toString();
		
		}

		return stringReturn;
	}

	public void displayBalance() {
		System.out.printf("=> Client : %s %s  \n%s\n", 
				this.getFirstname(), 
				this.getLastname(), 
				this.displayAccount());

	}

	//--------- getter setter ----------------------	
		public String getFirstname() {
			return firstname;
		}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return String.format("Client [%s %s %s ]", getFirstname(), getLastname(),
				this.displayAccount());

	}

}
