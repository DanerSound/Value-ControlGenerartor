package base;

public class TestMain {

	public static void main(String[] args) {
		
		Object[]values = new Object[100];
	
		ValueSterzo sterzo = new ValueSterzo();
		values=ValueSterzo.generatedNumbers(values);
		sterzo.writeValues(values);
		
		ValueOstacoli ostacoli = new ValueOstacoli();
		values=ostacoli.GenerarteOstacoliValues(values);
		ostacoli.writeValues(values);
		
		ValuePendenza pendenza = new ValuePendenza();
		values=pendenza.randInt(-60, 60, values);
		pendenza.writeValues(values);
		
	}

}
