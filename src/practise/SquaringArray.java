package practise;

import java.util.Arrays;

public class SquaringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a= {5,4,3,7,8};
		/*	for(int value : a)
			{
				System.out.println(value);
			} */
			for(int i=0;i<a.length;i++)
			{
				a[i]=(int)Math.pow(a[i], 2);
			
			
				System.out.print(a[i]+" ");
				
			}
			
	}


}
