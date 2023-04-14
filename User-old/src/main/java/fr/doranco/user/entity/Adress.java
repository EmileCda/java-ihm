package fr.doranco.user.entity;

public class Adress {
	private String number;
	private String street;
	private String city;
	private String zipPostal;
	
	public Adress() {
	}


	public Adress(String number, String street, String city, String zipPostal) {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.zipPostal = zipPostal;
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


	public String getZipPostal() {
		return zipPostal;
	}


	public void setZipPostal(String zipPostal) {
		this.zipPostal = zipPostal;
	}

	
	
	
	
	
	
	
	
	

}
