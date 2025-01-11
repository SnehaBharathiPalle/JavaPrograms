import java.util.*;

public class EZE_Interview2 {

	public static void main(String[] args) {
		int[] arr1 = { 9, 76, 90, 23, 67 };
		int[] arr2 = { 7, 11, 56, 87,23 };
		int n = arr1.length + arr2.length;
		int[] arr = new int[n];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr[j] = arr1[i];
			j++;
		}
		for (int i = 0; i < arr2.length; i++) {
			arr[j] = arr2[i];
			j++;
		}

		// Arrays.sort(arr);
		// do sorting manually
		for (int i = 0; i < arr.length; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
