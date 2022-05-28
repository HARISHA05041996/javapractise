package BubbleSort;
//first max and Second max array without using bubble sort
public class FirstANdSecondMax{
	public static void main(String[] args) {
		int []a= {25,7,30,6,45,76};
		int  fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=fmax)
			{
				smax=fmax;
				fmax = a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
			
		}
		System.out.println(fmax+ " " +smax);
	}

}
