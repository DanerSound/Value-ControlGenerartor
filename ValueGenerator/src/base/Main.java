package base;

public class Main {

	public static void main(String[] args) {
		
		WriteOnFile.writeValues(IntegerValuesInRange.generate(-60, 60, 100), "pendenzaIN.txt");
		
		WriteOnFile.writeValues(IntegerValuesInRange.generate(0, 100, 100), " sterzoIN.txt");
		
		WriteOnFile.writeValues(HexaDecimalValues.generate(100, "123456789ABCDEF"), "distanzaIN.txt");	
	}
}
