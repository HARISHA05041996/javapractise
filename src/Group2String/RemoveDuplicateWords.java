package Group2String;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String s="welcome to india welcome to tyss";
		s=s.toLowerCase();
		String[] str=s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			hs.add(str[i]);
		}
		System.out.println(hs);

	}

}
