package Java8;

import java.util.ArrayList;
import java.util.List;

public class MaxDigitAfterRemovingonlyOneDigit5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=-15958;
		//find positions of 5
		String S=String.valueOf(N);
		
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<S.length();i++) {
			if(S.substring(i,i+1).equals("5")) {
				list.add(i);
			}
			
		}
		int max=Integer.MIN_VALUE;
		for(int index:list) {
			StringBuffer sbf = new StringBuffer(S);
			System.out.println(index);
			sbf.deleteCharAt(index);
			 max=Math.max(max, Integer.valueOf(sbf.toString()));
			
		}
		
		System.out.println(max);
	}

}
