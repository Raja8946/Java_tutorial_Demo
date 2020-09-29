import java.util.Scanner;

 class Codechef_long_challenge_september_2020_4 
{
    public static void main(String[] args) 
    {
	     Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter test case");
	     int t= scanner.nextInt();
	     for(int i=0;i<t;i++)
	     {
	    	 int n= scanner.nextInt();
	    	 if(n>0)
	    	 {
	    	 int sum=(n*(n+1))/2;
	    	 int count=0;
	    	
	    	 
	    	 if(sum%2 != 0)
	    	 {
	    		 System.out.println(count);
	    	 }
	    	 else {
				int half=sum/2;
				int summ=0;
				for(int j=n;j>=1;j--)
				{
					summ+=j;
					count++;
					if(summ>half)
					{
						break;
					}
				}
				System.out.println(count);
			}
	     }
	}
}
}