package base;

public class Main {

	public static void main(String[] args) {

		Object[] values = new Object[100];
		String[] fileNames = { "sterzoIN.txt", "pendenzaIN.txt", "distanzaIN.txt" };

		values = ValueSterzo.generatedNumbers(values);
		WriteOnFile.writeValues(values, fileNames[0]);

		values = ValuePendenza.randInt(-180,180, values);
		WriteOnFile.writeValues(values, fileNames[1]);

		values = ValueOstacoli.GenerarteOstacoliValues(values);
		WriteOnFile.writeValues(values, fileNames[2]);

	}

}
