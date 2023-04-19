package fr.emile.dbmaven.entity;

import java.util.Date;
import java.util.List;

public class User {
	private int id ; 
	private String firstname ; 
	private String lastname ; 
	private Date dateOfBirth ; 
	private List<Address> addressList ;

	
	
	


	//------------------------ constructor --------------
	/**
	 * @param firstname
	 * @param lastname
	 * @param dateOfBirth
	 */
	public User(String firstname, String lastname, Date dateOfBirth) {
		this.setFirstname(firstname);
		this.setLastname ( lastname);
		this.setDateOfBirth ( dateOfBirth);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	private void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	@Override
	public String toString() {
		return String.format(
				"User [getId()=%s, getFirstname()=%s, getLastname()=%s, getDateOfBirth()=%s, getAddressList()=%s]",
				getId(), getFirstname(), getLastname(), getDateOfBirth(), getAddressList());
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
