/**
 * 
 */
package core_java_programme_Lambda_Expression;

import java.util.function.IntPredicate;

/**
 * @author hackingstuffs
 *
 */
public class Predicate_using_lambda_demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntPredicate lessthan18=i-> i<18;
		IntPredicate morethan10=i-> i>10;
		System.out.println(lessthan18.and(morethan10).test(10));
		System.out.println(lessthan18.and(morethan10).test(45));
		System.out.println(lessthan18.or(morethan10).test(45));

	}

}
