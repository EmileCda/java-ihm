package fr.emile.vroum.enums;

public enum VehicleBrand {
	FIAT ("Fiat"), 
	RENAULT("Renault"), 
	FERRARI("Ferrari"), 
	PORSHE("Porsche"), 
	PEUGEOT("Peugeot"), 
	CESSNA_PLANE("Cessna aircraft"), 
	UNKNOW_PLANE("unknow plane");
	
	private String brand ;

	//------------------------ constructor --------------
	/**
	 * @param brand
	 */
	private VehicleBrand(String brand) {
		this.brand = brand;
	}
	
	public String getValue() {
		return this.brand;
	}
	
}
