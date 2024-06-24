package Java8;

public class BitWiseOPerator {

	public static void main(String[] args) {

		String s1 = "01010";
		String s2 = "11";
		int len = Math.abs(s1.length() - s2.length());
		System.out.println(len);
		String temp = "";
		for (int i = 1; i <= len; i++) {
			temp = temp + "0";
		}
		if (s1.length() > s2.length()) {
			s2 = temp + s2;
		} else {
			s1 = temp + s1;
		}

		System.out.println(s1);
		System.out.println(s2);
		String res = "";
		for (int i = 0; i < s1.length(); i++) {
			String x = s1.substring(i, i + 1);
			String y = s2.substring(i, i + 1);
			if (x.equals("0") && y.equals("1")) {
				res = res + "1";
			} else if (x.equals("1") && y.equals("0")) {
				res = res + "1";
			} else if (x.equals("1") && y.equals("1")) {
				res = res + "1";
			} else if (x.equals("0") && y.equals("0")) {
				res = res + "0";
			}
		}
		
		System.out.println(res);
	}

}
