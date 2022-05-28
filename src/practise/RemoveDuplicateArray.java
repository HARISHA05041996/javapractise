package practise;

import java.util.Collection;
import java.util.HashSet;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
	int[] a= {2,4,6,4,2};
	HashSet<Object> hs=new HashSet<Object>();
	for(int i=0;i<a.length;i++)
	{
	
	hs.add(a[i]);
	}
	System.out.println(hs);
	
	}

}


