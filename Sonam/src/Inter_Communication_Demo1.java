

/*class ThreadA1 extends Thread
{
	int total=0;
	public void run() {
		for(int i=1;i<=100;i++)
		{
			total=total+i;
		}
	}
}


public class Inter_Communication_Demo1 {

	public static void main(String[] args) 
	{
	        ThreadA1 t1=new ThreadA1();
	        t1.start();
	        System.out.println(t1.total);
	}
}*/



/*
class ThreadA1 extends Thread
{
	int total=0;
	public void run() {
		for(int i=1;i<=100;i++)
		{
			total=total+i;
		}
	}
}


public class Inter_Communication_Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
	        ThreadA1 t1=new ThreadA1();
	        t1.start();
	        Thread.sleep(0,1);
	        System.out.println(t1.total);
	}
}*/






/*
class ThreadA1 extends Thread
{
	int total=0;
	public void run() {
		for(int i=1;i<=100;i++)
		{
			total=total+i;
		}
		;;;;;;;;;;;;;;;;;;;;;; //1-lakh line of code
	}
}


public class Inter_Communication_Demo1 {

	public static void main(String[] args) throws InterruptedException
	{
	        ThreadA1 t1=new ThreadA1();
	        t1.start();
	        t1.join();
	        System.out.println(t1.total);
	}
}*/


