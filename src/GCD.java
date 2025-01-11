
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method
		//Note A should be always greater than B;
		int a=10;
		int b=38;
		while(a!=0 && b!=0) {
			int rem=a%b;
			a=b;
			b=rem;
		}
		
		if(a!=0) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		

	}

}
