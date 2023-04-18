package fr.emile.salary.main;

import java.util.HashMap;

import fr.emile.salary.control.Staff;
import fr.emile.salary.entity.RiskyTechnician;
import fr.emile.salary.entity.RiskyWarehouseWorker;
import fr.emile.salary.entity.SalesMan;
import fr.emile.salary.entity.Seller;
import fr.emile.salary.entity.Technician;
import fr.emile.salary.entity.WarehouseWorker;

public class Main {

	public static void main(String[] args) {

//		test();
		run();

	}

	public static void run() {
		Staff myStaff = new Staff();

		myStaff.add(new Seller("Pierre", "Business", 45, "1995", 30000.0));
		myStaff.add(new SalesMan("Léon", "Vendtout", 25, "2001", 20000.0));
		myStaff.add(new Technician("Yves", "Bosseur", 28, "1998", 1000));
		myStaff.add(new Technician("Reyves", "grouseur", 28, "1998", 1020));
		myStaff.add(new WarehouseWorker("Jeanne", "Stocktout", 32, "1998", 45));
		myStaff.add(new RiskyWarehouseWorker("Krisarim", "AzetAbe", 33, "2003", 145));

		myStaff.add(new RiskyTechnician("Jean", "Flippe", 28, "2000", 1000));
		myStaff.add(new RiskyWarehouseWorker("Karim", "Abordage", 30, "2001", 45));
		myStaff.add(new Seller("Roger", "poutoBusiness", 45, "1995", 30000.0));

		myStaff.displaySalary();
		System.out.println("--------------------------------------------------");
		System.out.printf("Average Salary is : %.2f €\n", myStaff.averageSalary());

		myStaff.DisplayWorkerCountByCategory();
		myStaff.displaySalaryByCategory();

		System.out.printf("Max worker number : %d €\n", myStaff.getMaxWorkerNumber());
	}

	public static void test() {
		HashMap<String, Integer> stringIntHashmap = new HashMap<String, Integer>();
		stringIntHashmap.put("un", 1);
		stringIntHashmap.put("deux", 2);
		stringIntHashmap.put("trois", 3);
		stringIntHashmap.put("quatre", 4);
		stringIntHashmap.put("cinq", 5);
		System.out.print("initila list => ");
		System.out.println(stringIntHashmap);
		
		
		for (HashMap.Entry <String, Integer> entry : stringIntHashmap.entrySet()) {

			System.out.printf("key : %s value [%d]\n",entry.getKey(),entry.getValue());
			
		}
	
	}

}
