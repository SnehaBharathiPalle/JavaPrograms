package Java8;

public class LongestSubArrayAfterDeleting1 {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 0, 1,0};
		int n = longestSubarray(arr);
		System.out.println(n);

	}

	public static int longestSubarray(int[] nums) {
		 int left = 0;
	        int right=0;
	        int k=1;
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
	        
	        return right-left-1;
	        
	      
	}
}
