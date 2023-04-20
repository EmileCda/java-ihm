package fr.emile.dbase.entity;

import java.util.ArrayList;
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
	public User(int id, String firstname, String lastname, Date dateOfBirth) {
		this.setId(id);
		this.setFirstname(firstname);
		this.setLastname ( lastname);
		this.setDateOfBirth ( dateOfBirth);
		addressList = new ArrayList<Address>(); 

	}
	public User() {
		this(-1,"no-firstname", "no-lastanem",new Date());
	}
	
	public User(String firstname, String lastname, Date dateOfBirth) {
		this(-1,firstname, lastname,dateOfBirth);
		// TODO Auto-generated constructor stub
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
	public void addAddress(Address address) {
		this.addressList.add(address);
	}
	public void addAddress(List<Address> addressList) {
		this.addressList = addressList;
	}
	@Override
	public String toString() {
		
		String result = String.format(
				"id %d=> %s %s birthday %s\n",
				getId(), getFirstname(), getLastname(), getDateOfBirth());
	
		
		for (Address address : addressList) {
			result += "\t"+ address.toString() + "\n";
		}
		
		return result ;
		
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
