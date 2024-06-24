package Java8;

public class MaxVowelClass2 {
	public static void main(String[] args) {
//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
		String s = "leeicode";
		int k = 3;
        int tempk=0;
		int left=0;
		int vowelCount=0;
		int tempVowelCount=0;
		for(int right=0;right<s.length();right++) {
			tempk++;
			if(isVowel(s.charAt(right))){
				tempVowelCount++;
			}
			if(tempVowelCount==k) {
				vowelCount=k;
				break;
			}
			if(tempk==k) {
				vowelCount=Math.max(tempVowelCount, vowelCount);
				if(isVowel(s.charAt(left))){
					tempVowelCount--;
				}
				left++;
				tempk--;
			}
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
