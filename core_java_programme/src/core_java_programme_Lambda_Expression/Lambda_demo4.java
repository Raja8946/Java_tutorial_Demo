package core_java_programme_Lambda_Expression;

interface Lambda1
{
	public void demo1(); 
		
	
}
public class Lambda_demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
	/*	
		Lambda1 lambda1 = new Lambda1() {
			
			@Override
			public void demo1() {
				// TODO Auto-generated method stub
		//		 * int y=10;
				System.out.println("value of x is :"+x);
				
			}                                                        //Variable define in the inner class can be used outside of his scope
		};
	//	System.out.println(" "+y); // Throw an error
		lambda1.demo1();         */
		
		Lambda1 lambda1 = ()->System.out.println("Value of x is :"+x);       //X(define in class Scope) can be used in annynomous inner class or lamda expression 
		lambda1.demo1();

	}

}
