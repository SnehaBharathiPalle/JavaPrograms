//https://www.bing.com/videos/riverview/relatedvideo?&q=minimum+jumps&&mid=1AC14EB4D36E87BBF9BB1AC14EB4D36E87BBF9BB&&mcid=15391656FF0B43E8AF01F881D2365C69&FORM=VRDGAR
package Java8;

public class MinJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0, 2, 8, 1, 2, 3, 1, 1, 2 };
		int dest = nums.length - 1;
		int coverage = 0;
		int lastJumpIdx = 0;
		int totalJumps = 0;
		if (nums.length == 1) {
			System.out.println(totalJumps);
		} else {
			//Greedy Strategy- Why am I not able to think this way
			for (int i = 0; i < nums.length; i++) {
				coverage = Math.max(coverage, i + nums[i]);
				if (i==lastJumpIdx) {
					lastJumpIdx=coverage;//last jump from position
					totalJumps++;
					if (coverage >= dest) {
						break;
					}
				}
			}
			System.out.println(totalJumps);
		}
		
	}

}
