import java.util.Scanner;

class Node
	{
		private int data;
		private Node nextNode;
		public Node()
		{
			data=0;
			nextNode=null;
		}
		public Node(int  d , Node n) {
			data=d;
			nextNode=n;
		}
		public void setData(int d) 
		{
		    data = d;	
		}
		public void setNext(Node n) 
		{
		   nextNode=n;	
		}
		public int getData() 
		{
		     return(data);	
		}
		public Node getNext() 
		{
		     return(nextNode);	
		}
	}
class Linkedlist
{
	private int size;
	private Node startNode;
	public Linkedlist() {
		// TODO Auto-generated constructor stub
	size=0;
	startNode=null;
	}
	public void InsertatFirst(int value)
	{
		Node n=new Node();
		n.setData(value);
		n.setNext(startNode);
		startNode=n;
		size++;
		
	}
	public void InsertatLast(int value) 
	{
	     	  Node n,t;
	     	  n=new Node();
	     	  n.setData(value);
	     	  t=startNode;
	     	  if(t==null)
	     		  startNode=n;
	     	  else
	     	  {
	     	  while(t.getNext() != null)
	     	 
	     		  t=t.getNext();
	     	  
	      t.setNext(n);
	     	  }
	 
	     	  
	     	  size++;
	     	  }
	
	
	public void InsertatPos(int value,int pos) 
	{
	    if(pos==1)
	    	InsertatFirst(value);
	    else if (pos==size+1) {
			InsertatLast(value);
		}
	    else if (pos<1 && pos<=size) {
			
	    	Node n=new Node(value,null);
	    	Node t=startNode;
	    	for(int i=1;i<pos-1;i++)
	    		t=t.getNext();
	        n.setNext(t.getNext());
	        t.setNext(n);
	        size++;
		}
	    else {
			System.out.println("Insertion is not possible at position :"+ pos);
		}
	}
	public void DeleteFirst() 
	{
	     if(startNode==null)
	    	 System.out.println("List is already empty");
	     else {
			startNode=startNode.getNext();
			size--;
		}
	}
	public void DeleteLast() 
	{
		if(startNode==null)
	    	 System.out.println("List is already empty");
		else if (size==1) {
			startNode=null;
			size--;
		}
		else {
			Node t=startNode;
			for (int i = 0; i < size-1; i++) {
				t=t.getNext();
			}
			t.setNext(null);
			size--;
		}
	   	
	}
	public void DeleteatPos(int pos)
	{
		if(startNode==null)
			System.out.println("List is already empty");
		else if (pos<1 || pos>size) {
			System.out.println("Deletion is not possible");
		}
		else if (pos==1) {
			DeleteFirst();
		}
		else if (pos==size) {
			DeleteLast();
		}
		else {
			Node t= startNode;
			Node t1;
			for(int i=1;i<pos-1;i++)
				t=t.getNext();
			t1=t.getNext();
			t.setNext(t1.getNext());
			size--;
		}
	}
	public boolean isempty() 
	{
	     if(startNode==null)
	     {
	    	 return true;
	     }
	     else {
			return false;
		}
	}
	public int getlistsize() 
	{
	   return(size);	
	}
	public void viewList()
	{
		Node tNode;
		if(isempty())
			System.out.println("List is empty");
		else {
			tNode=startNode;
			for(int i=1;i<=size;i++)
			{
				System.out.print(" "+tNode.getData());
				tNode=tNode.getNext();
			}
		}
		
	}
}
public class Linked_List
{
	public static void main(String[] args) 
	{
	     Scanner scanner=new Scanner(System.in)	;
	     Linkedlist linkedlist= new Linkedlist();
	     boolean flag=true;
	    		 while(flag) {
	    			 System.out.println("");
	     System.out.println("1. Add item at start");
	     System.out.println("2. Add item at Last");
	     System.out.println("3. Add item at position");
	     System.out.println("4. Delete item at start");
	     System.out.println("5. Delete item at Last");
	     System.out.println("6. Delete item at position");
	     System.out.println("7. View List");
	     System.out.println("8. Exit");
	     System.out.println("Enter your choice");
	     int choice=scanner.nextInt();
	     int position,val;
	     switch(choice)
	     {
	     case 1:      System.out.println("Enter value");
                         val=scanner.nextInt();
	    	             linkedlist.InsertatFirst(val);
	    	             break;
	     case 2:     System.out.println("Enter value");
                         val=scanner.nextInt();
	    	            linkedlist.InsertatLast(val);
	    	            break;
	     case 3:  System.out.println("Enter position");
	             position=scanner.nextInt();
	             System.out.println("Enter value");
	             val=scanner.nextInt();
	             linkedlist.InsertatPos(val, position);
	             break;
	    	 
	     case 4:  linkedlist.DeleteFirst();
	               break;
	    	 
	     case 5:  linkedlist.DeleteLast();
	    	      break;
	     case 6:  System.out.println("Enter position");
	                position=scanner.nextInt();
	                linkedlist.DeleteatPos(position);
	                break;
	    	 
	     case 7:  linkedlist.viewList();
	     break;
	    	 
	     case 8: flag=false;
	     break;
	     default:
	    	 System.out.println("Invalid Choice");
	     }
	    		 }
	}
}
