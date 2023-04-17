package fr.emile.school.entity;

public class RegularStudent extends Student {
	private double prope1;

	//------------------------ constructor --------------
	/**
	 * @param name
	 * @param year
	 * @param section
	 * @param prope1
	 */
	public RegularStudent(String name, int year, String section, double prope1) {
		super(name, year, section);
		this.setPrope1(prope1);
	}


	public double getPrope1() {
		return this.prope1;
	}

	public void setPrope1(double prope1) {
		this.prope1 = prope1;
	}


	@Override
	public String toString() {
		return String.format("Regular Student:\n%s\tSection : %s\n \tPrope I: %s",super.toString(), this.getSection(),this.getPrope1());
	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
