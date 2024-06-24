package Java8;

public class SecondLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 30, -8, 67,-2, 55, 23, 14,78 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {	
			    secondLargest=largest;
				largest = arr[i];
				
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
	}
}
