
import java.util.Scanner;
public class switchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Number 1: ");
		int a = scanner.nextInt();
		System.out.print("Number 2: ");
		int b = scanner.nextInt();
		
		float result;
		
		System.out.println("");
		System.out.println("What would like to do?");
		System.out.println("1 : Addition");
		System.out.println("2 : Subtraction");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
	
		System.out.print("Enter your choice: ");
		byte choice = scanner.nextByte();
		System.out.println("");
		
		switch(choice){
		
		case 1:
			result = a + b;
			System.out.println(a + " plus " + b + " is " + result);
			break;
			
		case 2:
			result = a - b;
			System.out.println(a + " minus " + b + " is " + result);
			break;
			
		case 3:
			result = (float) a * b;
			System.out.println(a + " into " + b + " is " + result);
			break;
			
		case 4:
			result = (float) a / b;
			System.out.println(a + " divided by " + b + " is " + result);
			break;
		
		}
		
	}

}
