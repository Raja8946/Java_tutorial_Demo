
/*public class ThreadGroup_demo2 {

	public static void main(String[] args) {
		ThreadGroup group= new ThreadGroup("Parent");
		Thread t1= new Thread(group,"Child-Thread1");
		Thread t2= new Thread(group, "Child-Thread2");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		group.setMaxPriority(3);
		Thread t3= new Thread(group, "Child-Thread3");
		System.out.println(t3.getPriority());
	}
}*/



class mythread5 extends Thread
{
	public mythread5(ThreadGroup group,String name) {
		// TODO Auto-generated constructor stub
		super(group,name);
	}
	public void run() {
		
		System.out.println("Child-Thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}

class ThreadGroup_demo2
{
	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup pg=new ThreadGroup("Parent Group");
		ThreadGroup cg=new ThreadGroup(pg,"ChildGroup");
		mythread5 t1= new mythread5(pg, "Child-Thread1");
		mythread5 t2= new mythread5(pg, "Child-Thread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
	}
}