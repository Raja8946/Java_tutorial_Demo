/*class Parentthread extends Thread
{
	static ThreadLocal<Object> tl=new ThreadLocal<Object>();
	public void run() {
		tl.set("Smilee");
		System.out.println("Parent value :"+tl.get());
		childthread ct = new childthread();
		ct.start();
		
	}
}
class childthread extends Thread{
	public void run() {
	
		System.out.println("Child value :"+Parentthread.tl.get());
	}
}
public class Threadlocal_demo3 {
	public static void main(String[] args) {
	
		Parentthread pt= new Parentthread();
		pt.start();
	
	}

}*/


/*
class Parentthread extends Thread
{
	static InheritableThreadLocal<Object> tl= new InheritableThreadLocal<Object>();
	public void run() {
		tl.set("Smilee");
		System.out.println("Parent value :"+tl.get());
		childthread ct = new childthread();
		ct.start();
		
	}
}
class childthread extends Thread{
	public void run() {
	
		System.out.println("Child value :"+Parentthread.tl.get());
	}
}
public class Threadlocal_demo3 {
	public static void main(String[] args) {
	
		Parentthread pt= new Parentthread();
		pt.start();
	
	}

}*/








class Parentthread extends Thread
{
	public static ThreadLocal<Object> tl=new ThreadLocal<Object>()
			{
		//@SuppressWarnings("unused")
		public Object initialValue() {
			return "Raj";
		}
			};
	public void run() {
		tl.set("Smilee");
		System.out.println("Parent value :"+tl.get());
		childthread ct = new childthread();
		ct.start();
		
	}
}
class childthread extends Thread{
	public void run() {
	
		System.out.println("Child value :"+Parentthread.tl.get());
	}
}
public class Threadlocal_demo3 {
	public static void main(String[] args) {
	
		Parentthread pt= new Parentthread();
		pt.start();
	
	}

}


