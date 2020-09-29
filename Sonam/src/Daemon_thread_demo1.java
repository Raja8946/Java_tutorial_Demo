/*class X extends Thread
{
	
}
public class Daemon_thread_demo1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().isDaemon());  //return boolean
		//Thread.currentThread().setDaemon(true);// A run time error IllegalThtreadState Exception
		X x= new X();
		System.out.println(x.isDaemon());   // return boolean
		x.setDaemon(true);
		x.start();
		System.out.println(x.isDaemon());        //return boolean
		
		
	}
}*/




class X extends Thread
{
	public void run() {
	
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

class Daemon_thread_demo1
{
	public static void main(String[] args) 
	{
	    X x=new X();
	    x.setDaemon(true);
	    x.start();
	    System.out.println("End of main thread");
	}
}