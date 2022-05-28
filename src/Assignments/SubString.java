package Assignments;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to testyantra";
		String s1=""+s.charAt(0);
		System.out.print(s1.toUpperCase());
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
					{
					char ch=(char)(s.charAt(i+1)-32);
					System.out.print(" "+ch);
					i++;
					}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
