package Java8;

//https://www.geeksforgeeks.org/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/
//I failed to provide Optimal solution in ZoomInfo Interview
public class ClosetPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 4, 5, 7 };
		int arr2[] = {10, 20, 30, 40};
		int x = 50;

		// Approach
//		closet pair means sum should be minimum like 0
//		Easily solve in brute force using 2 for loops
		// but what is the optimal solution

		int i = 0;
		int j = arr2.length - 1;
		int y = arr1[i];
		int z = arr2[j];

		while (i < arr1.length && j >= 0) {
			int diff = arr1[i] + arr2[j] - x;
			if (Math.abs(diff) < Math.abs(y + z - x)) {//which ever difference is less that is closer to one
				y = arr1[i];
				z = arr2[j];
			}
			// below 3 edge cases are logic
			if (arr1[i] + arr2[j] == x) {
				break;
			} else if ( arr1[i] + arr2[j] > x) {
				j--;
			} else if (arr1[i] + arr2[j] < x) {
				i++;
			}

		}
		System.out.println("closet Pair (" + y + "," + z + ")");

	}

}
