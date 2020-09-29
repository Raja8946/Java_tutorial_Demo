
/*public class ThreadGroup_demo1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	}
}*/

public class ThreadGroup_demo1 {

	public static void main(String[] args) {
		ThreadGroup group=new ThreadGroup("Group-1");
		
		System.out.println(group.getParent().getName());
	}
}
