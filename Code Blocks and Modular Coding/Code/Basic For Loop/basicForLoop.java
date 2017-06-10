import java.util.Scanner;

public class basicForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Welcome to the Factorial Counter!" + '\n' + '\n' + "Enter the number whose factorial you want to find: ");
		float a = scanner.nextFloat();
		float factorial, fact = 1;
		
		for(factorial = a; factorial > 0; factorial--){
			fact = fact * factorial;
		}
		
		System.out.println("Factorial of " + a + " is: " + fact);

	}

}