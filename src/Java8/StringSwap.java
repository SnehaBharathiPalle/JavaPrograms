package Java8;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "s dudE2";

		char[] ch = st.toCharArray();

		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < ch.length; i++) {
			Character c = ch[i];
			if (Character.isAlphabetic(c)) {
				if (Character.isLowerCase(c)) {
					ch[i] = Character.toUpperCase(c);
				} else {
					ch[i] = Character.toLowerCase(c);
				}
			} else if (Character.isDigit(c)) {
				index.add(i);
			}
		}

		for (int i = 0; i < index.size() - 1; i++) {
			String x = st.substring(index.get(i) + 1, index.get(i + 1));
			if (isAplphabetic(x)) {
				// swap
				char temp = ch[index.get(i)];
				ch[index.get(i)] = ch[index.get(i + 1)];
				ch[index.get(i + 1)] = temp;
			}

		}
		System.out.println(Arrays.toString(ch));

	}

	public static boolean isAplphabetic(String x) {
		boolean flag = false;

		for (int j = 0; j < x.length(); j++) {
			char c = x.charAt(j);
			if (Character.isAlphabetic(c)) {
				flag = true;
			} else {
				flag = false;
				break;
			}

		}
		return flag;
	}

}
