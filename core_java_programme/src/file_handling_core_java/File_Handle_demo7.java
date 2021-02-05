/**
 * 
 */
package file_handling_core_java;

import java.io.File;

/**
 * @author hackingstuffs
 *
 */
public class File_Handle_demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Hack.txt");
		if(file.delete())
		{
			System.out.println("File Deleted Successful");
		}
		else {
			System.out.println("Error while Deletion");
		}

	}

}
