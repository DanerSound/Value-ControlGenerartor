package base;

public class Inclination {	
	static int [] grade;
	
	public static int[] generategrade(){
		int[] a= new int[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)(Math.random()*100);
		}
		return a;
	} 
}
