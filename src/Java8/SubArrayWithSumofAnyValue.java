package Java8;

import java.util.HashMap;

//https://www.youtube.com/watch?v=AmlVSNBHzJg&t=431s
public class SubArrayWithSumofAnyValue {
	// Logic is prefixArray Sum which is 4 6 3 4 10
	// if prefx array has x, x+k in original array 2-3+1=0
	// here sum=x+k

	public static void main(String[] args) {

		int arr[] = { 4, 6, 3, 7, 10 };
		int k = 10;
		int n = arr.length;
		int result = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		map.put(0, 1);
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];// here sum is Sum jth//here key is Sum ith
			int key = sum - k;// sumJ - sumI=k// SumJ-k=SumI //i=4 index, j= 6th index k=sum(jth)-sum(ith)
			
			if (map.containsKey(key)) {
				result = result + map.get(key);
			}
			//Adding sum to MAp
			if (map.containsKey(sum)) {
				map.put(sum, map.get(sum) + 1);
			} else {
				map.put(sum,1);
			}

		}

		System.out.println(result);

	}
}
