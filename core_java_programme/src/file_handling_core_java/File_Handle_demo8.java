package file_handling_core_java;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author hackingstuffs
 *
 */
public class File_Handle_demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);   // Resources leak if scanner is not close or we don't use try with resources
		System.out.println("Enter a number");
		int x= scanner.nextInt();
		System.out.println(x);
		//scanner.close();

	}

}
