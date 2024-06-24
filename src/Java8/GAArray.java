package Java8;
import java.util.Arrays;

public class GAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 4, 5, 1, 2, 3, 1, 3 };
		int x = 5;
		double[] res = result(arr, x);
		System.out.println(Arrays.toString(res));

	}

	public static double[] result(int[] arr, int x) {
		double[] res = new double[arr.length - x + 1];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			double sum = 0;
			if (arr.length - i >= x) {
				int temp = 1;
				for (int j = i; j < arr.length; j++) {
					if (temp <= x) {
						sum = sum + arr[j];
						temp = temp + 1;
					} else {
						break;
					}
				}
				//2 places to round
				double scale = Math.pow(10, 2);
				sum=sum/x;
				res[count] = Math.round(sum * scale) / scale;
				count = count + 1;
			}else {
				break;
			}

		}
		return res;

	}

}
