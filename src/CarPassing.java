
public class CarPassing {

	public static void main(String[] args) {
		int pair  = 0;
		int zeroCount = 0;
		int[] A = { 0, 1, 0, 1, 1 };
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				zeroCount++;
			} else {
				pair  += zeroCount;
			}
		}
    System.out.println(pair );
	}
}
