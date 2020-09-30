
/*public class ThreadGroup_demo1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());   //main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());   //system
	}
}*/

public class ThreadGroup_demo1 {

	public static void main(String[] args) {
		ThreadGroup group=new ThreadGroup("Group-1"); //executed by main thread
		
		System.out.println(group.getParent().getParent().getName());
	}
}
