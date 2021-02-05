/**
 * 
 */
package core_java_programme_Lambda_Expression;

import java.util.function.IntPredicate;

/**
 * @author hackingstuffs
 *
 */
public class Predicate_using_lambda_demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntPredicate lessthan18=i-> i<18;
		IntPredicate morethan10 = i-> i>10;
		
		Predicate_using_lambda_demo3 demo3=	new Predicate_using_lambda_demo3();
		demo3.demo(20, lessthan18, morethan10);
		demo3.demo(15, lessthan18, morethan10);

	}
	
	public void demo(int x,IntPredicate lessthan18,IntPredicate morethan10)
	{
		if(lessthan18.and(morethan10).test(x))
		{
			System.out.println("Value is b/w 10 to 18");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
