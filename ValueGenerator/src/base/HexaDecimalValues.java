package base;

import java.util.Random;

public class HexaDecimalValues {
	
	private static String obstacleType = "AB";
	
	public static String[] generate ( int numberOfElement, String distanceAlphabet){
		String [] vett = new String[numberOfElement];
		char[] distance= new char[2];
		
		for (int index=0;index<numberOfElement;index++){
			char obsType= obstacleType.charAt((new Random()).nextInt(obstacleType.length()));
			distance[0]=distanceAlphabet.charAt(new Random().nextInt(distanceAlphabet.length()));
			distance[1]=distanceAlphabet.charAt(new Random().nextInt(distanceAlphabet.length()));
			vett[index]=obsType+String.valueOf(distance[0])+String.valueOf(distance[1]);
		}
	 return vett;
	}	
}
