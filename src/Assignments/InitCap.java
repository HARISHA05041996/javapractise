package Assignments;

public class InitCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to india";
		String[] str=s.split(" ");
		String temp="";
		for(int i=0;i<str.length;i++)
		{
			temp=str[i];
			temp=temp.substring(0, 1).toUpperCase()+temp.substring(1);
	        System.out.print(temp+" ");
		}
	}
	
}
	