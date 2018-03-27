package base;

public class ValueGenerator {
	
public static int[] generatedNumbers(int[]vett){	
		for (int i = 0; i < vett.length; i++) {
			vett[i]=(int)(Math.random()*100);
		}
		return vett;
	} 
}
