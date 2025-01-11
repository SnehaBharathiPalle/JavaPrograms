package Java8;

public class Test {

	public static void main(String[] args) {
		//Count number of characters, numbers, aplha numeric digits
		//first letters
		//special charcater
		//numbers
		
//		String s= "90Sn2#eh@!@";
//		String letters="";
//		String numbers="";
//		String specialCharacter="";
//		String output="";
//		char[] c=new char[s.length()];
//		c=s.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			//System.out.println(c[i]);
//			boolean smallChar=c[i]>='a'&&c[i]<='z';
//			boolean capChar=c[i]>='A'&&c[i]<='Z';
//			if(smallChar || capChar) {
//				letters=letters+String.valueOf(c[i]);
//			}else if (c[i]>='0'&&c[i]<='9'){
//				numbers=numbers+String.valueOf(c[i]);
//			}else {
//				specialCharacter=specialCharacter+String.valueOf(c[i]);
//			}
//		}	
//		
//		output=letters+numbers+specialCharacter;
//		System.out.println(output);
		
		String line="<h1>Nayeem loves counseling</h1>";
		 String res="";
		 int Scount=0;
		 int Ecount=0;
		 for(int i=0;i<line.length();i++) {
			 String s=line.substring(i,i+1);
			 if(s.equals(">")) {
				 Ecount++;
			 }
			 if(s.equals("<")) {
				 Scount++;
			 }
			 if(Scount==1 &&  Ecount==1 && !s.equals(">")  ) {
				 res=res+s;
			 }
			 
			 if(Scount>1) {
				 break;
			 }
			 
		 }
		System.out.println(res.trim());
	}
}
