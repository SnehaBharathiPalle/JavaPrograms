package Java8;

import java.util.ArrayList;
import java.util.Arrays;

public class HappinessIndex {
	public static void main(String[] args) {
		int[] hap = { 1,1,3 };
		int k = 2;
		Arrays.sort(hap);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i =  hap.length - 1; i >= 0; i--) {
			list.add(hap[i]);
		}
		
		int sum = 0;
		int count = 0;
		while (count < k) {

			if (list.get(0) > 0) {
				sum = sum + list.get(0);
				list.remove(0);
				int n=list.size();
				for (int i = 0; i < n; i++) {
					list.set(i,list.get(i) - 1);
				}

			} else {
				break;
			}
			count = count + 1;
		}
		System.out.println(sum);
	}

}
