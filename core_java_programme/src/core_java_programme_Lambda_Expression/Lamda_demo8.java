/**
 * 
 */
package core_java_programme_Lambda_Expression;

import java.util.ArrayList;

/**
 * @author hackingstuffs
 *
 */

class Data
{
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
	
}
public class Lamda_demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Data> list = new ArrayList<Data>();
		list.add(new Data("Smilee"));
		list.add(new Data("Sonam"));
		list.add(new Data("Twinkle"));
		list.add(new Data("Raj"));
		
		
		list.forEach(temp-> System.out.println(temp.getName()));

	}

}
