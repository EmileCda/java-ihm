package fr.emile.school.entity;

public class School {

	private int nbStudent;
	private int total;
	private Alien peuple[];
	public final static int YEAR = 2012;

	// ------------------------ constructor --------------
	/**
	 * @param nbStudent
	 */
	public School(int nbPeuple) {

		this.peuple = new Alien[nbPeuple];
		this.setNbStudent(0);
		this.setTotal(0);
	}

	public void add(Alien person) {

		if (this.getTotal() < this.getPeuple().length) {

			this.peuple[this.getTotal()] = person;
			this.setTotal(this.getTotal() + 1);

			if (person.isStudent()) {
				this.setNbStudent(this.getNbStudent() + 1);
			}

		}

	}

	public void displayStat() {
		
		for (int index = 0; index < this.getPeuple().length; index++) {
			this.setTotal(this.getTotal() + (YEAR - peuple[index].getYear()));

		}
		System.out.printf("Among %d Alien, %d are students.\n", this.getPeuple().length, this.getNbStudent());
		double average= (double) this.getTotal() /this.getPeuple().length ;
		System.out.printf("hey have been here on average %.2f years\n",average );
	}
	
	
	public void displayAlien() {
		
		System.out.println("Alien List");
		
		for (int index =  0 ; index < this.getPeuple().length; index ++) {
			System.out.printf("%s\n",this.getPeuple()[index].toString());		}
		
	}

	public int getNbStudent() {
		return nbStudent;
	}

	public void setNbStudent(int nbStudent) {
		this.nbStudent = nbStudent;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Alien[] getPeuple() {
		return peuple;
	}

	// ---------------attribut ---------------------

	// ---------------conctructor ---------------------

	// ---------------processing methode ---------------------

	// ----------- getter-Setter--------------------

}
