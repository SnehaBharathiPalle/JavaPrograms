package Java8;

public class ValidIPAddress {

	public static void main(String[] args) {
		String s = "@34:1#2:12:034";
		String[] str = s.split(":");
		boolean format = false;
		if (str.length == 4) {
			for (String temp : str) {
				if (temp.length() <= 3 && isValidDigit(temp)) {
					format = true;
				} else {
					format = false;
					break;
				}
			}
		}

		if (format) {
			System.out.println("Valid IP Address number");
		} else {
			System.out.println("InValid IP Address number");
		}
	}

	public static boolean isValidDigit(String st) {
		boolean validNum = false;
		for (int i = 0; i < st.length(); i++) {
			String temp = st.substring(i, i + 1);
			try {
				int n=Integer.valueOf(temp);
				if (n >= 0 && n <= 255) {
					validNum = true;
				} else {
					validNum=false;
					break;
				}
			} catch (NumberFormatException e) {
				validNum=false;
				return validNum;
			}
		}
		return validNum;
	}

}
