package Java8;

import java.util.Arrays;
//2. You are given an integer array nums consisting of n elements, and an integer k. Your task is to find a contiguous subarray of length k within nums that has the maximum average value and return this maximum average value.
//Example->
//[1, 12, -5, -6, 50, 3] and an integer k = 4.
//Output: The maximum average value is 12.75000.
public class ContigiousArray {
//I am going to follow Sliding Window Approach
	public static void main(String[] args) {
		int[] arr= {1, 12, -5, -6, 50, 3};
		int k=4;
		double sum=0;
		int right=0;
		int left=0;
		while(right<k) {
			sum=sum+arr[right];
			right++;
		}
		double avg=sum/k;
		while(right<arr.length) {
			sum=sum-arr[left]+arr[right];
			double tempAvg=sum/k;
			if(tempAvg>avg) {
				avg=tempAvg;
			}
			left++;
			right++;	
		}
		System.out.println(avg);
	}
}
	
