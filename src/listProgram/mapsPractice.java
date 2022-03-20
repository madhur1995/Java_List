package listProgram;

import java.util.HashMap;
import java.util.Map;

public class mapsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Map<String, Integer> hm
          = new HashMap<String, Integer>();

      // Inserting pairs in above Map
      // using put() method
      hm.put("a", 100);
      hm.put("b", 200);
      hm.put("c", 300);
      hm.put("d", 400);
      
      System.out.print(hm);
      
      for (Map.Entry<String, Integer> me :
          hm.entrySet()) {

         // Printing keys
         System.out.print(me.getKey() + ":");
         System.out.println(me.getValue());

	}
	}
}
