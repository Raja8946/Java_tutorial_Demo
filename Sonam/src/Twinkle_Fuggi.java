import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Twinkle_Fuggi 
{
     public static void main(String[] args) 
     {
	      List<Integer> twinkle=new LinkedList<Integer>();	
	      List<Integer> fuggi = new ArrayList<Integer>();
	      getTimeDiff(twinkle);
	      getTimeDiff(fuggi);
	      
	}
     static void getTimeDiff(List<Integer> list)
     {
    	 long start=System.currentTimeMillis();
    	 for(int i=0;i<100000;i++)
    	 {
    		 //list.add(i);
    		 list.add(0,i);
    	 }
    	 long end= System.currentTimeMillis();
    	 System.out.println(list.getClass().getName()+"-->"+(end-start));
     }
}
