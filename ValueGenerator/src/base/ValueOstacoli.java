package base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ValueOstacoli extends WriteOnFile {

	public Object[] GenerarteOstacoliValues(Object[] vett) {
		String alphabet = "AB";
		int misures = 0;
		int arrayIndex = 0;

		while (misures != 100) {
			Integer distance = 0;
			char ostacoloType = alphabet.charAt((new Random()).nextInt(alphabet.length()));
			distance = (int) (Math.random() * 100);
			vett[arrayIndex] = ostacoloType + distance.toString();
			arrayIndex++;
			misures++;
		}
		return vett;
	}

	@Override
	public void writeValues(Object[] arrayofMisures) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("OstacoliValues.txt");
			bw = new BufferedWriter(fw);
			for (int i = 1; i < arrayofMisures.length; i++) {
				String content = arrayofMisures[i] + " ".toString();
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
