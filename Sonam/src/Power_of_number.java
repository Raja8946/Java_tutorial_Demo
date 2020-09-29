import java.util.Scanner;

public class Power_of_number 
{
         @SuppressWarnings("resource")
		public static void main(String[] args) 
         {
		          Scanner scanner= new Scanner(System.in);
		          System.out.print("Enter base \n");
		          int base=scanner.nextInt();
		          System.out.print("Enter exponent \n");
		          int exp=scanner.nextInt();
		          int result=1;
		          while (exp!=0) 
		          {
					result= result*base;
					exp--;
				}
		          System.out.println("The final value is "+result);
		          
		}
}
