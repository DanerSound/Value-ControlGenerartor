package base;

import java.util.Random;

public class ValueOstacoli extends WriteOnFile {

	public static Object[] GenerarteOstacoliValues(Object[] vett) {
		Random r = new Random();
		String misura = new String();
		String alphabet = "AB";
		int misures = 0;
		int arrayIndex = 0;

		while (misures != 100) {
			misura = " ";
			Integer distance = 0;
			char ostacoloType = alphabet.charAt(r.nextInt(alphabet.length()));
			misura = ostacoloType + misura;
			distance = (int) (Math.random() * 100);
			misura = ostacoloType + distance.toString();
			vett[arrayIndex] = misura;
			arrayIndex++;
			misures++;
		}
		return vett;
	}
}
