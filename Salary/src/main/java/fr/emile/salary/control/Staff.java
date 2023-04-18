package fr.emile.salary.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.emile.salary.entity.Worker;

public class Staff {

	private ArrayList<Worker> workerList;
	private HashMap<String, ArrayList<Worker>> byCategory ;
	private List<String> categoryList;
	private int workerNumber;

	// ------------------------ constructor --------------
	/**
	 * @param workerList
	 * @param workerNumber
	 * @param maxWorkerNumber
	 */
	public Staff() {
		this.setWorkerNumber(0);
		this.workerList = new ArrayList<Worker>();
		this.categoryList = new ArrayList<String>();
		this.byCategory = new HashMap<String, ArrayList<Worker>>();

	}

	public void add(Worker worker) {
		this.getWorkerList().add(worker);
	}

	public double averageSalary() {
		double totalsalary = 0;
		int workerNumber = 0;
		for (Worker worker : this.getWorkerList()) {
			totalsalary += worker.calculateSalary();
			workerNumber++;
		}

		return totalsalary / workerNumber;
	}

	public void displaySalary() {

		for (Worker worker : this.getWorkerList()) {
			worker.calculateSalary();
			System.out.printf("%s gagne %.2f\n", worker.toString(), worker.calculateSalary());
		}

	}

	public ArrayList<Worker> getWorkerList() {
		return workerList;
	}

	private void setWorkerList(ArrayList<Worker> workerList) {
		this.workerList = workerList;
	}

	public int getWorkerNumber() {
		return workerNumber;
	}

	public void setWorkerNumber(int workerNumber) {
		this.workerNumber = workerNumber;
	}

	public int getMaxWorkerNumber() {
		return this.getWorkerList().size();
	}

	// ---------------processing methode ---------------------
	public void displaySalaryByCategory() {

		for (String oneCategory : categoryList) {
			double totalsalary = 0.0f;
			int count = 0;
			for (Worker worker : this.getWorkerList()) {

				if (oneCategory.equals(worker.getClass().getSimpleName())) {
					count++;
					totalsalary += worker.calculateSalary();
				}
			}
			System.out.printf("Cat : %s Average salary %.2f\n", oneCategory, totalsalary / count);
		}
	}

	public void SortWorkerByCategory() {
		ArrayList<Worker> workerList = null;
		for (Worker worker : this.getWorkerList()) {

			String category = worker.getClass().getSimpleName();
			try {
				workerList = this.byCategory.get(category);
				if (workerList == null)
					workerList = new ArrayList<Worker>();
			} catch (Exception e) {
				if (workerList == null)
					workerList = new ArrayList<Worker>();
			} finally {
				workerList.add(worker);
				this.byCategory.put(category, workerList);
			}

		}

	}

	public void DisplayWorkerCountByCategory() {
		ArrayList<Worker>  myWorkerList ; 
		this.SortWorkerByCategory();
	
		for (HashMap.Entry<String, ArrayList<Worker>> entry : this.byCategory.entrySet()) {		
			System.out.printf(" ----------------- Catégorie : %s ---------------------\n", entry.getKey());
		
			myWorkerList = entry.getValue();
			double totalSalary = 0.0;
			for (Worker worker : myWorkerList) {
				System.out.printf("\t%s\n", worker.toString());
				totalSalary += worker.calculateSalary() ;
			}
			System.out.printf(" average salary %.2f\n", totalSalary / myWorkerList.size());		
		}
	}
}
