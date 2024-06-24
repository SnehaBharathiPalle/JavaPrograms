package Java8;

import java.util.HashMap;

public class SubArrayWithSumofAnyValue {
	//Logic is prefixArray Sum which is 4 6 3 4 10
		//if prefx array has x, x+k in original array 2-3+1=0
		//here sum=x+k

	public static void main(String[] args) {

		int arr[] = { 1,-1,1 }; 
		int k=0;
		int n=arr.length;
		int result=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int sum=0;
		map.put(sum,1);
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			int key=sum-k;
			if(map.containsKey(key)) {
				result=result+map.get(key);
			}
				map.put(sum,map.getOrDefault(sum, 0)+1);
			
		}
		
		System.out.println(result);
		
	}
}
