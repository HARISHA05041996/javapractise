package String;

import java.util.LinkedHashSet;
//print unique characters Only
public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india";
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
			if(count==1) {

				System.out.print(in);
			}
		}


	}

}
