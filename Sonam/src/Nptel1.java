import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Nptel1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	Scanner ob=new Scanner(System.in);
	System.out.println("///");
	int T=ob.nextInt();
	for(int i=0;i<T;i++)
	{
	    int sum=0;
	    int n=ob.nextInt();
	    int k=ob.nextInt();
	    int a[]=new int[n];
	    for(int j=0;j<a.length;j++)
	    {
	       a[j]=ob.nextInt();
	       sum=sum+a[j];
	    }
	    int x=sum%k;
	    System.out.println(x);
	}
	}
	catch(Exception e)
	{
	    return;
	}
	}
}