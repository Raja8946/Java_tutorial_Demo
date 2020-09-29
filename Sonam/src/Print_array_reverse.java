import java.util.Scanner;

public class Print_array_reverse 
{
	public static void main(String[] args) 
	{
		
	
 Scanner scanner= new Scanner(System.in);
 System.out.println("Enter elements into array");
 int size=scanner.nextInt();
     int[] array=new int[size];
 for(int i=0;i<size;i++)
 {
	System.out.println("Enter elements at position"+i+1);
	array[i]=scanner.nextInt();
	
 }
 
 System.out.println("\n-------------Displaying array in reverse order------------\n");
for (int i = size-1; i>=0; i--) 
{
    System.out.println(array[i]);	
}
 
	}
}