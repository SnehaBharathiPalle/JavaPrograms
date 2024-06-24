package Java8;

import java.util.Arrays;
//https://app.codility.com/demo/results/trainingDS4NDT-VQX/
public class ABCodility {

	public static void main(String[] args) {
		// 10:00', '13:21')
		String E = "11:02";
		String F = "11:42";
		String[] start = E.split(":");
		String[] end = F.split(":");
		int startMinutes = Integer.valueOf(start[0]) * 60 + Integer.valueOf(start[1]);
		int endMinutes = Integer.valueOf(end[0]) * 60 + Integer.valueOf(end[1]);
		int totalMinutes = endMinutes - startMinutes;
		int totalHours = totalMinutes / 60;
		int remMin = totalMinutes % 60;

		int sum = 0;
		if (totalHours > 0 && remMin >= 0) {
			sum = sum + 5;// entry fee and first hour fee
			totalHours = totalHours - 1;
			if (totalHours > 0) {
				sum = sum + (4 * totalHours);
			}
			if (remMin > 0) {
				sum = sum + 4;
			}
		} else if (totalHours == 0 && remMin > 0) {
			sum = sum + 5;
		}
		System.out.println(sum);

	}

}
