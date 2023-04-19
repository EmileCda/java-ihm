package fr.emile.louche.entity;


public abstract class Plate extends CookingTool {

	public Plate(float marketValue, int dateFrom) {
		super(marketValue, dateFrom);

	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------
	public abstract  double calculateSurface();
	

	public float calculateValue() {
		return super.calculateValue() * 5; 
	}
	//----------- getter-Setter--------------------

}
