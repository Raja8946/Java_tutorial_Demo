
public class Threadlocal_demo1A {

	public static void main(String[] args) {
		
		ThreadLocal<Object> tl=new ThreadLocal<Object>()
				{
			        public Object initialValue() {            //initial value
					
			        	return "Raj";
					}
				};
    
				System.out.println(tl.get());   //Raj
				tl.set("Smilee");
				System.out.println(tl.get());   //Smilee
				tl.remove();
				System.out.println(tl.get());     //Raj
	}
}
