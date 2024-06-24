package Java8;

public class Permutation {

	public static void main(String[] args) {
		String s = "231";
		permutations(s.toCharArray(), 0);

	}

	public static void swap(char[] charArray, int i, int j) {
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
	}

	public static void swap(char[] charArray) {

	}

	public static void permutations(char[] ar, int fi) {
		if (fi == ar.length - 1) {
			System.out.println(ar);

		}
		for (int i = fi; i < ar.length; i++) {
			swap(ar, i, fi);
			permutations(ar, fi + 1);
			swap(ar, i, fi);
		}
	}
}
