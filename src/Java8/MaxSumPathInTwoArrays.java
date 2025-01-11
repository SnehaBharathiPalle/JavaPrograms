package Java8;

public class MaxSumPathInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 2, 3, 7, 10, 12 };
		int arr2[] = { 1, 5, 7, 8 };
		int i = 0;
		int sum1 = 0;
		int m = arr1.length;
		int j = 0;
		int sum2 = 0;
		int n = arr2.length;
		int res = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				sum1 = sum1 + arr1[i];
				i++;
			} else if (arr2[j] < arr1[i]) {
				sum2 = sum2 + arr2[j];
				j++;
			} else {
				// reached common point
				res = res + Math.max(sum1, sum2) + arr2[j];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}

		// add remaining element of arr1
		while (i < m) {
			sum1 = sum1 + arr1[i];
			i++;
		}
		while (j < n) {
			sum2 = sum2 + arr2[j];
			j++;
		}
		res = res + Math.max(sum1, sum2);
		System.out.println(res);

	}
}
