package fr.emile.louche.main;

import java.util.ArrayList;
import java.util.List;

import fr.emile.louche.entity.CookingTool;
import fr.emile.louche.entity.Plate;
import fr.emile.louche.entity.RoundPlate;
import fr.emile.louche.entity.SQuarePlate;
import fr.emile.louche.entity.Spoon;

public class Main {

	public static void main(String[] args) {
		List<CookingTool> cookingToolList = new ArrayList<CookingTool>();

		cookingToolList.add(new RoundPlate(8.4f, 1926));
		cookingToolList.add(new Spoon(7.3f, 1881));
		cookingToolList.add(new SQuarePlate(5.6f, 1935));
		cookingToolList.add(new Spoon(8.8f, 1917));
		cookingToolList.add(new RoundPlate(5.4f, 1837));
		displayItemCount(cookingToolList);
		displayPlateSurface(cookingToolList);
		displayTotalValue(cookingToolList);

	}

	public static void displayItemCount(List<CookingTool> myList) {
		int spoonCount = 0;
		int roundPlateCount = 0;
		int squarePlateCount = 0;

		for (CookingTool cookingTool : myList) {
			if (cookingTool instanceof Spoon) {
				spoonCount++;
			}
			if (cookingTool instanceof SQuarePlate) {
				squarePlateCount++;
			}
			if (cookingTool instanceof RoundPlate) {
				roundPlateCount++;
			}

		}
		System.out.printf("there are %d spoons\n",spoonCount );
		System.out.printf("there are %d square plate\n",squarePlateCount );
		System.out.printf("there are %d round plate\n",roundPlateCount );

	}
	
	public static void displayPlateSurface(List<CookingTool> myList) {
		
		double totalSurface= 0.0;
		
		for (CookingTool cookingTool : myList) {
		
			if (cookingTool instanceof Plate) {
				
				totalSurface+=((Plate)cookingTool).calculateSurface();
				System.out.println(cookingTool);
			}
		}
		System.out.printf("Total surface for plate (square and round) is %.2f\n",totalSurface );
		
	}
	
	public static void displayTotalValue(List<CookingTool> myList)  {
		float totalValue = 0.0f;
		
		for (CookingTool cookingTool : myList) {
			
			totalValue+=cookingTool.calculateValue();
		}

		System.out.printf("Total value for the collection : %.2f\n",totalValue );

	}

}
