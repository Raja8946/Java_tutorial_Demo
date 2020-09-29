
/*class Mythread extends Thread
{
	public void run() 
	{
	    for(int i=0;i<10;i++)
	    {
	    	System.out.println("ChildThread");
	    }
	}
}

public class Threaddemo {

	public static void main(String[] args) 
	{
	     Mythread tMythread= new Mythread();
	     tMythread.start();
	     for(int j=0;j<10;j++)
	     {
	    	 System.out.println("MainThread");
	     }
	}
}*/

/*class Mythread extends Thread
{
	public void run()
	{
		System.out.println("No-arg-run");
	}
    public void run(int i)
    {
    	System.out.println("int-arg-run");
    }
}

class Threaddemo
{
	public static void main(String[] args ) 
	{
	      Mythread mythread= new Mythread();
	      mythread.start();
	  //    mythread.run(2);  //Normal method run
	      
	}
}*/

 
class mythread extends Thread
{
	
}
public class Threaddemo {
    public static void main(String[] args)
    {
	     mythread mythread= new mythread();
	     mythread.start();
	}
}

/*
class Mythred extends Thread
{
	public void start() {
		System.out.println("Start method");
	}
	public void run() 
	{
	    System.out.println("run-method");	
	}
}

 class Threaddemo
{
	public static void main(String[] args) {
		 Mythred mythred= new Mythred();
		 mythred.start();
		 System.out.println("Main-method");
		
	}
}*/


/*

class Mythred extends Thread
{
	public void start() {
		super.start();
		System.out.println("Start method");
	}
	public void run() 
	{
	    System.out.println("run-method");	
	}
}

 class Threaddemo
{
	public static void main(String[] args) {
		 Mythred mythred= new Mythred();
		 mythred.start();
		 System.out.println("Main-method");
		
	}
}*/

/*

class Mythred extends Thread
{
	
	public void run() 
	{
	    System.out.println("run-method");	
	}
}

 class Threaddemo
{
	public static void main(String[] args) {
		 Mythred mythred= new Mythred();
		 mythred.start();
		mythred.start();
		
	}
}*/



   


