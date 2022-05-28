package Assignments;

public class PrintArrayDuplicates {

	public static void main (String[] args) {
	
		String str[]= {"naveen","joy","praveen","sunitha"};
		for(int i=0;i<str.length;i++)
		{
			String s=str[i];
			//s=s.toLowerCase();
			int count=0;
			
			for(int j=0;i<s.length();j++)
			{
				
				if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u')
				{
					count++;
				}
			}
					System.out.println(str[i]+ " "+count);
		}

	}


	}


