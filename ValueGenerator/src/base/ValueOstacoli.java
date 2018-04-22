package base;

import java.util.Random;

public class ValueOstacoli {
	
	public static Object[] GenerarteOstacoliValues(Object[] vett) {
		String ostacoloTypealphabet = "AB";
		String alphabetDistance ="123456789ABCDEF";
		char[] dis = new char[2];

		for(int controlIndex=0;controlIndex<100;controlIndex++) {
			  char ostacoloType = ostacoloTypealphabet.charAt((new Random()).nextInt(ostacoloTypealphabet.length()));
			  dis[0]= alphabetDistance.charAt((new Random()).nextInt(alphabetDistance.length()));
			  dis[1]= alphabetDistance.charAt((new Random()).nextInt(alphabetDistance.length()));		 
		vett[controlIndex] = ostacoloType + String.valueOf(dis[0])+String.valueOf(dis[1]);	  
		}
		return vett;
	}

}
