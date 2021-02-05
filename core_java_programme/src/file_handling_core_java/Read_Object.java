/**
 * 
 */
package file_handling_core_java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author hackingstuffs
 *
 */
public class Read_Object {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream fis= new FileInputStream("vehicles.dat"))
		{
			try(ObjectInputStream obj= new ObjectInputStream(fis))
			{
				Vehicle v1=(Vehicle)obj.readObject();
				Vehicle v2=(Vehicle)obj.readObject();
				String_Serializable s1=(String_Serializable)obj.readObject();
				System.out.println("Obj1 :"+v1);
				System.out.println("Obj2 :"+v2);
				System.out.println(s1);
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
