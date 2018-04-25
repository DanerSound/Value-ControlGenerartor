package base;

import java.util.Random;

public class IntegerValuesInRange {
	public static String[] generate (int min, int max, int numberOfElement){
		String vett[] = new String[numberOfElement];
		for (int i = 0; i < numberOfElement ; i++) {
			vett[i] = String.valueOf((new Random()).nextInt((max - min) + 1) + min);
		}
		return vett;
	}
}
