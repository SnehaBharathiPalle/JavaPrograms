package Java8;

import java.util.Arrays;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "b";
		
		String t = "c";
		///boolean flag=isSubsequence(s, t);
		int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
		
		 for (int i = 0; i < mat.length; i++) {
			 
	            // Loop through all elements of current row
	            for (int j = 0; j < mat[i].length; j++) {
	                System.out.print(mat[i][j] + " ");
	            }
		 System.out.println("###########");
		 }

	}

	public static boolean isSubsequence(String s, String t) {
		int j = 0;
		boolean flag=false;
		if (t.length() >= s.length()) {
			for (int i = 0; i < t.length(); i++) {
				String x = t.substring(i, i + 1);
				String y = s.substring(j, j + 1);
				if (x.equals(y)) {
					j++;
				}
				if(j==s.length()) {
					return true;
				}
			}
		}
		if (j == s.length()) {
			return true;
		} else {
			return false;
		}
	}

}
