package Java8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 90, 77, 23, 765, 8 };
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				break;
			} else {
				for (int j = i + 1; j < arr.length; j++) {
					int temp = 0;
					if (arr[j] < arr[i]) {
						// Swapping of Variables
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}

				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
