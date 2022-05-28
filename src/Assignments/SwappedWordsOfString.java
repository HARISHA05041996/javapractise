package Assignments;

public class SwappedWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="how are you";
		String [] str=s.split(" ");
		int key=2;
		for(int i=0;i<key;i++)
		{
			String temp=str[0];
			for(int k=1;k<str.length;k++)
			{
				str[i-1]=str[i];
				
			}
			str[str.length-1]=temp;
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+ " ");
		}
	}

}
