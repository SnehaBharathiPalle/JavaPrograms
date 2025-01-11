//https://www.bing.com/videos/riverview/relatedvideo?&q=minimum+jumps&&mid=1AC14EB4D36E87BBF9BB1AC14EB4D36E87BBF9BB&&mcid=15391656FF0B43E8AF01F881D2365C69&FORM=VRDGAR

public class Min_Jumps {

	public static void main(String[] args) {
//Moving zeros to right
		// EAsy Approach, not sure why I did not get this in my mind
		// TRy focussing on moving non zero elements to left
		int[] arr = { 1, 4, 3, 2, 6, 7 };
		int destination = arr.length - 1;
		int coverage = 0;
		int totalJumps = 0;
		int lastJumpIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			coverage = Math.max(coverage, i + arr[i]);
			if (i == lastJumpIndex) {
				lastJumpIndex=coverage;
				totalJumps++;
				if (coverage >= destination) {
					break;
				}
			}
		}
		
		System.out.println(totalJumps);

	}
}
