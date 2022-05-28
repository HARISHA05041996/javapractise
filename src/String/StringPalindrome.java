package String;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		boolean flag=true;
		
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i) !=s.charAt(s.length()-i-1)) {
				flag=false;
				break;
			}
		}
		if(flag) 
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}

/* String s="gadag";
 * string rev="";
 * for(int i=s.length()-1;i>=0;i--)
 * {
 * rev=rev+s.charAt(i);
 * }
 * System.out.println(rev);
 * if(s.equals(rev)) {
 * System.out.println(rev+"is palindrome");
 * }else
 * {
 * System.out.println("not palindrome");
 * }
 * }  */



