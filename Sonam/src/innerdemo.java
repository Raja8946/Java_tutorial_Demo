/*class outer
{
	int a;
	public void show() {
		
	}
	class inner    //outer$inner.class
	{
		public void dispalay() {
			System.out.println("in display");
			
		}
	}
}

public class innerdemo {

	//variable //method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outer out=new outer();
		out.show();
		
		//inner out1= new inner();
		outer.inner out1=out.new inner();
		out1.dispalay();
	}

}
*/





/*
class outer
{
	static int a;
	public static void show() {
		
	}
	static class inner    //outer$inner.class
	{
		public void dispalay() {
			System.out.println("in display");
			
		}
	}
}

public class innerdemo {

	//variable //method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outer out=new outer();
		out.show();
		
		//inner out1= new inner();
		outer.inner out1=new outer.inner();
		out1.dispalay();
	}

}
*/