package fr.emile.chimical.entity;

public class Technician extends Worker {

	private int unit ; 


	//------------------------ constructor --------------
	public Technician(String firstname, String lastname, int age, String date, int unit) {
		super(firstname, lastname, age, date);
		this.unit = unit;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.getUnit() * 5 ; 
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------
	@Override
	public String toString() {
		return String.format("the tecnician %s", super.toString());
	}

}
