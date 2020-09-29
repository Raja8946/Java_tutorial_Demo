/*class Y extends Thread
{
	public void run() {
	
		for(int i=0;i<5;i++)
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

public class Stop_suspend_resume_demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Y y= new Y();
		y.start();
		System.out.println("Ends of main thread");
		y.stop();
	}
}*/



class Y extends Thread
{
	public void run() {
	
		for(int i=0;i<5;i++)
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

public class Stop_suspend_resume_demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Y y= new Y();
		y.start();
		System.out.println("Starts of main thread");
		y.suspend();
		System.out.println("Ends of main thread");
		//y.resume();
	}
}

