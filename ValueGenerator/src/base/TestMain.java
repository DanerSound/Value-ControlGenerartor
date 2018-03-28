package base;

public class TestMain {

	public static void main(String[] args) {
		Integer [] values = new Integer[100];		
		ValueSterzo sterzo = new ValueSterzo();
		FileCreator.CreatorFile();
		values=ValueSterzo.generatedNumbers(values);
		sterzo.writeValues(values);

	}

}
