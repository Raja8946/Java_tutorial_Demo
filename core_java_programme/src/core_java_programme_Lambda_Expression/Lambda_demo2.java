package core_java_programme_Lambda_Expression;

public class Lambda_demo2 {
	public static void main(String[] args) 
	{
	    /*  Thread thread= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub                   //Normal implementation of run method
				System.out.println("Inside-Thread");
				
			}
		});       
	      
	      thread.start();       */
		
		
		
		
	/*	Thread thread = new Thread(()-> System.out.println("Inside thread"));    //Lambda impentation for print single line
		thread.start();    */
		
		Thread thread= new Thread(()-> {
			System.out.println("Inside thread");        //Lambda implementation of thread for printing multiple lines.
			System.out.println("Line-2");
		});
		thread.start();
	}

}
