package base;

import java.util.Random;

public class HexaDecimalValues {
	
	private static String obstacleType = "AB";
	
	public static String[] generate ( int numberOfElement, String distanceAlphabet){
		String [] vett = new String[numberOfElement];

		for (int index=0;index<numberOfElement;index++){
			char obsType= obstacleType.charAt((new Random()).nextInt(obstacleType.length()));
			vett[index]=obsType+NumberHexadecimal.generate(distanceAlphabet)+NumberHexadecimal.generate(distanceAlphabet);
		}
	 return vett;
	}	
}
