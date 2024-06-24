package Java8;
public class ArrayExceptSelf {

	public static void main(String[] args) {
		//ProductOf array except self with O(n) complexity
		int[] nums = { 1, 2, 3, 4 };
		int n = nums.length;
		int[] prefix = new int[n];
		int[] postfix = new int[n];
		int[] res = new int[n];
		int prod = 1;
		for (int i = 0; i < n; i++) {
			prod = prod * nums[i];
			prefix[i] = prod;
		}
		prod = 1;
		for (int i = n - 1; i >= 0; i--) {
			prod = prod * nums[i];
			postfix[i] = prod;
		}
		for (int i = 0; i < n; i++) {
			if (i > 0 && i < n - 1) {
				res[i] = prefix[i - 1] * postfix[i + 1];
			} else if (i == 0) {
				res[i] = postfix[i + 1];
			} else if (i == n - 1) {
				res[i] = prefix[i - 1];
			}
		}
		
		System.out.println("SNE");

	}

}
