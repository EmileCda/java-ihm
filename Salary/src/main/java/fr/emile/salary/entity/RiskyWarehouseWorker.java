package fr.emile.salary.entity;



public class RiskyWarehouseWorker extends WarehouseWorker implements IRisky {

	public RiskyWarehouseWorker(String firstname, String lastname, int age, String date, int hourCount) {
		super(firstname, lastname, age, date, hourCount);
		// TODO Auto-generated constructor stub
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary()+ IRisky.bonus; 
	}

	//----------- getter-Setter--------------------

}
