package base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ValueSterzo extends WriteOnFile {

	public static Object[] generatedNumbers(Object[] vett) {
		for (int i = 1; i < vett.length - 1; i++) {
			vett[i] = (int) (Math.random() * 100);
		}
		return vett;
	}

	@Override
	public void writeValues(Object[] arrayofMisures) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("SterzoValues.txt");
			bw = new BufferedWriter(fw);
			for (int i = 1; i < arrayofMisures.length; i++) { // TODO fix
				String content = arrayofMisures[i]+" ".toString();
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
