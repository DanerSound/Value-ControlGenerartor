package base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ValueOstacoli extends WriteOnFile {
	
	public static void GenerarteOstacoliValues(Object[] vett) {
		Random r = new Random();
		String parola=new String();
		
	    String alphabet = "AB";	
	    int misures=0;
	    
	    while(misures!=100){
	    	int arrayIndex;
	        parola=" ";
	        int distance=0;
	        for (arrayIndex = 1; arrayIndex < vett.length - 1; arrayIndex++) {
		    	for(int n=0; n<=1; n++) { 
		    		char ostacoloType=alphabet.charAt(r.nextInt(alphabet.length()));
		        	parola=ostacoloType+parola;
		        	distance=(int)(Math.random() * 100);
		    		vett[arrayIndex]=parola+" "+distance;
		    		System.out.println(" "+vett[arrayIndex]);
		    		System.out.println(" "+arrayIndex);
		    	}
		    	
		    }
	        misures++;
	    
	    }
	}

	@Override
	public void writeValues(Object[] arrayofMisures) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("OstacoliValues.txt");
			bw = new BufferedWriter(fw);
			for (int i = 1; i < arrayofMisures.length; i++) {
				String content = arrayofMisures[i]+" ".toString();
				bw.write(content);
				System.out.println(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
		
}


