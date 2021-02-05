package core_java_programme_Lambda_Expression;

import java.util.function.IntPredicate;

public class Predicate_using_Lambda_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		IntPredicate lessthan18 = new IntPredicate() {
			
			@Override
			public boolean test(int value) {                               //Predicate Implementation using Anoynomus inner class
				// TODO Auto-generated method stub
				if(value<18)
				{
					return true;
				}
				else {
					return false;
				}
			}
		};
		
		System.out.println(lessthan18.test(20));
		System.out.println(lessthan18.test(15));   */
		
		
		IntPredicate lessthan18 = i-> i<18;               // Using lambda Expression
		System.out.println(lessthan18.test(20));
		System.out.println(lessthan18.test(15));
		

	}

}
