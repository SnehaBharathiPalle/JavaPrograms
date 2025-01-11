package Java8;

import java.util.*;
import java.util.Map.Entry;

public class ASCI_Value {
	public static void main(String[] args) {
	
	
	//Iterating through HAshMAp
	LinkedHashMap<String,Integer> m =  
            new LinkedHashMap<String, Integer>(); 
      
    m.put("SNE" , 250); 
    m.put("SID" , 78); 
    m.put("LALLI", 888);
    //Sort map based on values using java SE8
    for(Entry<String,Integer> hm: m.entrySet()) {
    	System.out.println(hm.getKey()+": "+hm.getValue());
    }
   
 m.entrySet().stream().sorted((o1,o2)->o2.getValue().compareTo(o1.getValue()))
 .forEach(s->System.out.println(s.getKey()+":Sorted based on Value "+s.getValue()));
 
 
		
		/*
		int num = 0;
		int n = s.length();
		// Iterate till length of the string
		for (int i = 0; i < n; i++) {
			// Subtract 48 from the current digit
			char c = s.charAt(0);
			int asc=c;
			int temp = asc - 48;
			num = num * 10 + temp;
			// Print the answer
			System.out.print(num);
	}*/
	
	}
}
