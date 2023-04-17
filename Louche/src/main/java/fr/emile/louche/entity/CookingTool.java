package fr.emile.louche.entity;

import java.util.Calendar;

public abstract class CookingTool {

	private float dimension;
	private int dateFrom;

	// ------------------------ constructor --------------
	/**
	 * 
	 * @param dateFrom
	 */
	public CookingTool(float marketValue, int dateFrom) {
		this.setDimension(marketValue);
		this.setDateFrom(dateFrom);
	}

	public float calculateValue() {

		Calendar  calendar = Calendar.getInstance();
		int yearToday = calendar.get(Calendar.YEAR);

		int howOld = yearToday-this.getDateFrom();
		
		if (howOld >50) {
			return howOld-50f;
		}

		return 0.0f;
	}
	
	
	public int getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(int dateFrom) {
		this.dateFrom = dateFrom;
	}

	public float getDimension() {
		return dimension;
	}

	public void setDimension(float dimension) {
		this.dimension = dimension;
	}

}
