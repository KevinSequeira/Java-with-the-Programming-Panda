import java.util.Scanner;

public class simpleWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Factorial Calculator.");
		System.out.println("Enter the number whose factorial you want to calculate: ");
		
		float number = scanner.nextFloat();
		float factorial = 1;
		float n = number;
		
		while(n > 0){
			factorial = n * factorial;
			--n;
		}
		
		System.out.println();
		System.out.println("The factorial of " + number + " is: " + factorial);
		
		
	}

}
