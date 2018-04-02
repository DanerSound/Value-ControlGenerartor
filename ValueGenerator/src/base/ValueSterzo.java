package base;

public class ValueSterzo {

	public static Object[] generatedNumbers(Object[] vett) {
		for (int i = 0; i < vett.length ; i++) {
			vett[i] = (int) (Math.random() * 100);
		}
		return vett;
	}
}
