package BubbleSort;

public class AscendingOrderArrayWithoutMethod {
	public static void main(String[] args) {

		int []a= {30,50,20,10,60};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int m=0;m<a.length;m++)
		{
			System.out.println(a[m]);
		}
	}

}

