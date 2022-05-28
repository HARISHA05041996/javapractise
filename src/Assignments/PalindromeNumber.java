package Assignments;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=454;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
