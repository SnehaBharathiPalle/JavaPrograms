package Java8;

import java.util.Arrays;

public class ConsecutiveArray {
	public static void main(String[] args) {
		int[] arr= {-2,10,4};
		Arrays.sort(arr);
		int n=arr.length;
		int count=0;
		for(int i=0;i<n-1;i++) {
			int diff=arr[i+1]-arr[i];
			diff=diff-1;
			count=count+diff;
			
		}
		System.out.println(count);
	}
}
	
