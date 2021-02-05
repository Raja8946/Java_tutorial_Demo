package core_java_programme_Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class demo
{
	private String name;

	public demo(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "demo [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
}

public class Lambda_demo3 {

	public static void main(String[] args) {
		
		ArrayList<demo> list= new ArrayList<demo>();
		list.add(new demo("Raj"));
		list.add(new demo("Sonam"));
		list.add(new demo("Smilee"));
		list.add(new demo("Twinkle"));
		/*
		Collections.sort(list, new Comparator<demo>() {                     //Normal Implementation of Comparator Interface.

			@Override
			public int compare(demo arg0, demo arg1) {
				// TODO Auto-generated method stub
				return arg0.getName().compareTo(arg1.getName());
			}
			
		           
		});            */
		
		//    Collections.sort(list, (demo d1,demo d2)-> d2.getName().compareTo(d1.getName()));     //Using Lamda Expression w/o return keyword
		
		
		Collections.sort(list, (demo d1,demo d2)->
		{
			if(d1.getName().length()<d2.getName().length())                      //Using Lambda Expression with return keyword.
			{
				return -1;
			}
			else if(d1.getName().length()>d2.getName().length()) 
			{
				return 1;
			}
			else
			{
				return 0;
			}
		});
		
		
		for(demo d:list)
		{
			System.out.println(d.getName());
			
		}

	}

}
