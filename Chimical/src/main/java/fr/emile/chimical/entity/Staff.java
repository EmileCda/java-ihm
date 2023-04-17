package fr.emile.chimical.entity;

import java.util.ArrayList;

public class Staff {

	
	private ArrayList<Worker> workerList;
	private int workerNumber ;
	private int maxWorkerNumber ;
	//------------------------ constructor --------------
	/**
	 * @param workerList
	 * @param workerNumber
	 * @param maxWorkerNumber
	 */
	public Staff(ArrayList<Worker> workerList, int workerNumber, int maxWorkerNumber) {
		this.setWorkerList(workerList);
		this.setWorkerNumber(workerNumber);
		this.setMaxWorkerNumber(maxWorkerNumber);
	}
	
	public Staff() {
		this( new ArrayList<Worker>(),0,0);
				

	}

	
	public void add (Worker worker) {
		this.getWorkerList().add(worker);
	}
	
	public double averageSalary() {
		double totalsalary = 0 ;
		int workerNumber = 0 ;
		for (Worker worker : this.getWorkerList()) {
			totalsalary += worker.calculateSalary();
			workerNumber++ ; 
		}
		
		
		return totalsalary /workerNumber ;
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

	public void setWorkerList(ArrayList<Worker> workerList) {
		this.workerList = workerList;
	}

	public int getWorkerNumber() {
		return workerNumber;
	}

	public void setWorkerNumber(int workerNumber) {
		this.workerNumber = workerNumber;
	}

	public int getMaxWorkerNumber() {
		return maxWorkerNumber;
	}

	public void setMaxWorkerNumber(int maxWorkerNumber) {
		this.maxWorkerNumber = maxWorkerNumber;
	}
	
	

	

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
