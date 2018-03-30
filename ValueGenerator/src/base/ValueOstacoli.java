package base;

import java.util.Random;

public class ValueOstacoli extends WriteOnFile {


	public static Object[] GenerarteOstacoliValues(Object[] vett) {
		String alphabet = "AB";
		int controlIndex=0;
		
		while (controlIndex!= 100) {
			Integer distance = 0;
			char ostacoloType = alphabet.charAt((new Random()).nextInt(alphabet.length()));
			distance = (int) (Math.random() * 100);
			vett[controlIndex] = ostacoloType + distance.toString();
			controlIndex++;
		}
		return vett;
	}
}
