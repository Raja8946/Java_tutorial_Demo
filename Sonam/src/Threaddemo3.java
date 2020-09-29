/*class Mythread3 extends Thread
{
	
}
public class Threaddemo3 {
    public static void main(String[] args)
    {
    	   System.out.println(Thread.currentThread().getName());
	        Mythread3 mythread3= new Mythread3();
	        System.out.println(mythread3.getName());
	        System.out.println(Thread.currentThread().getName());
	        Thread.currentThread().setName("Smilee");
	        mythread3.setName("Raj");
	        System.out.println(mythread3.getName());
	        System.out.println(Thread.currentThread().getName());
	        System.out.println(10/0);
	}
}
*/



class Mythread3 extends Thread{
	public void run() {
		
		System.out.println("Child Thread is executed by : "+Thread.currentThread().getName());
	}
	
}

public class Threaddemo3
{
	public static void main(String[] args) 
	{
	    Mythread3 mythread3= new Mythread3();
	    mythread3.start();
	    System.out.println("Main-Thread is executed by :"+Thread.currentThread().getName());
	}
}