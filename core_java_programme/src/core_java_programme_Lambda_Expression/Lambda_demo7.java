package core_java_programme_Lambda_Expression;

import java.util.ArrayList;

public class Lambda_demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(54);
		list.add(7);
		list.add(51);
		list.add(75);
		
		/*
		for(Integer i:list)
		{
			//System.out.println(i);
			if(i>=10)
			{
				System.out.println(i);
			}
		}  */
		
		
	//	list.forEach(i-> System.out.println(i));     // Using Lambda Expression.
		
		
		list.forEach(i->
		{
			if(i>=10)
			{
				System.out.println(i);
			}
		});
		
		

	}

}
