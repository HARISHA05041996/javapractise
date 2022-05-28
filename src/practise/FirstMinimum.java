package practise;
//first min array without using bubblesort
public class FirstMinimum {
	public static void main(String[] args) {
		int []a= {25,7,30,45};
		int  min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
			
		}
		System.out.println(min);
	}

}
