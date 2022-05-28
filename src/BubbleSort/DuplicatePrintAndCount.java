package BubbleSort;

import java.util.HashSet;

public class DuplicatePrintAndCount {
	public static void main(String[] args) {
		int[] a= {3,5,3,6,7,8,7,8,3};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			hs.add(a[i]);
			//System.out.println(hs);
			
		}
		for(Integer in:hs)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==in)
				{
					count++;
					//System.out.println(count);
				}
			}
			if(count>1)
			{
				System.out.println(in+ " = " +count);
			}
		}
		

	}
}
