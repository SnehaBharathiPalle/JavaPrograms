package Java8;
import java.util.Arrays;

public class ZoomInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1={3,2,1,4};
		 int[] arr2={6,8,9,7};
		 int x=11;
		 
		 Arrays.sort(arr1);// 1 2 3 4
	      Arrays.sort(arr2);// 6 7 8 9
	      int closestPair1=arr1[0];
	      int  closestPair2=arr2[0];
	int min=Math.abs(closestPair1+closestPair2-x );
	      for(int i=0;i<arr1.length;i++){
	        for(int j=0;j<arr2.length;j++){
	          int sum=arr1[i]+arr2[j];
	          int temp=Math.abs(sum-x);
	          if(temp<min){
	            min=temp;
	            closestPair1=arr1[i];
	            closestPair2=arr2[j];

	           }
	        }
	      }
	      System.out.println(min);  
	      System.out.println("Closest pair: " + closestPair1 + " and " + closestPair2);
	}

}
