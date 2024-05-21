package Day_5_Basic_Core_Program;

import java.util.Arrays;

public class Triplet {

	public static void main(String[] args) 
	{
		int a[]= {-2,-3,5,1,-6,-7};
		int sum=0;
		Arrays.sort(a);
		for(int n: a) {
			//System.out.println("sorted:" + Arrays.toString(a));
			System.out.print( n);
		}
		for(int i=0;i<a.length-2; i++)
		{
			int left=i+1;
			int right=a.length-1;
			while(left<right)
			{
				sum=a[i]+a[left]+a[right];

				if(sum==0) {
					System.out.println();
					System.out.println("Triplet:" + a[i]+ "," +a[left]+ "," + a[right]);
					left++;
					right--;
				}
				else if(sum<0) {
					left++;
				}
				else {
					right--;
				}
			}
		}
	}
}
