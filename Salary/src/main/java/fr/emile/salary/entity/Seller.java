package fr.emile.salary.entity;

public class Seller extends SalesDepartement {

	public Seller(String firstname, String lastname, int age, String date, double turnover) {
		super(firstname, lastname, age, date, turnover);
		// TODO Auto-generated constructor stub
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------
//	@Override
//	public double calculateSalary() {
//		return this.getTurnover() *0.2;
//	}
	
	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return  this.getTurnover()* SELLER_WAGE_RATIO + 400;
	}

	//----------- getter-Setter--------------------
	
	@Override
	public String toString() {
		return String.format("the seller %s", super.toString());
	}
}
