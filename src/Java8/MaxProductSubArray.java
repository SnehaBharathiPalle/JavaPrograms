package Java8;
//https://www.youtube.com/watch?v=Y6B-7ZctiW8&t=564s
public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6, 3, -10, 0, 2}; //{0,0,-5,0,0};
		int n=arr.length;
		int left=0;
		int right=n-1;
		int leftProd=1;
		int rightProd=1;
		int res=arr[left];
		while(left<n && right>=0) {
			if(leftProd==0 ) {
				leftProd=1;
			}else if(rightProd==0) {
				rightProd=1;
			}
			leftProd=leftProd*arr[left];
			rightProd=rightProd*arr[right];
			
			int maxProd=Math.max(rightProd, leftProd);
			res=Math.max(maxProd, res);
			left++;
			right--;	
		}
		
      System.out.println(res);
	}
}


