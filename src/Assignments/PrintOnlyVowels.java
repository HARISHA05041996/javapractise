package Assignments;

public class PrintOnlyVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
			{
				System.out.print(s.charAt(i)+ " ");
			}
		}

	}

}
