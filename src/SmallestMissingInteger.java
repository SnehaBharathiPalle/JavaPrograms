//https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/

import java.util.*;

public class SmallestMissingInteger {

	public static void main(String[] args) {

		int[] nums = { 1,2,3,2,5 };
		System.out.println("Answer is :" + missingInteger(nums));

	}

	public static int missingInteger(int[] nums) {
	       int n = nums.length;
			List<Integer> list = new ArrayList<>();
			for (int k = 0; k < n; k++) {
				list.add(nums[k]);
			}

			int sum = nums[0];
			
			for (int i = 0; i < n - 1; i++) {
				if (nums[i] + 1 == nums[i + 1]) {
					sum = sum + nums[i + 1];
				} else {
					break;
				}
			}
			while (list.contains(sum)) {
				sum = sum + 1;
			}
			return sum;
	    }
}
