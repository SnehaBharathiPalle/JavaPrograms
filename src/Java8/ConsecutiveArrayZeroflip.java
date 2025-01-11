package Java8;

public class ConsecutiveArrayZeroflip {
//https://leetcode.com/problems/max-consecutive-ones-iii/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,1,0,1,0,1,1,0,0,0};
		int k=2;
		int ans=longestOnes(nums,k);
		System.out.println(ans);
	}
	
	public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right=0;
        while(right<nums.length) {
        	if(nums[right]==0) {
        		k--;
        	}
        	if(k<0) {
        		if(nums[left]==0) {
        			k++;
        		}
        		left++;
        	}  	
        	right++;
        }
        
        return right-left;
    }

}
