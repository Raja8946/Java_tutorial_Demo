// Waiting State possesed by Main-Thread

/*class Mythread6 extends Thread
{
	public void run() {
	          for(int i=0;i<10;i++)
	          {
	        	  System.out.println("Smilee-Thread");
	          
	          try {
				      Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
	          }
	}
}

public class Threadjoin {
	public static void main(String[] args) throws InterruptedException {
		Mythread6 mythread6=new Mythread6();
		mythread6.start();
		mythread6.join();
		for(int i=0;i<10;i++)
		{
			System.out.println("Raj-Thread");
		}
	}

}
*/
// Waiting State possesd by child-Thread

/*
class Mythread6 extends Thread
{
	static Thread mt;
	public void run() {
		
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Child-Thread");
		}
	}
	
	
}

class Threadjoin
{
	public static void main(String[] args ) throws InterruptedException{
		Mythread6.mt=Thread.currentThread();
		Mythread6 mythread6=new Mythread6();
		mythread6.start();
		for (int i = 0; i <10; i++) {
			System.out.println("Main-Thread");
			Thread.sleep(2000);
		}
	}
}
*/

// When both main-threads and child-threads call join method

/*
class Mythread6 extends Thread
{
	static Thread mt;
	public void run() {
		
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Child-Thread");
		}
	}
	
	
}

class Threadjoin
{
	public static void main(String[] args ) throws InterruptedException{
		Mythread6.mt=Thread.currentThread();
		Mythread6 mythread6=new Mythread6();
		mythread6.start();
		mythread6.join();
		for (int i = 0; i <10; i++) {
			System.out.println("Main-Thread");
			Thread.sleep(2000);
		}
	}
}*/



/*
public class Threadjoin 
{
	public static void main(String[] args) throws InterruptedException {
	
		Thread.currentThread().join();
		System.out.println("Hello");
	}
}
*/