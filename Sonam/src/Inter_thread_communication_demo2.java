/*
class ThreadA2 extends Thread
{
	int total=0;
	public void run() {
		for(int i=1;i<=100;i++)
		{
			total=total+i;
		}
		this.notify();
	}
}


public class Inter_thread_communication_demo2 {

	public static void main(String[] args) throws InterruptedException
	{
	    	ThreadA2 t1=new ThreadA2();
	    	t1.start();
	    	t1.wait();
	    	System.out.println(t1.total);
	    	
	}
}*/






class ThreadA2 extends Thread
{
	int total=0;
	public void run() {
		synchronized (this) {
			System.out.println("child-Thread Start Calculation");
		
		for(int i=1;i<=100;i++)
		{
			total=total+i;
		}
		System.out.println("Child-Thread sending notification to main thread");
		this.notify();
		}
	}
}


public class Inter_thread_communication_demo2 {

	public static void main(String[] args) throws InterruptedException
	{
	    	ThreadA2 t1=new ThreadA2();
	    	t1.start();
	    	Thread.sleep(10000);
	    	synchronized (t1) {
				
			System.out.println("Main-Thread call wait method");
	    	t1.wait(10000);
	    	System.out.println("Main-thread got notified by child thread");
	    	System.out.println(t1.total);
	    	}   	
	}
}

