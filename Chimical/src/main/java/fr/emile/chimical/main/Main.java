package fr.emile.chimical.main;

import fr.emile.chimical.entity.RiskyTechnician;
import fr.emile.chimical.entity.RiskyWarehouseWorker;
import fr.emile.chimical.entity.SalesMan;
import fr.emile.chimical.entity.Seller;
import fr.emile.chimical.entity.Staff;
import fr.emile.chimical.entity.Technician;
import fr.emile.chimical.entity.WarehouseWorker;

public class Main {

	public static void main(String[] args) {

		Staff myStaff = new Staff();
		
		myStaff.add(new Seller("Pierre","Business",45,"1995",30000.0)); 
		myStaff.add(new SalesMan("Léon","Vendtout",25,"2001",20000.0)); 
		myStaff.add(new Technician("Yves","Bosseur",28,"1998",1000)); 
		myStaff.add(new WarehouseWorker("Jeanne","Stocktout",32,"1998",45)); 
		myStaff.add(new RiskyTechnician("Jean","Flippe",28,"2000",1000)); 
		myStaff.add(new RiskyWarehouseWorker("Karim","Abordage",30,"2001",45)); 
		
		myStaff.displaySalary();
		System.out.println("--------------------------------------------------");
		System.out.printf("Average Salary is : %.2f €\n", myStaff.averageSalary());
		
	}

}
