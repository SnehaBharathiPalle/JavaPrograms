package Java8;

import java.util.Arrays;

public class UniqueArray {
	//https://www.geeksforgeeks.org/minimum-increment-operations-to-make-array-unique/
	//wow what an approach of sorting and comparing it previous element
	public static void main(String[] args) {
		int[] arr= {3, 2, 1, 2, 1, 7};
		Arrays.sort(arr);
		// 1 1 2 2 3 7
		int count=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<=arr[i-1]) {
				int temp=arr[i];
				arr[i]=arr[i-1]+1;
				count=count+(arr[i]-temp);
				
			}
			
		}
		

	}

}
