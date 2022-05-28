package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OrderofInsertion {
	public static void main(String[] args) {
		String s="welcome";
		LinkedHashSet<Character> hs=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		for(Character in: hs)
		{
			
			for(int i=0;i<s.length();i++)
			{
				if(in==s.charAt(i))
				{
					System.out.println(in+ " : " +i);
					break;
				}
			}
		}
	}
}




