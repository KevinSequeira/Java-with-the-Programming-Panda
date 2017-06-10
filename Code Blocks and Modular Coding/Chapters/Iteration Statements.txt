<b>Iteration Statements in Java:</b>
-------------------------------------------------------------------------------

001) In about every professional development scenario, you're going to come
     across the need to have to run the same set of code (instructions) more than
     once. How many times you need to repeat this set might depend on one or
     more conditions.
002) For this, Java provides something called 'Iteration Statements'. There are
     three basic iteration statements provided by Java:
	- for
	- while
	- do-while.
003) As these statements allow for repeatedly running the same set of code, they
     are called 'loop statements'.

-------------------------------------------------------------------------------

The 'while' Loop:
-------------------------------------------------------------------------------

001) The 'while' loop is the most basic iteration statement in Java.
002) Here's how a 'while' loop looks:

while(condition) {
	//statements;
}

003) Here, the 'condition' within the parenthesis is an expression that provides
     a Boolean output. The statments within the loop will only be executed if
     the condition is met. Otherwise, the loop is bypassed, and the program
     continues execution from after the loop.

004) Have a quick look at the following program that will help you understand
     how the 'while' loop works:

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

005) The output proivided by this is:

Welcome to the Factorial Calculator.
Enter the number whose factorial you want to calculate: 
6

The factorial of 6.0 is: 720.0

006) Here, you see that while program execution enters the 'while' loop, it 
     checks for the condition 'n > 0'. If the Boolean equivalent is 'true',
     the statements within the parenthesis '{ }' are executed.
007) When the entire block of code has finished executing, the control goes back
     to 'while' and the condition is once again checked, and the whole process
     is repeated.
008) This goes on till the condition doesn't return a Boolean false equivalent,
     at which point the program exits the 'while' loop, and control shifts to
     the next statement after the loop.

-------------------------------------------------------------------------------

The 'do-while' Loop:
-------------------------------------------------------------------------------

001) Many a time, during real-world coding, you'll need to run the code within
     the 'while' loop at least once, irrespective of whether the condition
     within the parenthesis is met.
002) So Java provides us with a work-around in the form of the 'do-while' loop.
     The loop looks like this in it's general form:

do{
	//statements;
} while(conditions);

003) Check out the following code that demonstrates the working of a 'do-while'
     loop:

import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number 1: ");
		int a = scanner.nextInt();
		System.out.print("Number 2: ");
		int b = scanner.nextInt();
		
		float result;
		byte choice;
		
		do{
		
			System.out.println("");
			System.out.println("What would like to do?");
			System.out.println("1 : Addition");
			System.out.println("2 : Subtraction");
			System.out.println("3 : Multiplication");
			System.out.println("4 : Division");
		
			System.out.print("Enter your choice: ");
			choice = scanner.nextByte();
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
			
			default:
				System.out.println("Please enter any one of the above given options");
				
			}
			
		} while((choice < 1) || (choice > 4));

	}

}

004) Let's analyze the output of the above given code. When the code is executed
     we are requested to enter the two numbers. Let's for example enter 2 and 22.
005) Next, we're requested to choose the operation we want to perform using these
     two numbers. Here's how the output looks:

Number 1: 2
Number 2: 22

What would like to do?
1 : Addition
2 : Subtraction
3 : Multiplication
4 : Division
Enter your choice: 

006) Here, you can see that the do-while loop has executed the statements
     immediately following the 'do' keyword atleast once. Let's say, I then enter
     '7' as a choice. What happens?
007) The 'choice' is first checked in the switch statement, the intended code is
     run accordingly, and then the following 'while' statement checks for the
     conditions. In this case, the condition is met [ choice < 1 or choice > 4 ].
008) As the condition is met, the program control is transferred back to the
     start of the loop. Thenceforth, the loop works as a traditional 'while'
     loop, until the condition returns a 'false' Boolean equivalent.

009) Here's how the final output looks like:

Number 1: 2
Number 2: 22

What would like to do?
1 : Addition
2 : Subtraction
3 : Multiplication
4 : Division
Enter your choice: 7

Please enter any one of the above given options

What would like to do?
1 : Addition
2 : Subtraction
3 : Multiplication
4 : Division
Enter your choice: 3

2 into 22 is 44.0

-------------------------------------------------------------------------------

The 'for' Loop:
-------------------------------------------------------------------------------

001) The 'for' loop is probably the most widely used and most powerful loop in
     Java. That's because it has a simple syntax which allows us to employ multiple
     condition checks within one statement.
002) A simple 'for' loop is written as follows:

for(initialization statement; condition statement; iteration statement) {

	// body of statements;

}

003) As with all other looping statements, if only one statement is written
     within the loop, then there is no need to use the curly braces. However,
     for the sake of simplicity and clearer understanding, use braces as a best
     practice.
004) Consider the following program as a simple example of the 'for' loop:

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

005) The output for the above given code is:

Welcome to the Factorial Counter!

Enter the number whose factorial you want to find: 6
Factorial of 6.0 is: 720.0

006) The working of a 'for' loop is very basic. The loop statment consists of
     three sub-statements:
	-- The initialization statment
	-- The condition statement
	-- The iteration statement
007) The initilization statement is used to initialize a counter variable, which
     will be used to decide how many times the loop needs to be repeated. The
     variable can be fully initialized within the statement, or can be initialized
     before the loop statement and only the value can be assigned within the
     for loop's initialization statement, as seen in the above example.
008) The condition statement sets the terminating condition for the for loop.
     Rather, we can say it sets a bounds of sort. And the iteration statement
     either increments or decrements the counter variable that is checked
     the condition statement.
009) In the above example, we see the counter variable 'factorial' is post-
     decremented every time the loop runs. After the loop has completed one run,
     the control goes back to the start of the loop, and the variable's value
     is checked against the condition. As long as the condition is met, and the
     return value to the condition is 'true', the loop will run.
010) For every instance of the loop, the variable 'fact' is multiplied with the
     counter variable 'factorial' and the resulting value is stored back in 'fact'.
011) If the original value of 'factorial' is 6 and 'fact' is 1, the first
     iteration of the loop gives us fact = 1 * 6 = 6; the next iteration gives
     us fact = 6 * 5 = 30; followed by the third iteration, in which we have
     fact = 30 * 4 = 120. This iterative multiplication goes on until 'factorial'
     reaches 0.

-------------------------------------------------------------------------------

The 'for-each' Loop:
-------------------------------------------------------------------------------

001) Now, there's a more advanced form of the 'for' loop that improves the
     syntax of the original loop by reducing the number of statements within
     the parenthesis. This is the 'for-each' loop, also referred to as the
     'enhanced for loop'.
002) The 'for-each' loop is written as:

for(type iteration variable: collection){
	
	statements;

}

003) The best part of the 'for-each' loop is that it eliminates the need of a
     counter variable, replacing it with an interation variable. The iteration
     variable is linked to a 'collection', which is usually an array, and takes
     on the value of each element of the collection through as many iterations.
004) Let's take a quick look at this example:

import java.util.Scanner;

public class simpleForEachLoop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] = new int[10];
		int sum = 0, i = 0;
		String choice = new String("Yes");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Summation Calculator: " + '\n');
		
		for(i = 0; i < 10; i++) {
			
			System.out.print("Please enter a number: ");
			number[i] = scanner.nextInt();
			
			System.out.println("Would you like to add a number? Enter 'Yes' or 'No'.");
			choice = scanner.next();
			
			if (choice.equals("Yes")) {
				System.out.println();
			} else if (choice.equals("No")) {
				System.out.println();
				break;
			} else {
				System.out.println("Kindly enter a valid option.");
			}
			
		}
		
		for(int holder: number){
			sum = sum + holder;
		}
		System.out.println("The Sum of all numbers entered is: " + sum);
		
	}

}

005) Here's the output fo the above code:

Welcome to the Summation Calculator: 

Please enter a number: 10
Would you like to add a number? Enter 'Yes' or 'No'.
Yes

Please enter a number: 20
Would you like to add a number? Enter 'Yes' or 'No'.
Yes

Please enter a number: 10
Would you like to add a number? Enter 'Yes' or 'No'.
No

The Sum of all numbers entered is: 40

006) Let's look at the code closely. The code consists of two 'for' loops.
007) The first 'for' loop has been written for reading data from the user. It 
     is a simple 'for' loop with the interation variable declaration,
     termination condition, and the iteration statement.
008) There's a second 'for' loop which calculates the sum of all variables that
     have been entered. This is a 'for-each' variation.
009) Within the parenthesis, we have declared and initialized the counter 
     variable and assigned it to a collection 'number[]'. The counter variable
     loops through all the element within the collection - one element per
     iteration. It's that simple.

010) Things get a little complicated when we use the 'for-each' variation with
     two dimensional arrays, or if we use nested 'for-each' loops.
011) Let's have a look at this example:

import java.util.Scanner;
import java.util.Random;

public class twoDimensionalForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNumberArray[][] = new int[10][10];
		int count = 0, i, j, choice;
		Random number = new Random();
		Scanner scanner = new Scanner(System.in);
		
		// Now, we will generate the random numbers for Array 'randomNumberArray'
		for(i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				
				randomNumberArray[i][j] = number.nextInt(100);
				if(j < 9) {
					
					System.out.print(randomNumberArray[i][j] + ", ");
				
				} else {
					
					System.out.println(randomNumberArray[i][j]);
				
				}
				
			}
			
		}
		
		System.out.println('\n' + "Please enter a number of your choice." + '\n' + "Let us count the number of times it occurs.");
		choice = scanner.nextInt();
		
		for(int run1[] : randomNumberArray) {
			for (int run2 : run1) {
				
				if(run2 == choice) {
					
					count++;
					
				}
				
			}
		}
		
		if(count == 1) {
			
			System.out.println('\n' + "The number " + choice + " occurs only once in the random number Array.");
			
		} else {
			
			System.out.println('\n' + "The number " + choice + " occurs " + count + " times in the random number Array.");
	
		}
		
	}

}

012) And now, study the output stream for the code:

