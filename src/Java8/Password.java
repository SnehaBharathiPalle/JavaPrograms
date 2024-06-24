package Java8;

public class Password {
	public static void main(String[] args) {
		String str = "turkey90AA";
		int n =str.length();
		boolean flag = false;
		boolean passwordLength = (n > 7) && (n < 31);
		boolean passwordContains = str.contains("password");
		char[] ch=str.toCharArray();
		int capLetter=0;
		int num=0;
		int puctOrMathSymbol=0;
		if (passwordLength && !passwordContains) {
			for(char c: ch) {
				String st=String.valueOf(c);
				if(Character.isUpperCase(c)) {
					capLetter=capLetter+1;
				}else if(Character.isDigit(c)) {
					num=num+1;
					
				}else if(st.contains("!") || st.contains("+") || st.contains("-") || st.contains("*")
						|| st.contains("/") || st.contains("%")) {
					
					puctOrMathSymbol=puctOrMathSymbol+1;
				
				}
			}
			
			if(capLetter>=1 && num>=1 && puctOrMathSymbol>=1) {
				flag=true;
			}
		}
		
		System.out.println(flag);

	}
}
