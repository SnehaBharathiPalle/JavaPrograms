package Java8;
public class TripletArray {
	public static void main(String[] args) {
		boolean flag=false;
		int[] nums= {2,1,5,0,4,6};
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= a) {
				a = nums[i];
			} else if (nums[i] < b) {
				b = nums[i];
			} else if (nums[i] > b) {
				flag=true;
				break;
			}
		}
	System.out.println(flag);

	}
}
