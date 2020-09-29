/*class Mythread7 extends Thread
{
	public void run() {
		try {
			for(int i=0;i<10;i++)
			{ 
				System.out.println("Lazy-Thread");
				Thread.sleep(2000);
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Lazy Thread got interrupted");
		}
	}
}
public class Tjreadinterruptdemo   {
	public static void main(String[] args) {
		
		Mythread7 mythread7 = new Mythread7();
		mythread7.start();
		mythread7.interrupt();
		System.out.println("End of main thread");
		
		
	}

}
*/





/*
class Mythread7 extends Thread
{
	public void run() {
	
			for(int i=0;i<10000;i++)
			{ 
				System.out.println("Lazy-Thread");
			}
			System.out.println("Thread-want sleep");
			try
			{
				Thread.sleep(2000);
			}
			
		 catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Lazy Thread got interrupted");
		}
	}
}
public class Tjreadinterruptdemo   {
	public static void main(String[] args) {
		
		Mythread7 mythread7 = new Mythread7();
		
		mythread7.start();
		mythread7.interrupt();
		System.out.println("End of main thread");
		
		
	}

}
*/
