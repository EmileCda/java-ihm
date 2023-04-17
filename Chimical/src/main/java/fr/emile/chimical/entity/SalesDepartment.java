package fr.emile.chimical.entity;

public class SalesDepartment extends Worker {
	private double turnover ; 


	//------------------------ constructor --------------
	/**
	 * @param firstname
	 * @param lastname
	 * @param age
	 * @param date
	 * @param turnover
	 */
	public SalesDepartment(String firstname, String lastname, int age, String date, double turnover) {
		super(firstname, lastname, age, date);
		this.setTurnover(turnover);
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.getTurnover() *0.2;
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
