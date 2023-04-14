package fr.emile.users.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User {

	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private Date dateOfBirth;
	private Set<Address> addressList;

	public User(String firstname, String lastname, String email, String password) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setEmail(email);
		this.setPassword(password);
		this.setDateOfBirth(dateOfBirth);
		this.addressList = new HashSet<Address>();
	}

	public User(String firstname, String lastname, String email) {
		this(firstname, lastname, email, "password-requiered");
	}

	public User() {
		this("firstname-requiered", "lastname-requiered", "email-requiered", "password-requiered");
	}

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Set<Address> getAddressList() {
		return addressList;
	}

	public void addAddress(Address address) {
		this.getAddressList().add(address);
	}

	public void setAddressList(Set<Address> addressList) {
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		return "[" + getFirstname() + " " + getLastname() + " " + getEmail() + "]";
	}

}
