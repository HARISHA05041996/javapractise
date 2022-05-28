package Assignments;

public class WithOutCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india";
		String s2="";
		for(int i=0;i<s.length();i++){
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				if(count==1)
				{
					s2=s2+s.charAt(i); 
					
				}
			}
			System.out.print(s2);
		}

	}

}
