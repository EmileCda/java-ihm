package fr.emile.louche.entity;

public class Spoon extends CookingTool {

	public Spoon(float marketValue, int dateFrom) {
		super(marketValue, dateFrom);
		// TODO Auto-generated constructor stub
	}




	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------
	public float calculateValue() {

		return super.calculateValue() * 2; 
	}

	//----------- getter-Setter--------------------

}
