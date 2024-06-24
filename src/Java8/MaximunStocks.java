package Java8;

import java.util.*;

public class MaximunStocks {

	public static void main(String[] args) {
		int[] arr = { 6, 1, 2, 8, 3, 4, 7, 9, 5 };
		int res = missingNumber(arr, 5);
		System.out.println(res);

	}

	public static int missingNumber(int arr[], int n) {

		Arrays.sort(arr);
		int res = -1;
		if (arr[0] != 1) {
			return 1;
		} else if (arr[arr.length - 1] == n - 1) {
			return n;
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				int diff = arr[i + 1] - arr[i];
				if (diff == 2) {
					res = arr[i] + 1;
					break;
				}
			}
		}
		return res;
	}
}
