package Java8;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "A @war ! at tarawa";
		String x = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				x = x + str.substring(i, i + 1);
			}
		}
		System.out.println(x);
		String y = "";
		
		char[] ch=x.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			y=y+String.valueOf(ch[i]);
		}
		
		if(y.equalsIgnoreCase(x)) {
			System.out.println("HURRAY PALINDROME");
		}else {
			System.out.println("ALAS");
		}

	}

}
