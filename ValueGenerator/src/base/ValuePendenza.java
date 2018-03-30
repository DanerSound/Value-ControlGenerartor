package base;

import java.util.Random;

public class ValuePendenza {
	
	public static Object[] randInt(int min, int max,Object[] vett) {
		Random rand = new Random();
		for(int i=0;i<vett.length;i++) {
		vett[i]= rand.nextInt((max - min) + 1) + min;
		}
		return vett;
	}
}
