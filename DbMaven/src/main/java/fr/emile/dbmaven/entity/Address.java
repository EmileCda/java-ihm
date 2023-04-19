package fr.emile.dbmaven.entity;

public class Address {

	private int id ; 
	private String number ; 
	private String street ; 
	private String city ; 
	private String zipCode ;
	//------------------------ constructor --------------
	/**
	 * @param number
	 * @param street
	 * @param city
	 * @param zipCode
	 */
	public Address(String number, String street, String city, String zipCode) {
		this.setNumber(number);
		this.setStreet (street);
		this.setCity( city);
		this.setZipCode (zipCode);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	} 
	

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
