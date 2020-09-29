import java.util.Scanner;

public class Perfect_number 
{
     public static void main(String[] args) 
     {
    	 int sum=0;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter a number \n");
	      int a = scanner.nextInt();
	      for(int i= 1;i<a;i++)
	      {
	    	  int rem= a%i;
	    	  if(rem==0)
	    	  {
	    		  sum=sum+i;
	    	  }
	      }
	      if(sum== a)
	      {
	    	  System.out.println("The no is a perfect number");
	      }
	      else {
			System.out.println("The no is not a perfect number");
		}
	}
}
