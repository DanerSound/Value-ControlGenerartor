package base;

import java.io.File;
import java.io.IOException;

public class FileCreator {

	public static void CreatorFile() {
		try {
			File file = new File("sampleFile.txt");
			if (file.createNewFile())
				System.out.println("Success!");	
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
