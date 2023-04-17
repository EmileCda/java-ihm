package fr.emile.ustensile.entity;

public class Ustensile {
	private int annee ;
	private double dimension ;

	
	public Ustensile() {
		// TODO Auto-generated constructor stub
	}


	//------------------------ constructor --------------
	/**
	 * @param annee
	 * @param dimension
	 */
	public Ustensile(int annee, double dimension) {
		super();
		this.getAnnee(annee);
		this.getDimension( dimension);
	}


	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}


	public double getDimension() {
		return dimension;
	}


	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
