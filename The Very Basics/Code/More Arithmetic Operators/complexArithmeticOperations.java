
public class complexArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Understanding the Increment Operator
		int a = 40;
		System.out.println("Original value of A: " + a);
		
		int b = a++;
		System.out.println("Value of A during post-increment operation: " + b);
		System.out.println("Value of A after post-increment operation: " + a);
		
		int c = ++a;
		System.out.println("Value of A during pre-increment operation: " + c);
		System.out.println("Value of A after pre-increment operation: " + a + '\n');
		
		//Understanding the Decrement Operator
		int x = 40;
		System.out.println("Original value of X: " + x);
		
		int y = x--;
		System.out.println("Value of X during post-decrement operation: " + y);
		System.out.println("Value of X after post-decrement operation: " + x);
		
		int z = --x;
		System.out.println("Value of X during pre-decrement operation: " + z);
		System.out.println("Value of X after pre-decrement operation: " + x);
	
	}

}
