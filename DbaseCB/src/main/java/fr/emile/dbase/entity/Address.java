package fr.emile.dbase.entity;

public class Address {

	// ---------------attribut ---------------------
	private int id;
	private String number;
	private String street;
	private String city;
	private String zipCode;
	private int idUser;

	// ------------------------ constructor --------------
	/**
	 * @param number
	 * @param street
	 * @param city
	 * @param zipCode
	 */
	public Address(int id, String number, String street, String city, String zipCode, int idUser) {
		this.setId(id);
		this.setNumber(number);
		this.setStreet(street);
		this.setCity(city);
		this.setZipCode(zipCode);
		this.setIdUser(idUser);
	}

	public Address(String number, String street, String city, String zipCode) {
		this(-1, number, street, city, zipCode, -1);
	}

	public Address(String number, String street, String city, String zipCode, int iduser) {
		this(-1, number, street, city, zipCode, iduser);
	}
	
	
	

	// ---------------processing methode ---------------------

	// ----------- getter-Setter--------------------

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

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Override
	public String toString() {
		return String.format(
				"Id:%d =>%s,%s %s %s =>userId [%d]",
				getId(), getNumber(), getStreet(),getZipCode(), getCity(),  getIdUser());
	}






}
