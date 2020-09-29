import java.util.Scanner;

public class Sum_of_digit 
{
      public static void main(String[] args) 
      {  
    	 
    	        Scanner input = new Scanner(System.in);

    	        int number_Of_DaysInMonth = 0; 
    	  
 System.out.print("-----");
    	        
    	      
    	       
    	        int year = input.nextInt();
    	        int month = input.nextInt();


    	        switch (month) {
    	            case 1:
    	            
    	                number_Of_DaysInMonth = 31;
    	                break;
    	            case 2:
    	     
    	                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
    	                    number_Of_DaysInMonth = 29;
    	                } else {
    	                    number_Of_DaysInMonth = 28;
    	                }
    	                break;
    	            case 3:
    	     
    	                number_Of_DaysInMonth = 31;
    	                break;
    	            case 4:
    	     
    	                number_Of_DaysInMonth = 30;
    	                break;
    	            case 5:
    	    
    	                number_Of_DaysInMonth = 31;
    	                break;
    	            case 6:
    	     
    	                number_Of_DaysInMonth = 30;
    	                break;
    	            case 7:
    	
    	                number_Of_DaysInMonth = 31;
    	                break;
    	            case 8:
    	    
    	                number_Of_DaysInMonth = 31;
    	                break;
    	            case 9:
    	 
    	                number_Of_DaysInMonth = 30;
    	                break;
    	            case 10:
    	   
    	                number_Of_DaysInMonth = 31;
    	                break;
    	            case 11:
    	   
    	                number_Of_DaysInMonth = 30;
    	                break;
    	            case 12:
    	  
    	                number_Of_DaysInMonth = 31;
    	                
    	                
    	        }
    	        if (month>12)
    	        {
    	        	System.out.println("Error");
    	        }
    	        else {
					
				
    	        System.out.printf(year+"-"+ month + ": " + number_Of_DaysInMonth + " days\n");
    	        }
    	        }
    	}