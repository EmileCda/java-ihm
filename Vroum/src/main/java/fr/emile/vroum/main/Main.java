package fr.emile.vroum.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import fr.emile.vroum.entity.Car;
import fr.emile.vroum.entity.Plane;
import fr.emile.vroum.entity.Vehicle;
import fr.emile.vroum.enums.EngineType;
import fr.emile.vroum.enums.VehicleBrand;



public class Main {

	public static void main(String[] args) {
		
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		Car car1 = new Car(2.5f,5,120,120000,VehicleBrand.PEUGEOT.getValue(),2005,5000.0f);
		Car car3 = new Car(2.5f,5,120,120000,VehicleBrand.FIAT.getValue(),2005,5000.0f);
		
		Car car2 = new Car(6.5f,2,280,81300,VehicleBrand.PORSHE.getValue(),1999,250000);
		
		Plane  plane1 = new Plane(250,EngineType.PROPELLER.getValue(),VehicleBrand.CESSNA_PLANE.toString(), 1982,1230673.90f);

		Plane  plane2 = new Plane(1300,EngineType.JET_ENGINE.getValue(),VehicleBrand.UNKNOW_PLANE.toString(), 1993,4321098.00f);
		
		
		vehicleList.add(car1);
		vehicleList.add(car2);
		vehicleList.add(car3);
		vehicleList.add(plane1);
		vehicleList.add(plane2);
		
		Calendar  calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		year = 2022;
		
		for (Vehicle vehicle : vehicleList) {
			
			vehicle.priceCalculate(year);
			vehicle.display();
			System.out.println();
			
		}
		
	}

}
