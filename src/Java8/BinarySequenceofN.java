package Java8;

public class BinarySequenceofN {
	public static void main(String[] args) {
		String binary = getBinary(32);

		int maxCount = 0;
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.substring(i, i + 1).equals("1")) {
				startIndex = i;
				endIndex = i;
				break;
			}
		}
		for (int i = startIndex + 1; i < binary.length(); i++) {
			if (binary.substring(i, i + 1).equals("1")) {
				endIndex = i;
				maxCount = Math.max(maxCount, (endIndex - startIndex));
				startIndex = i;
			}
		}
		System.out.println(maxCount - 1);
	}

	public static String getBinary(int N) {
		String res = "";
		while (N != 1) {
			int rem = N % 2;
			res = res + String.valueOf(rem);
			N = N / 2;
		}
		res = res + "1";
		;
		String binary = "";
		for (int i = res.length() - 1; i >= 0; i--) {
			binary = binary + res.charAt(i);
		}
		return binary;
	}

}
