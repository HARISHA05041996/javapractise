package Assignments;

public class String1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s= "how are you";
		String[] str= s.split(" ");
		

		str[0]=str[0]+str[2];
		str[2]=str[0].substring(0, (str[0].length()-str[2].length()));
		str[0]=str[0].substring(str[2].length());
		System.out.println(str[0]+" "+str[2]+ " "+str[1]);
	}
}