package fr.emile.louche.entity;

public class SQuarePlate extends Plate {


	public SQuarePlate(float dimension, int dateFrom) {

		super(dimension,dateFrom);
	}


	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------
	@Override
	public double calculateSurface() {
		System.out.printf(" calculateSurface plate %.2f",this.getDimension() * this.getDimension());
		return this.getDimension() * this.getDimension();
	}


	@Override
	public String toString() {
		return String.format("square Plate side=%.2f  surface %.2f ", 
				this. getDimension(), this.calculateSurface());
	}



	//----------- getter-Setter--------------------

}
