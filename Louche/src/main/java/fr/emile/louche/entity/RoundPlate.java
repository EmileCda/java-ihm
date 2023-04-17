package fr.emile.louche.entity;

public class RoundPlate extends Plate {
	

	public RoundPlate(float marketValue, int dateFrom, float diameter) {
		super(marketValue, dateFrom);
		
	}

	public RoundPlate(float marketValue, int dateFrom ) {
		this (marketValue, dateFrom,0);
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	@Override
	public double calculateSurface() {
		return  this.getDimension()*this.getDimension()*Math.PI ;
	}

	@Override
	public String toString() {
		return String.format("Round Plate diameter=%.2f  surface %.2f ", 
				this. getDimension(), this.calculateSurface());
	}




	//----------- getter-Setter--------------------

}
