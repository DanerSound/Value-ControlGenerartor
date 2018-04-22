package base;

public class Main {

	public static void main(String[] args) {

		String[] fileNames = { "sterzoIN.txt", "pendenzaIN.txt", "distanzaIN.txt" };

		WriteOnFile.writeValues(IntegerValuesInRange.generate(-60, 60, 100), "Caccaculo.txt");
		
//		values = ValueSterzo.generatedNumbers(values);
//		WriteOnFile.writeValues(values, fileNames[0]);
//
//		values = ValuePendenza.randInt(-180,180, values);
//		WriteOnFile.writeValues(values, fileNames[1]);
//
//		values = ValueOstacoli.GenerarteOstacoliValues(values);
//		WriteOnFile.writeValues(values, fileNames[2]);
		
		
	}

}
