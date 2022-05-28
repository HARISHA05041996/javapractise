package BubbleSort;

public class ReverseNumber {

	
		// TODO Auto-generated method stub
		public static void print(int a)
		{
		  if(a>=10)
		  {
			  	
			System.out.println(a);
			a--;
			print(a); //print(a+1) also used // use ++n also
			
		  }
			
		}
	
		public static void main(String[] args) {
			print(20);
		
	}
	


}
