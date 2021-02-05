/**
 * 
 */
package file_handling_core_java;

import java.io.File;
import java.util.Scanner;

/**
 * @author hackingstuffs
 *
 */
public class File_Handle_demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scanner = new Scanner(new File("Hack.txt"));
		String str;
		while(scanner.hasNext())
		{
			str=scanner.nextLine();
			System.out.println(str);
				
		}
		scanner.close();

		}
		catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		}

}
