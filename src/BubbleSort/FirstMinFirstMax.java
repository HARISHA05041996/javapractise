package BubbleSort;
//first min and first max array without using bubble sort
public class FirstMinFirstMax{
	public static void main(String[] args) {
		int []a= {25,7,30,45,7};
		int  fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin)
				{
				smin=fmin;
				}
				fmin=a[i];
				
			}
			else if(smin<a[i] || smin==fmin)
			{
				smin=a[i];
			}
			
		}
		System.out.println(fmin+ " " +smin);
	}

}
