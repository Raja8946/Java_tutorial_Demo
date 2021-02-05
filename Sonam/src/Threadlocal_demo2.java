class Customerthread extends Thread
{
	static Integer custid=0;
	private static ThreadLocal<Object> tl= new ThreadLocal<Object>()
			{
		      protected Integer initialValue()
		      {
		    	  return ++custid;
		      }
			};
			Customerthread(String name)
			{
				super(name);
			}
			public void run() {
				
				System.out.println(Thread.currentThread().getName()+"execute with customer id :"+tl.get());
			}
}
public class Threadlocal_demo2 {
	public static void main(String[] args) {
		
		Customerthread c1= new Customerthread("Customer-1");
		Customerthread c2 = new Customerthread("Customer-2");
		Customerthread c3= new Customerthread("Customer-3");
		Customerthread c4= new Customerthread("Customer-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}
