package Java8;

public class ValidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "test 5 a0A pass007 ?xy1";
		String[] passwords = S.split(" ");
		int length = -1;
		for (String st : passwords) {
			if (validPassword(st)) {
				length = Math.max(length, st.length());
			}
		}
		System.out.println(length);
	}

	public static boolean validPassword(String str) {
		boolean flag = true;
		int aplha = 0;
		int digit = 0;
		// letters-even
		// digits- odd
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isAlphabetic(c)) {
				aplha++;
			} else if (Character.isDigit(c)) {
				digit++;
			} else {
				flag=false;
				break;
			}
		}

		if (flag) {
			if ((aplha % 2 == 0) && (digit % 2 != 0)) {
				flag = true;
			} else {
				flag = false;
			}
		}

		return flag;
	}

}
