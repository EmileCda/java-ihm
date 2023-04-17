package fr.emile.school.entity;

public class Teacher extends Staff {
	//------------------------ constructor --------------
	/**
	 * @param name
	 * @param year
	 * @param lab
	 * @param salary
	 * @param section
	 */
	public Teacher(String name, int year, String lab, int salary, String section) {
		super(name, year, lab, salary);
		this.setSection(section);;
	}


	private String section ;
	


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	@Override
	public String toString() {
		return String.format("Teacher :\n%s\n\tTeaching section : %s",super.toString(), getSection());
	}



	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
