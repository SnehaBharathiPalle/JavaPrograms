package Java8;
import java.util.*;

public class MedianArray {
	public static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		int[] flowerbed = { 1};
		int n = 0;

		boolean finalFlag = canPlaceFlowers(flowerbed, n);
		System.out.println(finalFlag);
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		boolean flag = false;
		int temp = 0;
		int i = 0;
		if (flowerbed.length == 1 && flowerbed[i] == 0 && n == 1) {
			flag = true;
			return flag;
		} else if (flowerbed.length == 1 && flowerbed[i] == 1 && n >= 1) {
			return flag;
		} else if (flowerbed.length == 1 && flowerbed[i] == 1 && n == 0) {
			flag = true;
			return flag;
		} else if (n == 0) {
			int pos = flowerbed[0];
			if (pos == 0) {
				pos = 1;
			} else {
				pos = 0;
			}
			for (int k = 1; k < flowerbed.length; k++) {
				if (pos == flowerbed[k]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
				if (pos == 0) {
					pos = 1;
				} else {
					pos = 0;
				}
			}
			return flag;
		}

		while (i < flowerbed.length) {
			boolean cond = flowerbed[i] == 0;
			if (cond) {
				boolean cond1 = (i == 0) && (flowerbed[i + 1] == 0);
				boolean cond2 = (i == flowerbed.length - 1) && (flowerbed[i - 1] == 0);
				boolean cond3 = (i > 0) && (i < flowerbed.length - 1) && (flowerbed[i - 1] == 0)
						&& (flowerbed[i + 1] == 0);
				if (cond1 || cond2 || cond3) {
					temp++;
					i = i + 2;
				} else {
					i = i + 1;
				}
			} else {
				i = i + 1;
			}
			if (temp == n) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
