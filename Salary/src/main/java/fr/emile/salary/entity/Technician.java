package fr.emile.salary.entity;

public class Technician extends Worker {
	
	private int unit ; 


	//------------------------ constructor --------------
	/**
	 * @param firstname
	 * @param lastname
	 * @param age
	 * @param date
	 * @param unit
	 */
	public Technician(String firstname, String lastname, int age, String date, int unit) {
		super(firstname, lastname, age, date);
		this.setUnit(unit);
	}

	@Override
	public double calculateSalary() {
		return this.getUnit() * 5 ; 
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}


	@Override
	public String toString() {
		return String.format("the technician %s", super.toString());
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
