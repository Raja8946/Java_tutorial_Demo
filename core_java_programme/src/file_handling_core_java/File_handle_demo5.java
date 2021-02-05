/**
 * 
 */
package file_handling_core_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author hackingstuffs
 *
 */
public class File_handle_demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Java_Stack_Devloping");
		file.mkdir();
		System.out.println("Directory Created");
		file = new File("Java_Stack_Devloping//Course");
	
		 try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
		 {
			 bw.write("Core_java");
			 bw.newLine();
			 bw.write("JDBC");
			 bw.newLine();
			 bw.write("Servelet");
			 bw.newLine();
			 bw.write("JSP");
			 
			 System.out.println("Written Successfull");
			 
			 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 
		  try
		  {
			  BufferedReader br= new BufferedReader(new FileReader("Java_Stack_Devloping//Course"));
			  String line;
			  System.out.println("*****");
			  while((line = br.readLine())!=null)
			  {
				  System.out.println(line);
			  }
			  br.close();
		  }
		  
		  catch (IOException e) {
			// TODO: handle exception
			  e.printStackTrace();
		}
	}

}
