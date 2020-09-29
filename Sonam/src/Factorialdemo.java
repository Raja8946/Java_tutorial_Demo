import java.util.Scanner;

public class Factorialdemo {
 static int stepcount=0;
    public static void main(String[] args) {
    	Scanner scanner =new Scanner(System.in);
    	System.out.println("Enter no");
        int num = scanner.nextInt();
        
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        System.out.println("Steps :"+stepcount);
    }
     static long multiplyNumbers(int num)
    {
    	stepcount++;
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}

/*

class Factorialdemo
{
	public static void main(String[] args) 
	{
	    System.out.println("Enter no");
	    int stepcount=0;
	    Scanner scanner=new Scanner(System.in);
	    int num=scanner.nextInt();
	    int a=num;
	    for(int i=1;i<a;i++)
	    {
	    	stepcount++;
	    	num=num*i;
	    }
	    System.out.println(num+" "+stepcount);
	    
	}
}*/