package Assignments;

public class PushValueBasedOnKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		int key=2;
		for(int i=0;i<key;i++)
		{
			int temp=a[0];
			for(int k=1;k<a.length;k++)
			{
				a[k-1]=a[k];
			}
			a[a.length-1]=temp;
		}
			for(int l=0;l<a.length;l++)
			{
				System.out.print(a[l]+",");
			}
	}

}
