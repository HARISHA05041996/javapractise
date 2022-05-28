package String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PositionArrange {

	public static void main(String[] args) {
		String s="welcome";
		HashSet<Character> hs=new HashSet<Character>();
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
			if(count>1)
			{
				System.out.println(in+ " = " +count);
			}
		}
			
	}
}