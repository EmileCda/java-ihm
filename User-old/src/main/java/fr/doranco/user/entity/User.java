package fr.doranco.user.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User {
	private String lastname;
	private String fistname;
	private String email;
	private String password; // for the moment, next while be encrypted
	private Date bornDate;
	private Set<Adress> adresses;  // convention adresses au pluriel
	
	// bonne pratique : il faut toujours déclarer l'interface (ici Set) et au moment 
	// de l'instanciation faire un new de l'object voulu (new HashSet)
	

//---------------	constructor ----------------------------------------- 
	
	public User() {
		
		this.adresses = new HashSet<Adress>();
	}


//---------------	setter getter ----------------------------------------
	
	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getFistname() {
		return fistname;
	}


	public void setFistname(String fistname) {
		this.fistname = fistname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getBornDate() {
		return bornDate;
	}


	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}


	public Set<Adress> getAdresses() {
		return adresses;
	}



	

	
	
	
	
	

}
