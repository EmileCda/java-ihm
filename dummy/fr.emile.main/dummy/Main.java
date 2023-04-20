package dummy;

import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> toolList = new ArrayList<String>();
		toolList.add("Tournevis");
		toolList.add("Pelle");
		toolList.add("Tournevis");
		toolList.add("Marteau");
		toolList.add("Scie");
		toolList.add("Tournevis");

		for (String tool : toolList) {
			System.out.println(tool);
		}

		int index = 1;
		System.out.printf("tools position %d : %s\n", index, toolList.get(index));
		String toolName = "Bêche";
		toolList.set(index, toolName) ;
		System.out.printf("tools position %d : %s\n", index, toolList.get(index));

		for (String tool : toolList) {
			System.out.println(tool);
		}
		System.out.printf("tools position %d : %s\n", index, toolList.get(index));

		
		
		toolList.add("Rateau");

		System.out.printf("list containt %s ? : %b\n", toolName, toolList.contains(toolName));

		toolName = "Marteau";

		System.out.printf("position for %s ? : %d\n", toolName, toolList.indexOf(toolName));

		System.out.println("-----original----------------------------");
		for (String tool : toolList) {
			System.out.println(tool);
		}
		index = 3;
		toolName = toolList.get(index);
		toolList.remove(index);
		System.out.printf("remove %s at index : %d\n", toolName, index);
		
		for (String tool : toolList) {
			System.out.println(tool);
		}
		toolName = "Tournevis";
		boolean status = toolList.remove(toolName);
		System.out.printf("remove %s =>succes :%b\n", toolName, status);

		toolName = "Cochon";
		status = toolList.remove(toolName);
		System.out.printf("remove %s =>succes :%b\n", toolName, status);
		
		
		
		for (String tool : toolList) {
			System.out.println(tool);
		}

		System.out.printf("sizeList %d\n", toolList.size());

		Object myArray[] = toolList.toArray();

		System.out.printf("-------------------to array --------\n");
		System.out.printf("%s\n", myArray[0]);
		System.out.printf("%s\n", myArray[1]);
		
		

	}

}
