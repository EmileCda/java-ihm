package fr.emile.vroum.enums;

public enum EngineType {
	PROPELLER ("Propeller"),
	JET_ENGINE ("Jet Engine");
	
	
	
	private String name ;

	//------------------------ constructor --------------
	/**
	 * @param brand
	 */
	private EngineType(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return this.name;
	}
		
}