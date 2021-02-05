
public class Threadlocal_demo1 {

	public static void main(String[] args) 
	{
	
		ThreadLocal<Object> tl= new ThreadLocal<Object>();
		System.out.println(tl.get());    //null
		tl.set("Smilee");
		System.out.println(tl.get());     //Smilee
		tl.remove();
		System.out.println(tl.get());      //null
	}
}
