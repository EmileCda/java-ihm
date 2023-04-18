package fr.emile.salary.entity;

public class WarehouseWorker extends Worker {
	private int hourCount ;
	

	//------------------------ constructor --------------
	/**
	 * @param firstname
	 * @param lastname
	 * @param age
	 * @param date
	 * @param hourCount
	 */
	public WarehouseWorker(String firstname, String lastname, int age, String date, int hourCount) {
		super(firstname, lastname, age, date);
		this.setHourCount(hourCount);
	}




	public int getHourCount() {
		return hourCount;
	}


	public void setHourCount(int hourCount) {
		this.hourCount = hourCount;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.getHourCount() * 65 ; 
	}

	//----------- getter-Setter--------------------
	@Override
	public String toString() {
		return String.format("the warehouse worker %s", super.toString());
	}

}
