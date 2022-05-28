package Assignments;

public class ArrayPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,5,4,6,7,8,9,11};
		for(int j=0;j<a.length;j++)
		{
			int n=a[j];
			int i=2;
			
			while(n>=i)
			{
				if(n%i==0)
				{
					break;
				}
				else
				{
					i++;
				}
			}
			if(n==i)
			{
				System.out.println(a[j]);
			}
		}

	}

}
