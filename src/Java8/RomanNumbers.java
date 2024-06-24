package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map=new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		
		String str="DVVI";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			String s=str.substring(i,i+1);
			sum=sum+map.get(s);
			
		}
		System.out.println(sum);
		//find nearset letter to sum
		
		String res="";
		while(sum>=1){
			String rl=getClosetRomanLetter(map,sum);
			res=res+rl;
			sum=sum-map.get(rl);
			
		}
		
		System.out.println(res);
		
		

	}
	public static String getClosetRomanLetter(Map<String,Integer> map, int sum) {
		if(sum==1) {
			return "I";
		}
		
		int highDiff=sum-1;
		String closestRomanletter="";
		for(Entry<String,Integer> hm:map.entrySet()) {
			int diff=Math.abs(sum-hm.getValue());
			if(diff<highDiff) {
				highDiff=diff;
				closestRomanletter=hm.getKey();
			}
			
		}
		
		return closestRomanletter;
	}

}
