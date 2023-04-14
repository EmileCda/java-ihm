package fr.emile.clients.entity;

public class Account {
	
	private float  rate ;
	private float  balance ;
	private String name;
	

	/**
	 * @param rate
	 * @param balance
	 */
	public Account(float rate, float balance, String name) {
		this.setRate(rate);
		this.setBalance(balance);
		this.setName(name);
	}

	public Account(float rate, float balance) {
		this(rate, balance,"account-noname");
	}
	
	// -----------------processing ---------------------------
	
	
	public void process () {
		
		
		this.setBalance(this.getBalance()*( 1+ this.getRate()));
		
	}
	
		
	
	/**
	 * getter / setter 
	 */

	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return String.format("\t-%s :  %.2f €\n", 
				getName(),
				getBalance());
	}
	
	
	

}
