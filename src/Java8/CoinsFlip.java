package Java8;

public class CoinsFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,1,1 };
		int count = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] == 1) {
				if (arr[i - 1] == 1 && arr[i + 1] == 0) {
					arr[i - 1] = 0;
					count = count + 1;
				} else if (arr[i - 1] == 1 && arr[i + 1] == 1) {
					arr[i] = 0;
					count = count + 1;
				} else if (arr[i - 1] == 0 && arr[i + 1] == 1) {
					arr[i + 1] = 0;
					count = count + 1;
				}
			} else if (arr[i] == 0) {
				if (arr[i - 1] == 0 && arr[i + 1] == 1) {
					arr[i - 1] = 1;
					count = count + 1;
				} else if (arr[i - 1] == 0 && arr[i + 1] == 0) {
					arr[i] = 1;
					count = count + 1;
				} else if (arr[i - 1] == 1 && arr[i + 1] == 0) {
					arr[i + 1] = 1;
					count = count + 1;
				}
			}

		}

		System.out.println(count);

	}

}
