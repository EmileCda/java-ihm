package fr.emile.vroum.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Définissez deux classes Voiture et Avion, héritant de la classe Vehicule et ayant les attributs
//supplémentaires suivants :
//‐ Pour la classe Voiture :
//cylindree, nbPortes, puissance et kilometrage
//‐ Pour la classe Avion :
//moteur et nbHeuresVol
public class Plane extends Vehicle {

	// ---------------attribut ---------------------
	private String enginType; // moteur 0 = propeller
	private int flightHour; // nbHeuresVol
	private float power; // nbHeuresVol

	// ---------------conctructor ---------------------
	public Plane(String brand, int yearOfPurchase, float purchasePrice, float currentPrice, String engineType,
			int flightHour, float power) {

		super(brand, yearOfPurchase, purchasePrice, currentPrice);
		this.setEnginType(engineType);
		this.setFlightHour(flightHour);
		this.setPower(power);

	}

	public Plane(int flightHour, String engineType, String brand, int yearOfPurchase, float purchasePrice) {
		this(brand, yearOfPurchase, purchasePrice, purchasePrice, engineType, flightHour, 0);

	}

	// ---------------processing methode ---------------------

	public void priceCalculate(int currentYear) {

		float discount = this.calulcateYearDiscount(currentYear);

		if (this.getEnginType().equals(EngineType.PROPELLER.toString())) { // type propeller

			discount += this.getFlightHour() / 1000f;
		} else {
			discount += this.getFlightHour() / 10000f;

		}
		this.setCurrentPrice((1 - discount) * this.getPurchasePrice());
//		this.setCurrentPrice(0);

	}

	public void display() {

		System.out.println(this);

	}

	// ----------- getter-Setter--------------------

	public String getEnginType() {
		return enginType;
	}

	public void setEnginType(String enginType) {
		this.enginType = enginType;
	}

	public int getFlightHour() {
		return flightHour;
	}

	public void setFlightHour(int flightHour) {
		this.flightHour = flightHour;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return String.format(
				"----------%s Plane ------------\nBrand = %s,  year Of Purchase = %d, current Price : %.1f\nflight Hour : %d\n",
				this.getEnginType(), this.getBrand(), this.getYearOfPurchase(), this.getCurrentPrice(),
				this.getFlightHour());

//		return String.format("%s Plane %s---Brand = %s,    flight Hour : %d\n",
//		String stringReturn = "" ;
////		
//		stringReturn+= String.format("%s Plane \nBrand = %s",	this.getEnginType(), this.getBrand());
//		stringReturn+= String.format("%d",	this.getYearOfPurchase());
//		stringReturn+= String.format("%f",	this.getCurrentPrice());
//		stringReturn+= String.format("%d",	this.getFlightHour());
//
//		return stringReturn;

	}

}
