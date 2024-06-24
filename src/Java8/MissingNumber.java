package Java8;
import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="3x + 12 =46";
		String[] arr=s.split("=");
		String ls=arr[0].trim();
		String rs=arr[1].trim();
		System.out.println(ls);
		String[] lsArr=ls.replace(" ","").split("\\+");
		System.out.println(Arrays.toString(lsArr));
		
	
		

	}

}
