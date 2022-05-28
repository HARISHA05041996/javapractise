package Group2String;

import java.util.LinkedHashSet;

public class UniqueWords {

	public static void main(String[] args) {
	
		String s="welcome to india welcome to tyss";
		s=s.toLowerCase();
		String[] str=s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			hs.add(str[i]);
		}
		
		for(String words: hs)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
			
				if(words.equals(str[i]))
				{
					count++;
				}
			}
			if(count==1) {
				
				System.out.println(words+" - " +count);
			}
		}
	}



}

