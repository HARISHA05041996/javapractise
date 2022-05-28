package practise;

public class DuplicateElemetsInArray {
	public static void main(String[] args) {
		int[] a= {3,5,3,6,7,8,7,8};
		int count=0;
		System.out.println("duplicate elements in given array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println(a[i]);
				}
			}
		}
		System.out.println("number of time duplicates are come:" +count);
	}

}
