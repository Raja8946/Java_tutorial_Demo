/*class Display
{
	public void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Evening :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	}
}

class Mythread8 extends Thread
{
	Display d;
	String name;
	Mythread8(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run() {
		
		d.wish(name);
	}
}
public class Synchronizeddemo {
	public static void main(String[] args) {
		Display d = new Display();
		Mythread8 t1= new Mythread8(d, "Smilee");
		Mythread8 t2=new Mythread8(d, "Raj");
		Mythread8 t3=new Mythread8(d, "Shail Di");
		Mythread8 t4=new Mythread8(d, "Rohan");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
*/



/*

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Evening :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	}
}

class Mythread8 extends Thread
{
	Display d;
	String name;
	Mythread8(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run() {
		
		d.wish(name);
	}
}
public class Synchronizeddemo {
	public static void main(String[] args) {
		Display d = new Display();
		Mythread8 t1= new Mythread8(d, "Smilee");
		Mythread8 t2=new Mythread8(d, "Raj");
		Mythread8 t3=new Mythread8(d, "Shail Di");
		Mythread8 t4=new Mythread8(d, "Rohan");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
*/



/*
class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Evening :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	}
}

class Mythread8 extends Thread
{
	Display d;
	String name;
	Mythread8(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run() {
		
		d.wish(name);
	}
}
public class Synchronizeddemo {
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2=new Display();
		Mythread8 t1= new Mythread8(d1, "Smilee");
		Mythread8 t2=new Mythread8(d2, "Raj");
		//Mythread8 t3=new Mythread8(d, "Shail Di");
		//Mythread8 t4=new Mythread8(d, "Rohan");
		t1.start();
		t2.start();
		//t3.start();
		//t4.start();
	}

}

*/



/*
class Display
{
	public static synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Evening :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	}
}

class Mythread8 extends Thread
{
	Display d;
	String name;
	Mythread8(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run() {
		
		d.wish(name);
	}
}
public class Synchronizeddemo {
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2=new Display();
		Mythread8 t1= new Mythread8(d1, "Smilee");
		Mythread8 t2=new Mythread8(d2, "Raj");
		//Mythread8 t3=new Mythread8(d, "Shail Di");
		//Mythread8 t4=new Mythread8(d, "Rohan");
		t1.start();
		t2.start();
		//t3.start();
		//t4.start();
	}

}

*/
