package Java8;

public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kadane's Algorithm
		int arr[] = {-10,-2 ,-3, -4};
		int n=arr.length;
		int finalMax=arr[0];
		 int currentmax=arr[0];
		for(int i=1;i<n;i++) {
			int tempSum=arr[i]+currentmax;
			currentmax=Math.max(tempSum, arr[i]);
			finalMax=Math.max(currentmax, finalMax);
			
		}
		System.out.println(finalMax);
	}
}


