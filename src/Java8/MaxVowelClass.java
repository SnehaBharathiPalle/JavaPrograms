package Java8;

public class MaxVowelClass {
	public static void main(String[] args) {
//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
		String s = "abciiidef";
		int k = 2;
		int tempk = k;
		int vowelCount = 0;
		for (int i = 0; i < k; i++) {
			if (isVowel(s.charAt(i))) {
				vowelCount++;
			}

		}
		int right = 1;
		int left = 1;
		int tempvowelCount = 0;
		while (right < s.length()) {
			tempk--;
			if (isVowel(s.charAt(right))) {
				tempvowelCount++;
			}
			if (tempk == 0) {
				vowelCount = Math.max(vowelCount, tempvowelCount);
				if (isVowel(s.charAt(left))) {
					tempvowelCount--;
				}
				tempk++;
				left++;
			}
			if (vowelCount == k) {
				break;
			}
			right++;

		}
		System.out.println(vowelCount);
	}

	// it return true if the character is vowel
	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}
