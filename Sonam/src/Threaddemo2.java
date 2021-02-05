/*class Mythread2 implements Runnable
{
	public void run() 
	{
	     for(int i=1;i<5;i++)
	     {
	    	 System.out.println(i++);
	     }
	}
}*/
public class Threaddemo2 {
  public static void main(String[] args) 
  {
	/*   Mythread2 mythread= new Mythread2();
	   Thread t1=new Thread(mythread);
	   t1.start();
	  for(int i=0;i<10;i++)
	   {
		   System.out.println("Main-Thread");
	   }*/
	  Thread thread = Thread.currentThread();
	  System.out.println(thread.activeCount());
}
}
