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



public class Car extends Vehicle {

	// ---------------attribut ---------------------
	private float cylinder; // cylindree
	private int doorCount; // nbPortes
	private int power; // moteur
	private int mileAge; // kilometrage

	// ---------------conctructor ---------------------

//	Définissez maintenant un constructeur pour Voiture, ainsi qu'une méthode afficher() qui
//	affiche la valeur des attributs
//	Notez que pour le constructeur de Voiture, on fait appel au constructeur de Vehicule (classe
//			mère). On fait également appel à la méthode d'affichage de la super‐classe dans la
//			méthode afficher() de Voiture.


	
	//------------------------ constructor --------------
	
	public Car(float cylinder, int doorCount, int power, int mileAge,String brand, int yearOfPurchase, float purchasePrice, float currentPrice) {
		super(brand, yearOfPurchase, purchasePrice, currentPrice);
		this.setCylinder(cylinder);
		this.setDoorCount(doorCount);
		this.setPower(power);
		this.setMileAge(mileAge);

		// TODO Auto-generated constructor stub
	}


	public Car(float cylinder, int doorCount, int power, int mileAge,String brand, int yearOfPurchase, float purchasePrice) {
		
		this(cylinder,doorCount,  power,  mileAge, brand,  yearOfPurchase,  purchasePrice,  purchasePrice);
		
	}

	// ---------------processing methode ---------------------

	public void display() {

		System.out.println(this);

	}
	
	public float calulcateYearDiscount(int currentYear) {
		return  (float) ((currentYear-this.getYearOfPurchase()) * 0.02);
			
	}
	

	public void priceCalculate(int currentYear) {
		
		float discount =this. calulcateYearDiscount(currentYear);
		discount += (this.getMileAge()/10000)*0.05;
		
		if (this.getBrand().equals(VehicleBrand.FIAT.toString()) ||this.getBrand().equals(VehicleBrand.RENAULT.toString())){
			discount += 0.1 ;
		}else if (this.getBrand().equals(VehicleBrand.FERRARI.toString()) ||this.getBrand().equals(VehicleBrand.PORSHE.toString())){
			discount -= 0.2 ;
			
		}
		
		this.setCurrentPrice((1-discount)*this.getPurchasePrice());
		
	}


	// ----------- getter-Setter--------------------

	public float getCylinder() {
		return cylinder;
	}

	public void setCylinder(float cylinder) {
		this.cylinder = cylinder;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMileAge() {
		return mileAge;
	}

	public void setMileAge(int mileAge) {
		this.mileAge = mileAge;
	}

	public int getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}

//	Définissez maintenant un constructeur pour Voiture, ainsi qu'une méthode afficher() qui
//	affiche la valeur des attributs.
////	Notez que pour le constructeur de Voiture, on fait appel au constructeur de Vehicule (classe
//	mère). On fait également appel à la méthode d'affichage de la super‐classe dans la
//	méthode afficher() de Voiture.

	@Override
	public String toString() {
		return String.format("------ Car %s------------\n Brand = %s, year Of Purchase = %d, currentPrice = %f\n Cylinder : %.1f, door count : %d, Power : %d, Mile age : %d\n",
				this.getBrand(),this.getBrand(),this.getYearOfPurchase(),this.getCurrentPrice(), this.getCylinder(), 
				this.getDoorCount(),this.getPower(), this.getMileAge());
	}

}
