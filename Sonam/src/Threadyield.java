class Mythread5 extends Thread
{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Child-Thread");
			Thread.yield();
		}
	}
}


public class Threadyield {
	public static void main(String[] args) {
		
	     Mythread5 mythread5= new Mythread5();
	     mythread5.start();
	     for(int i=0;i<5;i++)
	     {
	    	 System.out.println("Main-Thread");
	     }
	}

}
