package BubbleSort;

import java.util.HashSet;

public class UniqueKeysPrint {

	public static void main(String[] args) {
		
				int[] a= {3,5,3,6,7,8,7,8};
				HashSet<Integer> hs=new HashSet<>();
				for(int i=0;i<a.length;i++)
				{
					//System.out.println(a[i]);
					hs.add(a[i]);
					
					
				}
				for(Integer in:hs)
				{
					int count=0;
					for(int j=0;j<a.length;j++)
					{
						if(a[j]==in)
						{
							count++;
							//System.out.println(count);
						}
					}
					if(count==1)
					{
						System.out.println(in+ " = " +count);
					}
				}
				

			}


	}


