package fr.emile.salary.entity;

public abstract class Worker {
	private String firstname;
	private String lastname;
	private int  age;
	private String date;
	//------------------------ constructor --------------
	/**
	 * @param firstname
	 * @param lastname
	 * @param age
	 * @param date
	 */
	public Worker(String firstname, String lastname, int age, String date) {
		super();
		this.setFirstname( firstname);
		this.setLastname(lastname);
		this.setAge(age);
		this.setDate(date);
	}
	
	
	public abstract double calculateSalary() ;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return String.format(
				"%s %s", 
				getFirstname(), getLastname());
	}

	
	
}
