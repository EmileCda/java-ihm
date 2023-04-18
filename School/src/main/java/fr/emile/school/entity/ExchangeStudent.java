package fr.emile.school.entity;

public class ExchangeStudent extends Student {
	private String originSchool; 
	
//------------------------ constructor --------------
	/**
	 * @param name
	 * @param year
	 * @param section
	 * @param originSchool
	 */
	public ExchangeStudent(String name, int year, String section, String originSchool) {
		super(name, year, section);
		this.setOriginSchool(originSchool);
	}



	public String getOriginSchool() {
		return originSchool;
	}

	public void setOriginSchool(String originSchool) {
		this.originSchool = originSchool;
	}

	@Override
	public String toString() {
		return String.format("Exchange Student:\n%s \torigin University : %s",
						super.toString(), 
						this.getOriginSchool());
						
	}

}
