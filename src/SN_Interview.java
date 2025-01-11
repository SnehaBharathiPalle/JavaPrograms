public class SN_Interview {

	public static void main(String[] args) {

		String s = "cbbd";
		String answer = longestPalindrome(s);
		System.out.println(answer);
	}

	public static String longestPalindrome(String s) {
		String result = "";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String str = s.substring(i, j);
				if (isPalindrome(str)) {
					if (str.length() > result.length()) {
						result = str;
					}
				}
			}
		}
		return result;
	}

	public static boolean isPalindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + String.valueOf(s.charAt(i));
		}
		if (rev.equals(s)) {
			return true;
		}
		return false;
	}
}
