package fr.emile.school.entity;

public class Secretary extends Staff {



	public Secretary(String name, int year, String lab, int salary) {
		super(name, year, lab, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("%s : Secretary",super.toString());
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
