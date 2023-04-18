package fr.emile.school.entity;


public class Alien {
	
	private String name; 
	private int year;

	//------------------------ constructor --------------
	/**
	 * @param name
	 * @param year
	 */
	public Alien(String name, int year) {
		this.setName(name);
		this.setYear(year);
	} 

	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public boolean isStudent()  {
		return false ; 
	}


	@Override
	
	
	public String toString() {
		
		return String.format("\tName : %s\n\tYear : %d\n", getName(), getYear());
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
