package base;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class FileCreator {
	
	public static void CreatorFile() {
		  try {
	            File file = new File("sampleFile.txt");
	            if(file.createNewFile())
	                System.out.println("Success!");
	                WriterOnFile();
	        }
	        catch(IOException io) {
	            io.printStackTrace();
	        }
		}
    
	public static void PrinterFile(){
		  File x = new File("sampleFile.txt");
		  Scanner sc;
		try {
		    sc = new Scanner(x);
		    while(sc.hasNext()) {
	              System.out.println(sc.next());
	          }
	          sc.close();	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
         
	}
	
	private static void WriterOnFile(){
		
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = "ciao Chiara!\n";

			fw = new FileWriter("sampleFile.txt");
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
}	
	