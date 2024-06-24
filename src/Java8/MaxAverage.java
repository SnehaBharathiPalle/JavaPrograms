package Java8;

public class MaxAverage {

	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3 };
		int k = 4;
		double ans = 0;
        double window = 0;

        // Calculate the first window
        for(int i = 0; i < k; i++) {
            window = window + nums[i];//12+(-5)+(-6)+50+3-12
        }

        // The window variable is the sum of all the numbers
        // We need to divide window for k to find the average
        ans = window / k;

        // Move the window to the right
        for(int right = k; right < nums.length; right++) {
        	double leftOne=nums[right - k];
        	double rightOne=nums[right] ;
            window =window+(rightOne-leftOne) ; // Add right-one and delete left-one
            ans = Math.max(ans, window / k); // Check the higher average on every slide of the window
        }
		System.out.println(ans);
		
	}
}
