package Java8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {
	
	
	public static void main(String[] args) {
		char[] chars= {'a','a','b','b','c','c','c'};
		Map<Character,Integer> map=new HashMap<>();
        for(char c: chars){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                 map.put(c, 1);
            }  
        }  
      ArrayList<Character> list=new   ArrayList<Character>();
            for(Map.Entry<Character,Integer> hm:map.entrySet()){
               list.add(hm.getKey());
                int value=hm.getValue();
                if(value>1 && value<10){
                   list.add(String.valueOf(value).charAt(0));
                }else if(value>=10) {
                	String s=String.valueOf(value);
                	for(int i=0;i<s.length();i++) {
                		  list.add(s.charAt(i));
                	}
                }
             }
            System.out.println("Sne");
             
	}

	
}
