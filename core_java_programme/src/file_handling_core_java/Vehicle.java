/**
 * 
 */
package file_handling_core_java;

import java.io.Serializable;

/**
 * @author hackingstuffs
 *
 */
public class Vehicle implements Serializable{                       // It is compulsory to implement serializable to serial all the data 

	/**
	 * 
	 */
	private static final long serialVersionUID = -6961207154970377297L; // If we change this id jvm will throw error saying wrong class id exception
	/**
	 * @param args
	 */
	
	private String type;
	private int number;
	/**
	 * @param type
	 * @param number
	 */
	public Vehicle(String type, int number) {
		
		this.type = type;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}
	
	

	}


