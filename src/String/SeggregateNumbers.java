package String;

public class SeggregateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a1$b2@%C";
		String a1="";
		String num="";
		String sp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				a1=a1+s.charAt(i);
              
			}
			else if(s.charAt(i)>=48  && s.charAt(i)<=57)
			{
				num=num+s.charAt(i);
			}
			else
			{
				sp=sp+s.charAt(i);
			}
		}
			System.out.println(a1);
			System.out.println(num);
			System.out.println(sp);
	}

}
 