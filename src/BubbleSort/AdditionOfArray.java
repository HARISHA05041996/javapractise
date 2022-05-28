package BubbleSort;

//addition of 2 array elements with same size
public class AdditionOfArray {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4 };
		int[] b = { 5, 6, 7 };
		int[] c = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(c[i]);
		}
	}

}
