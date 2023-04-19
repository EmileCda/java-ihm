package fr.emile.salary.entity;



public class RiskyTechnician extends Technician implements IRisky {

	public RiskyTechnician(String firstname, String lastname, int age, String date, int unit) {
		super(firstname, lastname, age, date, unit);
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
