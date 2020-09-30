

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Printjobs implements Runnable
{
      String name;
      public Printjobs(String name) {
		// TODO Auto-generated constructor stub
    	  this.name=name;
	}
      public void run() {
		
    	  System.out.println(name+"Job started by thread :"+Thread.currentThread().getName());
    	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
    	  System.out.println(name+"Job completed by thread :"+Thread.currentThread().getName());
	}
}
public class Executordemo {
	public static void main(String[] args) {
		Printjobs[] jobs= { new Printjobs("Raj"),
				            new Printjobs("Sonam"),
				            new Printjobs("Smilee"),
				            new Printjobs("Twinkle"),
				            new Printjobs("Fuggi"),
				            new Printjobs("Rohan")};
		
		ExecutorService service= Executors.newFixedThreadPool(3);
		for(Printjobs job:jobs)
		{
			service.submit(job);
		}
		service.shutdown();
		}
	}


