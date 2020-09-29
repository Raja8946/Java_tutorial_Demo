class Mythread2 implements Runnable
{
	public void run() 
	{
	     for(int i=0;i<10;i++)
	     {
	    	 System.out.println("Child-Thread");
	     }
	}
}
public class Threaddemo2 {
  public static void main(String[] args) 
  {
	   Mythread2 mythread= new Mythread2();
	   Thread t1=new Thread(mythread);
	   t1.start();
	   for(int i=0;i<10;i++)
	   {
		   System.out.println("Main-Thread");
	   }
}
}
