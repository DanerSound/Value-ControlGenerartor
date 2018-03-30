package base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public  class WriteOnFile {
	
	public static void writeValues(Object[] arrayofMisures,String fileName){
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			for (int i = 1; i < arrayofMisures.length; i++) {
				  bw.write(arrayofMisures[i]+" ".toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

	
}
