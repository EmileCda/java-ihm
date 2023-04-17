package fr.emile.school.entity;

public class Staff extends Alien {

	private String lab;
	private int salary;
	
	public Staff(String name, int year, String lab, int salary) {
		super(name, year);
		this.setLab(lab);
		this.setSalary(salary);
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Staff %s lab=%s, %d€",super.toString(),  this.getLab(), this.getSalary());
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
