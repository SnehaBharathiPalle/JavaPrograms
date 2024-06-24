
public class JavaStringReduction {

	public static void main(String[] args) {
		String S="ACCAABBC";
		 int n=S.length()+1;
	      while(n>S.length()){
	    	  n=S.length();
	          S=S.replace("AA", "");
	           S=S.replace("BB", "");
	            S=S.replace("CC", "");
	      }
	      System.out.println(S);

	}

}
