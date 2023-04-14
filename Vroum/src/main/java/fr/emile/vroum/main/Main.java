package fr.emile.vroum.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import fr.emile.vroum.control.VehicleControl;
import fr.emile.vroum.entity.Car;
import fr.emile.vroum.entity.EngineType;
import fr.emile.vroum.entity.Plane;
import fr.emile.vroum.entity.Vehicle;
import fr.emile.vroum.entity.VehicleBrand;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		Car car1 = new Car(2.5f,5,120,120000,VehicleBrand.PEUGEOT.toString(),2005,5000.0f);
		
		Car car2 = new Car(6.5f,2,280,81300,VehicleBrand.PORSHE.toString(),1999,250000);
		
		Plane  plane1 = new Plane(250,EngineType.PROPELLER.toString(),VehicleBrand.CESSNA_PLANE.toString(), 1982,1230673.90f);

		Plane  plane2 = new Plane(1300,EngineType.JET_ENGINE.toString(),VehicleBrand.UNKNOW_PLANE.toString(), 1993,4321098.00f);
		
		
		
		vehicleList.add(car1);
		vehicleList.add(car2);
		vehicleList.add(plane1);
		vehicleList.add(plane2);
		
		Calendar  calendar = Calendar.getInstance();
//		int year = Calendar.YEAR;
		int year = 2022;
		
//		int year = calendar.get(Calendar.YEAR);
		
		for (Vehicle vehicle : vehicleList) {
			
			vehicle.priceCalculate(year);
			vehicle.display();
			System.out.println();
			
		}
		
		
	}

}
