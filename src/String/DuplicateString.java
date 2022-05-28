package String;

import java.util.LinkedHashSet;
import java.util.LinkedList;
//print duplicate characters only
public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
		s=s.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		for(Character in: hs)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(in==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1) {

				System.out.print(in);
			}
		}

	}
}

