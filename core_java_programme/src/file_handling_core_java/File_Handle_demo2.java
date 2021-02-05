/**
 * 
 */
package file_handling_core_java;

import java.io.File;
import java.io.IOException;

/**
 * @author hackingstuffs
 *
 */
public class File_Handle_demo2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	/*	File directory = new File("Hacking");           // creating directory
		directory.mkdir(); */
		
		File directory = new File("/home/hackingstuffs/Desktop//Hacking//Book//Black_Hat");   // Cretes directory along with sub-directory.
		directory.mkdirs();
		System.out.println("Successful");
		
		File file = new File("/home/hackingstuffs/Desktop//Hacking//Book//Black_Hat//Hack_book.txt");
		file.createNewFile();
		System.out.println("Successful");
		

	}

}
