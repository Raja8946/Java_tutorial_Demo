package core_java_programme_Lambda_Expression;

interface Lambda2
{
	//public void demo(int x,int y);
	public int demo();
}

public class Lamda_demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Lambda2 lambda2=(int x,int y)->System.out.println("x = "+x + "y = "+y);
		lambda2.demo(500, 300);*/
		
		/*Lambda2 lambda2=()->(25*10)/5;
		System.out.println(lambda2.demo()); */
		Lambda2 lambda2=()->
		{
			System.out.println("Hello");
			return 10;
		};
		System.out.println(lambda2.demo());
		

	}

}
