package BubbleSort;

public class FirstMinimumAndSecondMinimum {

	public static void main(String[] args) {
		int []a= {25,7,30,6,45,76};
		int  fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin = a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
			
		}
		System.out.println(fmin+ " " +smin);
	}

}


