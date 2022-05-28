package String;

public class ReverseString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nayak";
		char[] ch=s.toCharArray();
		int count=0;
		for(char c : ch)
		{
		count++;
		}

		for(int i=count-1;i>=0;i--)
		{
		System.out.print(s.charAt(i));
		}
		}   

	}


