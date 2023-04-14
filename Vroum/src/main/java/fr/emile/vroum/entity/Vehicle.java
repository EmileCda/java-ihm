package fr.emile.vroum.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//1. Définissez une classe Vehicule qui a pour attributs des informations valables pour tout type de
//véhicule : sa marque, son année d'achat, son prix d'achat et son prix courant. 
//Vous devez vous assurer de la bonne encapsulation de ces attributs.

public abstract class Vehicle {

	// ---------------attribut ---------------------
	private String brand; // sa marque,

	private int yearOfPurchase; // son année d'achat
	private float purchasePrice; // , son prix d'achat
	private float currentPrice; // et son prix courant

	// ------------------------ constructor --------------
	/**
	 * @param brand
	 * @param yearOfPurchase
	 * @param purchasePrice
	 * @param currentPrice
	 */
	public Vehicle(String brand, int yearOfPurchase, float purchasePrice, float currentPrice) {
		this.setBrand(brand);
		this.setYearOfPurchase(yearOfPurchase);
		this.setPurchasePrice(purchasePrice);
		this.setCurrentPrice(currentPrice);
	}

//	Définissez un constructeur prenant en paramètres la marque, la date d'achat et le prix d'achat
	public Vehicle(String brand, int yearOfPurchase, float purchasePrice) {
		this(brand, yearOfPurchase, purchasePrice, purchasePrice);
	}

	// ---------------processing methode ---------------------

	public abstract void priceCalculate(int currentYear);
//	{
//	
//		float discount = (currentYear-this.getYearOfPurchase()) * 0.01f;
//		this.setCurrentPrice((1-discount)*this.getPurchasePrice());
//		
//	}
	
	public float calulcateYearDiscount(int currentYear) {
		return (currentYear-this.getYearOfPurchase()) * 0.01f;
			
	}
	
//	Définissez une méthode publique afficher() qui affiche la valeur des attributs.

	public void display() {
		System.out.println(this);

	}

	// ----------- getter-Setter--------------------
	// Vous devez vous assurer de la bonne encapsulation de ces attributs.
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYearOfPurchase() {
		return yearOfPurchase;
	}

	public void setYearOfPurchase(int yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}

	public float getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public float getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(float currentPrice) {
		if (currentPrice <0 ) {
			currentPrice = 0 ; 
		}
		this.currentPrice = currentPrice;
	}

	@Override
	public String toString() {
		return String.format("Vehicle %s %d P-price :%.2f C-price :%.2f", getBrand(), getYearOfPurchase(),
				getPurchasePrice(), getCurrentPrice());
	}

}
