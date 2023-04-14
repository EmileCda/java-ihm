package assessement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public Main() {
	}

	public static int computeClosestToZero(int[] ts) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		if (ts.length == 0)
			return 0;
		int tempReturn = ts[0];

		for (int temperature : ts) {

			if (Math.abs(tempReturn) == Math.abs(temperature)) {

				if (tempReturn < temperature) {
					tempReturn = temperature;
				}
			} else

			if ((tempReturn) > Math.abs(temperature)) {
				tempReturn = temperature;
			}
		}
		return tempReturn;
	}

	public static int solve(int weight0, int weight1, int weight2) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");

		int tapisId = 0;
		if (weight1 > weight0) {
			tapisId = 1;

			if (weight2 > weight1)
				tapisId = 2;

		} else {
			if (weight2 > weight0)
				tapisId = 2;
		}

		return tapisId;
	}

	// retourne les occurences par odre alphabétique avec le nombre

	public static int[] countFrequencies(String[] words) {

		int intReturn[] = null;
		int newIntTab[] = null;

		System.out.printf("\norgin ");
		for (String word : words) {
			System.out.printf("[%s]", word);
		}
		System.out.printf("\nsort");
		Arrays.sort(words);
		for (String word : words) {
			System.out.printf("[%s]", word);
		}

		System.out.printf("\n");

		String motCOurant = words[0];
		int count = 0;
		for (int index = 0; index < words.length; index++) {
			if (motCOurant.equals(words[index])) {
				count++;

			} else {

				if (intReturn != null) {
					newIntTab = new int[intReturn.length + 1];
					for (int indice = 0; indice < intReturn.length; indice++) {
						newIntTab[indice] = intReturn[indice];
					}

					newIntTab[intReturn.length] = count;

				} else {
					newIntTab = new int[1];
					newIntTab[0] = count;

				}

				intReturn = newIntTab;
				motCOurant = words[index];
				count = 0;

			}

		}
		newIntTab = new int[intReturn.length + 1];
		for (int indice = 0; indice < intReturn.length; indice++) {
			newIntTab[indice] = intReturn[indice];
		}

		newIntTab[intReturn.length] = count;
		intReturn = newIntTab;

		return intReturn;

	}

	public static int[] ZcountFrequencies(String[] words) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");

		System.out.printf("\norgin ");
		for (String word : words) {
			System.out.printf("[%s]", word);
		}
		System.out.printf("\nsort");
		Arrays.sort(words);
		for (String word : words) {
			System.out.printf("[%s]", word);
		}
		System.out.printf("\nsort");

		Map<String, Integer> wordOccurence = new HashMap<String, Integer>();

		for (String word : words) {
			int count = 1;
			if (wordOccurence.get(word) != null)
				count += wordOccurence.get(word);

			wordOccurence.put(word, count);
			System.out.printf("\n w[%s] d [%d]", word, count);

		}

		int[] intReturn = new int[wordOccurence.size()];
		System.out.printf("\n d [%d]", wordOccurence.size());
//		int index = 0 ; 
//		for (int count: wordOccurence) {
//			
//			intReturn[index] = count; 
//			
//		}

		System.out.printf("\nresult");
		for (int quatity : intReturn) {
			System.out.printf("[%d]", quatity);
		}

		return intReturn;
	}

	public static String solve(int width, int height, int length, int mass) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");

		int volume = width * height * length;
		boolean encombrant = false;
		boolean lourd = false;

		if (width >= 150 || height > 150 || length > 150 || volume > 1000000) {
			encombrant = true;
		}

		if (mass >= 20)
			lourd = true;

		if (lourd && encombrant)
			return "REJECTED";

		if (lourd || encombrant)
			return "SPECIAL";

		return "STANDARD";
	}

	public static void bubbleSort(String wordList[]) {
		int sizeList = wordList.length;

		int swapCount = 0;

		do {
			swapCount = 0;
			for (int index = 0; index < sizeList - 1; index++) {
				int result = wordList[index].compareTo(wordList[index + 1]);
				if (result > 0) {
					String wordExtrated = wordList[index];
					wordList[index] = wordList[index + 1];
					wordList[index + 1] = wordExtrated;
					swapCount++;
				}
			}
		} while (swapCount > 0);

	}

	public static void main(String[] args) {
		String wordList[] = { "System", "printf", "mot1", "System", "printf", "stub", "System", "method", "stub", "mot1",
				"STANDARD", "method", "mot1", "printfzz" };
		String wordList2[] = { "bmot1","amot1","bmot1","cmot1","dmot1","emot1","fmot1","gmot1",};

		for (String word : wordList) {
			System.out.printf("{%s}, ", word);
		}
		System.out.printf("\n*************\n");
		bubbleSort( wordList);

		System.out.printf("\n*************\n");
		for (String word : wordList) {
			System.out.printf("[%s], ", word);
		}

		
	}
		public static void testMain2(String[] args) {

		String listMot[] = { "System", "printf", "mot1", "System", "printf", "stub", "System", "method", "stub", "mot1",
				"STANDARD", "method", "mot1", "printf" };

		System.out.printf("\n dans le main:");
		for (int quantity : countFrequencies(listMot)) {
			System.out.printf("{%d} ", quantity);
		}

	}
	
	

	public static void testMain(String[] args) {

		int temp[] = { 1, 2, 3, 6, -6, -6, -62, -16, -60 };
		int temp2[] = { -276 };
		int temp3[] = { -10, -10 };

//		System.out.printf("%d\n", solve(180,100,140));
//		System.out.printf("%d\n", solve(110,100,100));
//		System.out.printf("%d\n", solve(80,100,100));
//		System.out.printf("%d\n", solve(80,90,100));
//		System.out.printf("%d\n", solve(80,90,0));
//		System.out.printf("%d\n", solve(80,0,0));
//		System.out.printf("%d\n", solve(1,20,3));
//		System.out.printf("%d\n", solve(100,20,3));
//		System.out.printf("%d\n", computeClosestToZero(temp3));

	}
}
