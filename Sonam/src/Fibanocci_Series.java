import java.util.Scanner;

public class Fibanocci_Series 
{
     public static void main(String[] args) 
     {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the range of fibanocci series");
	    int num= scanner.nextInt();
	    int prev=0;
	    int next=1;
	    int c=1;
	    System.out.println("Fibannoci series of given range are:-");
	    while (c<=num) 
	    {
		   System.out.println(" "+next);
		   int sum= prev+next;
		   prev=next;
		   next=sum;
		   c++;
		}
	    
	}
}
