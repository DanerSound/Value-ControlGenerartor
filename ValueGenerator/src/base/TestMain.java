package base;

public class TestMain {

	public static void main(String[] args) {
		Integer [] values = new Integer[100];		
		ValueSterzo sterzo = new ValueSterzo();
		values=ValueSterzo.generatedNumbers(values);
		sterzo.writeValues(values);
		
		Object[]val = new Object[100];
		ValueOstacoli ostacoli = new ValueOstacoli();
		val=ostacoli.GenerarteOstacoliValues(val);
		ostacoli.writeValues(val);
		
		
	}

}
