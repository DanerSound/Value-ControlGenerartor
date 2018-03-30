package base;

public class ValueSterzo {

	public static Object[] generatedNumbers(Object[] vett) {
		for (int i = 1; i < vett.length - 1; i++) {
			vett[i] = (int) (Math.random() * 100);
		}
		return vett;
	}
}
