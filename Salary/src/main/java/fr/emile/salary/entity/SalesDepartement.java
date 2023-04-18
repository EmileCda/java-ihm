package fr.emile.salary.entity;

public abstract class SalesDepartement extends Worker implements ISalary {

	
	private double turnover ;
	
	
	//------------------------ constructor --------------
	/**
	 * @param firstname
	 * @param lastname
	 * @param age
	 * @param date
	 * @param turnover
	 */
	public SalesDepartement(String firstname, String lastname, int age, String date, double turnover) {
		super(firstname, lastname, age, date);
		this.setTurnover(turnover);
	}


	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
