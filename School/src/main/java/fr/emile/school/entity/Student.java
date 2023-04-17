package fr.emile.school.entity;

public class Student extends Alien {
	private String section ;

	//------------------------ constructor --------------
	/**
	 * @param name
	 * @param year
	 * @param section
	 */
	public Student(String name, int year, String section) {
		super(name, year);
		this.setSection(section);
	}

	
	public Student(String name, int year) {
		this(name, year,"no-section");
		// TODO Auto-generated constructor stub
	}
	
	public boolean isStudent()  {
		return true ; 
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}


	@Override
	public String toString() {
		return String.format("%s\tstudent %s\n",super.toString(), getSection());
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
