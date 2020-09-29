

/*
class displye
{
	public void displye(String name) {
		;;;;;;;;;;;;;;//1-lakh line of code
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
		;;;;;;;;;;;;;;//1-lakh line of code
		
	}
}
 class Mythread9 extends Thread
 {
	 displye d;
	 String name;
	 public Mythread9(displye d,String name) {
		// TODO Auto-generated constructor stub
		 this.d=d;
		 this.name=name;
	}
	 
	 public void run() {
		d.displye(name);
	}
 }

public class Synchronizeddemo3 {

	public static void main(String[] args) {
		
		displye d= new displye();
		Mythread9 t1= new Mythread9(d, "Smilee");
		Mythread9 t2= new Mythread9(d, "Raj");
		t1.start();
		t2.start();
		
	}
}


*/



/*
class displye
{
	public void displye(String name) {
		;;;;;;;;;;;;;;//1-lakh line of code
		synchronized (this) {
			
		
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
		;;;;;;;;;;;;;;//1-lakh line of code
		
	}
}
 class Mythread9 extends Thread
 {
	 displye d;
	 String name;
	 public Mythread9(displye d,String name) {
		// TODO Auto-generated constructor stub
		 this.d=d;
		 this.name=name;
	}
	 
	 public void run() {
		d.displye(name);
	}
 }

public class Synchronizeddemo3 {

	public static void main(String[] args) {
		
		displye d= new displye();
		Mythread9 t1= new Mythread9(d, "Smilee");
		Mythread9 t2= new Mythread9(d, "Raj");
		t1.start();
		t2.start();
		
	}
}
*/



/*

class displye
{
	public void displye(String name) {
		;;;;;;;;;;;;;;//1-lakh line of code
		synchronized (this) {
			
		
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
		;;;;;;;;;;;;;;//1-lakh line of code
		
	}
}
 class Mythread9 extends Thread
 {
	 displye d;
	 String name;
	 public Mythread9(displye d,String name) {
		// TODO Auto-generated constructor stub
		 this.d=d;
		 this.name=name;
	}
	 
	 public void run() {
		d.displye(name);
	}
 }

public class Synchronizeddemo3 {

	public static void main(String[] args) {
		
		displye d1= new displye();
		displye d2= new displye();
		Mythread9 t1= new Mythread9(d1, "Smilee");
		Mythread9 t2= new Mythread9(d2, "Raj");
		t1.start();
		t2.start();
		
	}
}

*/

/*
class displye
{
	public void displye(String name) {
		;;;;;;;;;;;;;;//1-lakh line of code
		
		synchronized (displye.class) {
			
		
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
		;;;;;;;;;;;;;;//1-lakh line of code
		
	}
}
 class Mythread9 extends Thread
 {
	 displye d;
	 String name;
	 public Mythread9(displye d,String name) {
		// TODO Auto-generated constructor stub
		 this.d=d;
		 this.name=name;
	}
	 
	 public void run() {
		d.displye(name);
	}
 }

public class Synchronizeddemo3 {

	public static void main(String[] args) {
		
		displye d1= new displye();
		displye d2=new displye();
		Mythread9 t1= new Mythread9(d1, "Smilee");
		Mythread9 t2= new Mythread9(d2, "Raj");
		t1.start();
		t2.start();
		
	}
}
*/

/*
class displye
{
	public void displye(String name) {
		;;;;;;;;;;;;;;//1-lakh line of code
		int x=10;
		synchronized (x) {
			
		
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
		;;;;;;;;;;;;;;//1-lakh line of code
		
	}
}
 class Mythread9 extends Thread
 {
	 displye d;
	 String name;
	 public Mythread9(displye d,String name) {
		// TODO Auto-generated constructor stub
		 this.d=d;
		 this.name=name;
	}
	 
	 public void run() {
		d.displye(name);
	}
 }

public class Synchronizeddemo3 {

	public static void main(String[] args) {
		
		displye d1= new displye();
		displye d2=new displye();
		Mythread9 t1= new Mythread9(d1, "Smilee");
		Mythread9 t2= new Mythread9(d2, "Raj");
		t1.start();
		t2.start();
		
	}
}

*/