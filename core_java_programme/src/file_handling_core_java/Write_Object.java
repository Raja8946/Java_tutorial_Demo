/**
 * 
 */
package file_handling_core_java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author hackingstuffs
 *
 */
public class Write_Object {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle bike=new Vehicle("bike", 4552);
		Vehicle car= new Vehicle("Car", 7894);
		String_Serializable str= new String_Serializable("Hii Fuggi");
	//	System.out.println(bike);
		
		try(FileOutputStream fos= new FileOutputStream("vehicles.dat")){
			
			try(ObjectOutputStream obj= new ObjectOutputStream(fos))
			{
				obj.writeObject(bike);
				obj.writeObject(car);
			    obj.writeObject(str);
				System.out.println("Object Written Successfully");
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
