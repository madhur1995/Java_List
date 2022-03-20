package listProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class list1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	  
	      //Printing the arraylist object   
	      System.out.println(list);  
	      list.remove(0);
	      System.out.print(list.indexOf("Banana"));
	      System.out.println(list);  
	      
	      System.out.println("************************************");    
	      
	      
	      Iterator<String> itr=list.iterator();//getting the Iterator  
	      while(itr.hasNext()){//check if iterator has the elements  
	      System.out.println(itr.next());//printing the element and move to next  
	      }
	      
	      System.out.println("************************************");    
	      
	      for(String fruit:list)    
	    	    {
	    	  System.out.println(fruit);    
	    	    }
	      
	      
	      
	      Collections.sort(list);  
	      //Traversing list through the for-each loop  
	     for(String fruit:list)  
	       System.out.println(fruit);  
	         
	      
	     


	}

}
