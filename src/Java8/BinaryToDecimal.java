package Java8;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String s="11100";
		//reverse it
		String s1="00111";
		double decimal=0;	
		for(int i=0;i<s1.length();i++) {	
			int digit=Integer.valueOf(s1.substring(i,i+1));
			double temp=Math.pow(2,i);
			decimal=decimal+digit*temp;
			System.out.println("Decimal "+decimal);			
		}
		int value = (int) decimal;
		System.out.println(value);
	}

}
