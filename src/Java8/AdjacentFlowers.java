package Java8;
import java.util.*;

public class AdjacentFlowers {
	public static List<Integer> list= new ArrayList<>();
	public static void main(String[] args) {
		
		 int[] nums1= {1,2};
		 int[] nums2 = {3,4};
		 double median =0.0;
	       addArray(nums1);
	       addArray(nums2);
	       Collections.sort(list);
	       int n=list.size();
	       int middle=n/2;
	       if(n%2==0){
	        System.out.println(list.get(middle));
	         System.out.println(list.get(middle-1));
	         double sum=list.get(middle)+list.get(middle-1);

	       median=sum/2.0;
	       }else{
	        median=list.get(middle);
	       }
	        System.out.println(median);
		 
	}
		    
		   

		    public static void addArray(int[] nums){
		         for(int i=0;i<nums.length;i++){
		            list.add(nums[i]);
		        }

		    }
		    
		 

	

}
