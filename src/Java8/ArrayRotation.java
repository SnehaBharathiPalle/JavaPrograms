package Java8;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] arr= {4,3,4,3,1,2};
		
		int n=arr[0];//3
		int l=arr.length;//4
		
		String s="";
		for(int i=n;i<l;i++) {
			s=s+String.valueOf(arr[i]);
			
		}
		
		for(int i=0;i<n;i++) {
			s=s+String.valueOf(arr[i]);
			
		}
		
		
		System.out.println(s);
	}
}
