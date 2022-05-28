 package String;

public class ReverseString1 {
//reverse string
	public static void main(String[] args) {
		String s="Hello";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
			System.out.println(rev);
	}

}
/* String s="Hello";
for(int i=s.length()-1;i>=0;i--)
{
System.out,println(s.charAt(i));

} */

/* reverse a string without using length method

String s="programme";
char[] ch=s.toCharArray();
int count=0;
for(char c : ch)
{
count++;
}

for(int i=count-1;i>=0;i--)
{
System.out.println(s.charAt(i));
}
}   

} */
