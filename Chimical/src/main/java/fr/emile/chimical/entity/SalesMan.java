package fr.emile.chimical.entity;

public class SalesMan extends SalesDepartment {

	public SalesMan(String firstname, String lastname, int age, String date, double turnover) {
		super(firstname, lastname, age, date, turnover);
		// TODO Auto-generated constructor stub
	}


	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return  super.calculateSalary() + 800;
	}

	//----------- getter-Setter--------------------
	@Override
	public String toString() {
		return String.format("the salesman %s", super.toString());
	}

}
