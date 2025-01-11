
public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] strs = { "flower", "flow", "flight" };
		System.out.println("Answer is"+longestCommonPrefix(strs));

	}

	public static String longestCommonPrefix(String[] strs) {
		int n = strs.length;
		int min = Integer.MAX_VALUE;
		// Find min length String
		for (int i = 0; i < n; i++) {
			int len = strs[i].length();
			if (len < min) {
				min = len;
			}
		}
		String res = "";

		for (int i = 0; i <min; i++) {
			int j = 1;
			int count = 1;
			String start = strs[0].substring(i, i + 1);
			while (j < n) {
				String word = strs[j].substring(i, i + 1);
				if (word.equals(start)) {
					count++;
				} else {
					break;
				}
				j++;
			}
			

			if (count == n) {
				res = res + start;
			} else {
				break;
			}

		}

		return res;
	}

}
