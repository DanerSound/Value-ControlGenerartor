package base;

public class Main {

	public static void main(String[] args) {
		WriteOnFile.writeValues(IntegerValuesInRange.generate(-180,180, 100), "pendenzaIN.txt");
		
		WriteOnFile.writeValues(IntegerValuesInRange.generate(-180, 180, 100), " sterzoIN.txt");
		
		WriteOnFile.writeValues(HexaDecimalValues.generate(100, "0123456789ABCDEF"), "distanzaIN.txt");	
	}
}
