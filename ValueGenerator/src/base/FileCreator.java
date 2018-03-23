package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class FileCreator {
	
	public static void CreatorFile() {
		  try {
	            File file = new File("sampleFile.txt");
	            if(file.createNewFile())
	                System.out.println("File creation successfull");
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
	
	public static void WriterOnFile() throws IOException{


	}
	
}	
	