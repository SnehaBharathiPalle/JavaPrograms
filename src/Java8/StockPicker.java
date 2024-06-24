package Java8;

public class StockPicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 14 20 5 12 11
		int[] arr = { 10,9,8,2};
		// x>y
		int diff = 0;
		for (int i = 0; i < arr.length; i++) {
			int currentPrice = arr[i];
			for (int j = i; j < arr.length; j++) {

				int futurePrice = arr[j];
				if (currentPrice < futurePrice) {
					int currentdiff = futurePrice - currentPrice;
					if (currentdiff > diff) {
						diff = currentdiff;
					}
				}
			}
		}

		if (diff == 0) {
			System.out.println(-1);
		} else {
			System.out.println(diff);
		}

	}

}
