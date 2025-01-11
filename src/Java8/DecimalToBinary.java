package Java8;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n=28;
		String res1="";
		while(n!=0) {
			res1=res1+String.valueOf(n%2);
			n=n/2;
			
		}
		 StringBuilder res = new StringBuilder();

	        // Appending elements of s in res
	        res.append(res1);

	        // reverse StringBuilder res
	        res.reverse();

		System.out.println(res);
	}

}
