import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import jdk.internal.jshell.tool.resources.l10n;

/*class Displayre
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

class Mythread12 extends Thread
{
	Displayre d;
	String name;
	Mythread12(Displayre d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run() {
		
		d.wish(name);
	}
}
public class Reentrant_Lock_demo2 {
	public static void main(String[] args) 
	{
		Displayre d = new Displayre();
		Mythread12 t1= new Mythread12(d, "Smilee");
		Mythread12 t2=new Mythread12(d, "Raj");
		Mythread12 t3=new Mythread12(d, "Shail Di");
		Mythread12 t4=new Mythread12(d, "Rohan");
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
	}

}*/






class Displayre
{
	ReentrantLock l= new ReentrantLock();
	
	public void wish(String name)
	{
		l.lock();
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
		l.unlock();
	}
}

class Mythread12 extends Thread
{
	Displayre d;
	String name;
	Mythread12(Displayre d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run() {
		
		d.wish(name);
	}
}
public class Reentrant_Lock_demo2 {
	public static void main(String[] args) 
	{
		Displayre d = new Displayre();
		Mythread12 t1= new Mythread12(d, "Smilee");
		Mythread12 t2=new Mythread12(d, "Raj");
		Mythread12 t3=new Mythread12(d, "Shail Di");
		Mythread12 t4=new Mythread12(d, "Rohan");
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
	}

}

