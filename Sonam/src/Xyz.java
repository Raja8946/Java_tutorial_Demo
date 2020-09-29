
import java.util.Scanner;

public class Xyz 
{
	public static void main(String args[])
	{
			int min;
			int temp=0;
		
			@SuppressWarnings("resource")
			Scanner ob=new Scanner(System.in);
			System.out.println("enter arrays size");
			int n=ob.nextInt();
			int arr[]=new int[n];
			
			
			for(int i=0;i<arr.length;i++)
					{
						arr[i]=ob.nextInt();
					}
			
			for(int i=0;i<arr.length;i++)
			{
					min=i;
				for(int j=i+1;j<arr.length;j++)
				{
		
					if(arr[j]<arr[min])
					{
						min=j;
					}
				}
					temp=arr[i];
					arr[i]=arr[min];
					arr[min]=temp;
			}	
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
	}
			
}