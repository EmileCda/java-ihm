package fr.emile.vroum.control;

import fr.emile.vroum.entity.Car;
import fr.emile.vroum.entity.EngineType;
import fr.emile.vroum.entity.Plane;
import fr.emile.vroum.entity.Vehicle;
import fr.emile.vroum.entity.VehicleBrand;

public class VehicleControl {

	public VehicleControl() {
		// TODO Auto-generated constructor stub
	}

	public static void ZpriceCalculate(Vehicle myVehicle, int currentYear) {

		float discount = (currentYear - myVehicle.getYearOfPurchase()) * 0.01f;
		myVehicle.setCurrentPrice((1 - discount) * myVehicle.getPurchasePrice());
		System.out.printf("V%s %f\n",myVehicle.getBrand(),discount);

	}

	public static void priceCalculate(Car myVehicle, int currentYear) {

		float discount = (float) ((currentYear - myVehicle.getYearOfPurchase()) * 0.02);
		discount += (myVehicle.getMileAge() / 10000) * 0.05;

		if (myVehicle.getBrand().equals(VehicleBrand.FIAT.toString())
				|| myVehicle.getBrand().equals(VehicleBrand.RENAULT.toString())) {
			discount += 0.1;
		} else if (myVehicle.getBrand().equals(VehicleBrand.FERRARI.toString())
				|| myVehicle.getBrand().equals(VehicleBrand.PORSHE.toString())) {
			discount -= 0.2;

		}
		System.out.printf("C%s %f\n",myVehicle.getBrand(),discount);

		myVehicle.setCurrentPrice((1 - discount) * myVehicle.getPurchasePrice());

	}
	
	public static void priceCalculate(Plane myVehicle, int currentYear) {
	
		
		float discount = 0 ;
		
		
		if (myVehicle.getEnginType().equals(EngineType.PROPELLER.toString() ) ) {	// type propeller 
			
			discount = myVehicle.getFlightHour() / 1000f;
		}else{
			discount = myVehicle.getFlightHour() / 10000f;
			
		}
		System.out.printf("P%s %f\n",myVehicle.getBrand(),discount);

		System.out.printf("P%d %f  %f  r%f",myVehicle.getFlightHour (),discount,myVehicle.getPurchasePrice(),(1-discount)*myVehicle.getPurchasePrice());
				
		myVehicle.setCurrentPrice((1-discount)*myVehicle.getPurchasePrice());
//		myVehicle.setCurrentPrice(0);
		
		
	}

	// ---------------attribut ---------------------

	// ---------------conctructor ---------------------

	// ---------------processing methode ---------------------

	// ----------- getter-Setter--------------------

}
