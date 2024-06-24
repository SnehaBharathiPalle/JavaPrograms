package Java8;

public class CodilitySrtringWithOut_AAA_BBB {
//https://app.codility.com/c/run/training8ERB69-5VV/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aCount = 5;
		int bCount = 3;
		StringBuilder result = new StringBuilder();

		// Loop until one of aCount or bCount becomes 0
		while (aCount > 0 && bCount > 0) {
			// If there are more 'a's left, append "aab" to the result
			if (aCount > bCount) {
				result.append("aab");
				aCount -= 2; // Used two 'a's
				bCount -= 1; // Used one 'b'
			}
			// If there are more 'b's left, append "bba" to the result
			else if (aCount < bCount) {
				result.append("bba");
				aCount -= 1; // Used one 'a'
				bCount -= 2; // Used two 'b's
			}
			// If the number of 'a' and 'b' is equal, append "ab" to the result
			else {
				result.append("ab");
				aCount -= 1; // Used one 'a'
				bCount -= 1; // Used one 'b'
			}
		}

		// If any 'a's are left, append all remaining 'a's at the end.
		// Repeat 'a' the number of times that are left
		while (aCount > 0) {
			result.append("a");
			aCount--;
		}

		// If any 'b's are left, append all remaining 'b's at the end.
		// Repeat 'b' the number of times that are left
		while (bCount > 0) {
			result.append("b");
			bCount--;
		}

		// Convert the StringBuilder to a string and return
		System.out.println(result.toString());

	}

}
