import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Sum_of_Series implements Callable<Object>
{
	int number;
	public Sum_of_Series(int number) {
		// TODO Auto-generated constructor stub
		this.number=number;
	}
	public Object call() {
		System.out.println(Thread.currentThread().getName()+" is responsible to find sum of first  "+number +" numbers");
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			sum=sum+i;
			
		}
		return sum;
		
	}
}
public class Callable_Future_demo {

	public static void main(String[] args) throws Exception {
		
		Sum_of_Series[] series= {  new Sum_of_Series(10),
				                   new Sum_of_Series(20),
				                   new Sum_of_Series(30),
				                   new Sum_of_Series(40),
				                   new Sum_of_Series(50),
				                   new Sum_of_Series(60)};
		
		ExecutorService service= Executors.newFixedThreadPool(3);
		for(Sum_of_Series s1:series)
		{
			Future<Object> f= service.submit(s1);
			System.out.println(f.get());
		}
	}
}
