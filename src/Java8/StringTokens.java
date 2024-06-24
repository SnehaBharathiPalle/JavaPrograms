package Java8;
import java.util.ArrayList;

public class StringTokens {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "he@ $ER bug!!!!! ui?";
		s = s.trim();
		ArrayList<String> list = new ArrayList<>();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			
			String temp = s.substring(i, i + 1);
			boolean small = s.charAt(i) >= 'a' && s.charAt(i) <= 'z';
			boolean large = s.charAt(i) >= 'A' && s.charAt(i) <= 'Z';
			if (small || large) {
				str = str + temp;
			} else {
				if (!str.equals("")) {
					list.add(str);
					str = "";
				}
			}

			if (i == s.length() - 1) {
				if (!str.equals("")) {
					list.add(str);
				}
			}
		}

		System.out.println(list.size());
		for (String temp1 : list) {
			System.out.println(temp1);
		}

	}

	
}
