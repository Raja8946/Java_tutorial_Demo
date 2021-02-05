/**
 * 
 */
package file_handling_core_java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author hackingstuffs
 *
 */
public class File_Handle_demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("Java_Stack_Devlop");
		file.mkdir();
		System.out.println("Directory Created");
		file = new File("Java_Stack_Devlop//Course");
	/*	try {
			file.createNewFile();
			System.out.println("File Created Successfully");          // Can be work w/o these lines also
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  */
		 try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true)))    //Work as append
		 {
			 bw.write("Core_java");
			 bw.newLine();
			 bw.write("JDBC");
			 bw.newLine();
			 bw.write("Servelet");
			 bw.newLine();
			 bw.write("JSP");
			 
			 
			 System.out.println("Written Successfull");
			 bw.close();
			 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
