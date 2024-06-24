package Java8;

import java.util.*;

public class AnagramList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<List<String>> finalana = groupAnagrams(str);

	}

	public static List<List<String>> groupAnagrams(String[] str) {

		List<List<String>> list = new ArrayList<List<String>>();
		HashMap<String, List<String>> map= new 	HashMap<>();
		
	  for(String s: str) {
		  char[] ch=s.toCharArray();
		  Arrays.sort(ch);
		  String key= new String(ch);
		  List<String> li=new ArrayList<String>();
		  if(map.containsKey(key)) { 
			 li= map.get(key);
			  li.add(s); 
		  }else {
			  li.add(s);
		  }
		  map.put(key, li);  
	  }	
	  
	  for(Map.Entry<String, List<String>> hm: map.entrySet()) {
			list.add(hm.getValue());
		}
	  
	  return list;
		
	}

}
