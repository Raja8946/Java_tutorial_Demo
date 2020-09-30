import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*class Mythread16 extends Thread
{
	static ReentrantLock l= new ReentrantLock();
	public Mythread16(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	public void run() {
		
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+"got lock and performing its operation");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		l.unlock();
		}
		else {
			System.out.println(Thread.currentThread().getName()+"Unable to get lock so performing alternate operation");
			
		}
	}
	
}


public class Reentrant_Lock_demo3 {

	public static void main(String[] args) {

		  Mythread16 t1 = new Mythread16("First-Thread");
		  Mythread16 t2= new Mythread16("Second-Thread");
		  t1.start();
		  t2.start();
	}
}
*/






class Mythread16 extends Thread
{
	static ReentrantLock l= new ReentrantLock();
	public Mythread16(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	public void run() {
		do
		{
			try {
				if(l.tryLock(5000,TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName() +" got lock and performing its execution");
					Thread.sleep(30000);
					System.out.println(Thread.currentThread().getName() +" releasing lock........");
					l.unlock();
					break;
				}
				else {
					System.out.println(Thread.currentThread().getName() +" unable to get lock try again for lock");
				}
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			} 
		
		}
		while(true);
	}
	
}


public class Reentrant_Lock_demo3 {

	public static void main(String[] args) {

		  Mythread16 t1 = new Mythread16("First-Thread");
		  Mythread16 t2= new Mythread16("Second-Thread");
		  Mythread16 t3 = new Mythread16("Third-Thread");
		  t1.start();
		  t2.start();
		  t3.start();
	}
}
