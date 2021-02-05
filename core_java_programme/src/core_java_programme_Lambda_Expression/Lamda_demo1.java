package core_java_programme_Lambda_Expression;

interface Lambda
{
	public void demo();
	//public void demo2(int i);  //Lamda Expression can be used only for functional interface(i.e interface having only one abstract method).
		
	
}
public class Lamda_demo1  {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*Lambda lambda = new Lambda() {
		
		@Override
		public void demo() {                                            //By normal Overriding
			// TODO Auto-generated method stub
			System.out.println("Lambda demo-1");
			
		}
	};       */
		
	
		
		//	Lambda lambda= ()->System.out.println("Lambda demo-1");       //Use of lambda for single line print
		
		
		
		Lambda lambda =()->{
			System.out.println("Lamda demo-1");                  //Use of lambd to print multiple line
			System.out.println("Line-2");
		};

   lambda.demo();

}
}