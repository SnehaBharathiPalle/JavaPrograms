package Java8;
import java.util.*;

public class UniqueSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abacaba";
		int n = partitionString(s);
		System.out.println(n);

	}

	 public static int partitionString(String s) {
	        int count = 1; // count number of minimum substrings.
	        Set<Character> set = new HashSet<>();
	        for(char c: s.toCharArray()){
	            if(set.contains(c)){ // check character repeat in string
	                count++;
	                set.clear();
	            }
	            set.add(c);
	        }
	        return count;
	    }

}
