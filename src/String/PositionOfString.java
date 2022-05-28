package String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
//number of character occurance in string
public class PositionOfString {

	public static void main(String[] args) {
		String s="india";
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		//compare each char of set with all the char of given string
		for(Character in: hs)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				//if it is matching ,increment count
				if(in==s.charAt(i))
				{
					count++;
				}
			}
			//print both in and count
				System.out.println(in+ " = " +count);
			}
		}
			
	}
