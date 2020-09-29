/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
@SuppressWarnings("unused")
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try
		{
		    int i;
		    @SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
		    System.out.print("enter test case");
		    int t=sc.nextInt();
		    for(i=0;i<t;i++)
		    {
		        int count=0;
		    //    System.out.print("Enter array size");
		       // int num=sc.nextInt();
		        int[] arr= new int[t];
		        System.out.print("Enter elements");
		        for(i=0;i<arr.length;i++)
		        {
		            arr[i]=sc.nextInt();
		        }
		        
		     //   int x=4;
		        for(i=0;i<arr.length;i++)
		        {
		            if(arr[i]==4)
		            {
		                count++;
		            }
		        }
		        System.out.println(count);
		    }
		}
	
	    catch(Exception e)
	    {
	        return;
	    }
	}
}
