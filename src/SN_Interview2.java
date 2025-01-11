//https://www.youtube.com/watch?v=UflHuQj6MVA&t=309s
//Geeks for Geeks
public class SN_Interview2 {

	public static void main(String[] args) {

		String s = "forgeeksskeegfor";
		String answer = longestPalindrome(s);
		System.out.println(answer);
	}

	public static String longestPalindrome(String s) {

		int n = s.length();
		String r = s.substring(0, 1);
		String res = "";
		int maxLength = 1;
		// All substrings of length 1 are palindromes

		boolean[][] dp = new boolean[n][n];
		//Single String
		for (int i = 0; i < n; i++) {
			dp[i][i] = true;
		}
		//Two String
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				dp[i][i + 1] = true;
				String temp = s.substring(i, i + 2);
				if (temp.length() > maxLength) {
					res = temp;
					maxLength = temp.length();

				}
			}
		}
// THree string and more
		int left = 0;
		int right = 0;
		for (int k = 3; k <=n; k++) {
			right = left + k;
			//sliding window approach
			while (left >= 0 && right <= n) {
				String temp = s.substring(left, right);
				System.out.println(temp);
				if (s.charAt(left) == s.charAt(right - 1)) {
					if (dp[left + 1][right - 2]) {
						dp[left][right - 1]=true;
						System.out.println("HURRAY "+temp);
						if (temp.length() > maxLength) {
							res = temp;
							maxLength = temp.length();
						}
					}
				}
				left++;
				right++;
			}
			left=0;
		}

		return res;
	}
}
