package base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ValuePendenza extends WriteOnFile {
	
	public Object[] randInt(int min, int max,Object[] vett) {
		Random rand = new Random();
		for(int i=0;i<vett.length;i++) {
		vett[i]= rand.nextInt((max - min) + 1) + min;
		}
		return vett;
	}
	@Override
	public void writeValues(Object[] arrayofMisures) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("PendenzaValues.txt");
			bw = new BufferedWriter(fw);
			for (int i = 0; i < arrayofMisures.length; i++) {
				String content = arrayofMisures[i] + " ".toString();
				bw.write(content);
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
