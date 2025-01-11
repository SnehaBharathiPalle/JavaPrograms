
//moves zeros to right and others to left in the array and all elements other than zero should be in ascending order

import java.util.Arrays;

public class GOPi_INterview {

	public static void main(String[] args) {
//Moving zeros to right
		//EAsy Approach, not sure why I did not get this in my mind
		//TRy focussing on moving non zero elements to left
		int[] arr = { 0, 5, 0, 8, 7, 0, 1, 9, 0, 7, 0, 0 };

		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) {

			// If the current element is non-zero
			if (arr[i] != 0) {

				// Swap the current element with the 0 at index 'count'
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;

				// Move 'count' pointer to the next position
				count++;
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}
