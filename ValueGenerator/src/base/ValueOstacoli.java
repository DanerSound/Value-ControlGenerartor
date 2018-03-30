package base;

import java.util.Random;

public class ValueOstacoli {
	
	public static Object[] GenerarteOstacoliValues(Object[] vett) {
		String alphabet = "AB";

		for(int controlIndex=0;controlIndex<100;controlIndex++) {
			Integer distance = 0;
			char ostacoloType = alphabet.charAt((new Random()).nextInt(alphabet.length()));
			distance = (int) (Math.random() * 100);
			vett[controlIndex] = ostacoloType + distance.toString();
		}
		return vett;
	}
}
