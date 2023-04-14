package fr.emile.vroum.entity;



import fr.emile.vroum.enums.VehicleBrand;

//Définissez deux classes Voiture et Avion, héritant de la classe Vehicule et ayant les attributs
//supplémentaires suivants :
//‐ Pour la classe Voiture :
//cylindree, nbPortes, puissance et kilometrage
//‐ Pour la classe Avion :
//moteur et nbHeuresVol



public class Car extends Vehicle {

	// ---------------attribut ---------------------
	private float displacement; // cylindree
	private int doorCount; // nbPortes
	private int horsePower; // moteur
	private int mileAge; // kilometrage

	// ---------------conctructor ---------------------

//	Définissez maintenant un constructeur pour Voiture, ainsi qu'une méthode afficher() qui
//	affiche la valeur des attributs
//	Notez que pour le constructeur de Voiture, on fait appel au constructeur de Vehicule (classe
//			mère). On fait également appel à la méthode d'affichage de la super‐classe dans la
//			méthode afficher() de Voiture.


	
	//------------------------ constructor --------------
	
	public Car(float displacement, int doorCount, int horsePower, int mileAge,String brand, int yearOfPurchase, float purchasePrice, float currentPrice) {
		super(brand, yearOfPurchase, purchasePrice, currentPrice);
		this.setDisplacement(displacement);
		this.setDoorCount(doorCount);
		this.setHorsePower(horsePower);
		this.setMileAge(mileAge);

	}


	public Car(float displacement, int doorCount, int horsePower, int mileAge,String brand, int yearOfPurchase, float purchasePrice) {
		
		this(displacement,doorCount,  horsePower,  mileAge, brand,  yearOfPurchase,  purchasePrice,  purchasePrice);
		
	}

	// ---------------processing methode ---------------------

	
	public float calulcateYearDiscount(int currentYear) {
		return  (float) ((currentYear-this.getYearOfPurchase()) * 0.02);
			
	}
	

	public void priceCalculate(int currentYear) {
		
		float discount = this.calulcateYearDiscount(currentYear);
		discount += (this.getMileAge()/10000)*0.05;
		
		if (this.getBrand().equals(VehicleBrand.FIAT.getValue()) ||this.getBrand().equals(VehicleBrand.RENAULT.getValue())){
			discount += 0.1f ;
		}else if (this.getBrand().equals(VehicleBrand.FERRARI.getValue()) ||this.getBrand().equals(VehicleBrand.PORSHE.getValue())){
			discount -= 0.2f ;
			
		}
		
		this.setCurrentPrice((1-discount)*this.getPurchasePrice());
		
	}


	// ----------- getter-Setter--------------------

	public float getDisplacement() {
		return displacement;
	}

	public void setDisplacement(float displacement) {
		this.displacement = displacement;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
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

	
	public String toString() {
		
		String stringReturn = String.format("------ Car %s------------\n",this.getBrand());
		
		stringReturn += super.toString();
		
		stringReturn += String.format("Cylinder : %.1f, door count : %d, Horse Power : %d, Mile age : %d\n", 
				this.getDisplacement(), 
				this.getDoorCount(),this.getHorsePower(), this.getMileAge());
		
		return stringReturn;
	}

}
