
/*
class Disply
{
	public void displyi() {
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
	public void displyc() {
		for(int i=65;i<75;i++)
		{
			System.out.print((char) i);
			try {
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

class mythread1 extends Thread
{
	Disply d;
	public mythread1(Disply d) {
		// TODO Auto-generated constructor stub
		
		this.d=d;
	}
	public void run() {
		d.displyi();
	}
}

class mythread2 extends Thread
{
	Disply d;
	public mythread2(Disply d) {
		// TODO Auto-generated constructor stub
		this.d=d;
	}
	public void run() {
		d.displyc();
	}
	
}


public class Synchronizeddemo2 {

	public static void main(String[] args) 
	{
	   Disply d= new Disply();
	   mythread1 t1=new mythread1(d);
	   mythread2 t2=new mythread2(d);
	   t1.start();
	   t2.start();
	}
	
}

*/



/*
class Disply
{
	public synchronized void displyi() {
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
	public synchronized void  displyc() {
		for(int i=65;i<75;i++)
		{
			System.out.print((char) i);
			try {
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

class mythread1 extends Thread
{
	Disply d;
	public mythread1(Disply d) {
		// TODO Auto-generated constructor stub
		
		this.d=d;
	}
	public void run() {
		d.displyi();
	}
}

class mythread2 extends Thread
{
	Disply d;
	public mythread2(Disply d) {
		// TODO Auto-generated constructor stub
		this.d=d;
	}
	public void run() {
		d.displyc();
	}
	
}


public class Synchronizeddemo2 {

	public static void main(String[] args) 
	{
	   Disply d= new Disply();
	   mythread1 t1=new mythread1(d);
	   mythread2 t2=new mythread2(d);
	   t1.start();
	   t2.start();
	}
	
}
*/



