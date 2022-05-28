package practise;

import java.util.Arrays;

public class ArraysDescending {

	public static void main(String[] args) {
		int[] a= {30,20,40,50,11};
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
