package fr.emile.chimical.entity;

public class Seller extends SalesDepartment {

	public Seller(String firstname, String lastname, int age, String date, double turnover) {
		super(firstname, lastname, age, date, turnover);
		// TODO Auto-generated constructor stub
	}




	//------------------------ constructor --------------
	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return  super.calculateSalary() + 400;
	}

	//----------- getter-Setter--------------------
	
	@Override
	public String toString() {
		return String.format("the seller %s", super.toString());
	}

}
