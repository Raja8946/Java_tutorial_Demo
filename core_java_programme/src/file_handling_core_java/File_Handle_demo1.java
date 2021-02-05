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
public class File_Handle_demo1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 File file = new File("vehicles.dat"); // To current project directory
	//	File file = new File("/home/hackingstuffs/Desktop//Hack.txt");  //To a specific path
		file.createNewFile();
		System.out.println("File Created Sucessfully");
		

	}

}
