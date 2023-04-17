package fr.emile.school.entity;

public class Secretary extends Staff {

	public Secretary(String name, int year, String lab, int salary) {
		super(name, year, lab, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Secretary : \n%s : ", super.toString());
//		return String.format("Teacher :\n%s\n\tTeaching section : %s",super.toString(), getSection());
	}

	// ---------------attribut ---------------------

	// ---------------conctructor ---------------------

	// ---------------processing methode ---------------------

	// ----------- getter-Setter--------------------

}
