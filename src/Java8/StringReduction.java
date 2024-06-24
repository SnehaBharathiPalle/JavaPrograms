package Java8;

public class StringReduction {
	public static void main(String[] args) {
		String str = "bcab";
		int res=str.length()+1;
		
		while (res> str.length()) {
			res=str.length();
			str=str.replace("ab","c");
			str=str.replace("ba","c");
			
			str=str.replace("ca","b");
			str=str.replace("ac","b");
			
			str=str.replace("bc","a");
			str=str.replace("cb","a");	
		}
		
		System.out.println(str);
	}
}
