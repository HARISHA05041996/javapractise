package Group2String;

import java.util.LinkedHashSet;

public class DuplicateWordsPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to india welcome to tyss";
		s=s.toLowerCase();
		String[] str=s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			hs.add(str[i]);
		}
		//compare each char of set with all the char of given string
		for(String words: hs)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				//if it is matching ,increment count
				if(words.equals(str[i]))
				{
					count++;
				}
			}
			if(count>1) {
			//print both in and count
				System.out.print(words+" ");
			}
			}
		}
			

}
