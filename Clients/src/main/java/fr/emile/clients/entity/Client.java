package fr.emile.clients.entity;

public class Client {

	private String firstname;
	private String lastname;
	private Account account1;
	private Account account2;

//	------------ constructor -----------------

//--------- getter setter ----------------------	
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 * @param lastname
	 * @param rate1
	 * @param rate2
	 * @param balance1
	 * @param balance2
	 */
	public Client(	String lastname,
					String firstname, 
					float balance1,
					float rate1,  
					float balance2, 
					float rate2) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.setAccount1(new Account(rate1, balance1));
		this.setAccount2(new Account(rate2, balance2));

	}

	//------------------------ constructor --------------
	/**
	 * @param firstname
	 * @param lastname
	 */
	public Client(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	
	public Account getAccount1() {
		return account1;
	}

	public void setAccount1(Account account1) {
		this.account1 = account1;
	}

	public Account getAccount2() {
		return account2;
	}

	public void setAccount2(Account account2) {
		this.account2 = account2;
	}

	public void displayBalance() {
		System.out.printf("=> Client : %s %s  \n\t-Compte Principal : %.2f €\n\t-Compte d'épargne : %.2f €\n",
				this.getFirstname(), this.getLastname(), this.getAccount1().getBalance(),
				this.getAccount2().getBalance());

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
		return String.format("Client [%s %s  R1:%.2f, B1:%.2f, R2%.2f, B2%.2f]", 
				getFirstname(), getLastname(),
				this.getAccount1().getRate(),
				this.getAccount1().getBalance(),
				this.getAccount2().getRate(),
				this.getAccount2().getBalance());

	}


}
