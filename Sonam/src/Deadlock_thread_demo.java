/*
class A
{
	public void d1(B b) {
		
	System.out.println("Thread start execution of d1 method");
	try {
		Thread.sleep(5000);
		
		
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	System.out.println("Thread-A trying to call b last method");
	b.last();
	}
	public void last() {
		System.out.println("This is last method present in thread-A");
	}
}

class B
{
	public void d2(A a) {
		System.out.println("Thread start execution of d2 method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Thread-B trying to call a last method");
		a.last();
	}
	public void last()
	{
		System.out.println("This is the last method present in thread-B");
		
	}
}

class Deadlock extends Thread
{
	A a= new A();
	B b=new B();
	public void m1() {                   //executed by main thread
		this.start();
		a.d1(b);
	}
	public void run() {                 // executed by child thread
		b.d2(a);
	}
}

public class Deadlock_thread_demo {

	public static void main(String[] args) {
		
		Deadlock d= new Deadlock();
		d.m1();
	}
	
}
*/



/*
class A
{
	public synchronized void d1(B b) {
		
	System.out.println("Thread start execution of d1 method");
	try {
		Thread.sleep(5000);
		
		;
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	System.out.println("Thread-A trying to call b last method");
	b.last();
	}
	public void last() {
		System.out.println("This is last method present in thread-A");
	}
}

class B
{
	public synchronized void d2(A a) {
		System.out.println("Thread start execution of d2 method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Thread-B trying to call a last method");
		a.last();
	}
	public void last()
	{
		System.out.println("This is the last method present in thread-B");
		
	}
}

class Deadlock extends Thread
{
	A a= new A();
	B b=new B();
	public void m1() {
		this.start();
		a.d1(b);
	}
	public void run() {
		b.d2(a);
	}
}
public class Deadlock_thread_demo {

	public static void main(String[] args) {
		
		Deadlock d= new Deadlock();
		d.m1();
*/



/*
class A
{
	public synchronized void d1(B b) {
		
	System.out.println("Thread start execution of d1 method");
	try {
		Thread.sleep(5000);
		
		;
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	System.out.println("Thread-A trying to call b last method");
	b.last();
	}
	public  synchronized void last() {
		System.out.println("This is last method present in thread-A");
	}
}

class B
{
	public synchronized void d2(A a) {
		System.out.println("Thread start execution of d2 method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Thread-B trying to call a last method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("This is the last method present in thread-B");
		
	}
}

class Deadlock extends Thread
{
	A a= new A();
	B b=new B();
	public void m1() {
		this.start();
		a.d1(b);
	}
	public void run() {
		b.d2(a);
	}
}

public class Deadlock_thread_demo {

	public static void main(String[] args) {
		
		Deadlock d= new Deadlock();
		d.m1();
	}
	
}*/



