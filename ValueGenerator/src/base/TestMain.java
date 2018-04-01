package base;


public class TestMain {

	public static void main(String[] args) {
		
		Object[]values = new Object[100];	
		String[]fileNames={"SterzoValues.txt","PendenzaValues.txt","OstacoliValues.txt"};
		
		values=ValueSterzo.generatedNumbers(values);
		WriteOnFile.writeValues(values,fileNames[0]);

		values=ValuePendenza.randInt(-60, 60, values);
		WriteOnFile.writeValues(values,fileNames[1]);
		
		values=ValueOstacoli.GenerarteOstacoliValues(values);
		WriteOnFile.writeValues(values,fileNames[2]);
		

		
	}

}
