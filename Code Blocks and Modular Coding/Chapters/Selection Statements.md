Selection Statements in Java:
-------------------------------------------------------------------------------

001) Java programming language provides two selection statements:
	- The 'if' statement
	- The 'switch' statement.
002) These statements allow you to control the flow of the program's execution
     depending on some pre-decided conditions stated.

-------------------------------------------------------------------------------

The 'if' Statement:
-------------------------------------------------------------------------------

001) The 'if' statement is simple, which adds to it's beauty and brilliance.
002) A basic 'if' statement would be written this way:

<code>

if(any particular [set of] condition(s) to be checked for){
	statement 1;
	statement 2;
	....
	statement n;
}

</code>

003) Let's note, that the 'if' statement shown above consists of two important
     parts:
	- The [set of] condition(s) to be checked for
	- The statements to be executed within the immediate succeeding block

004) The number of statements within the block can range from 1 to infinite.
     Whether or not they are to be executed depends on whether the condition(s)
     within the parenthesis are met.

005) Let's look at the following program to understand this better:

package ifStatement;
import java.util.Random;

public class ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random a = new Random();
		for(int i = 1; i <= 10; i++){
			int b = a.nextInt(50) + 1;
			if(b <= 25){
				
				System.out.println("Interation No.: " + (i));
				System.out.println("The number generated is: " + b);
				System.out.println("The random number generated is lesser than 25" + '\n');
			
			}else{
				
				System.out.println("Interation No.: " + (i));
				System.out.println("The number generated is: " + b);
				System.out.println("The random number generated is greater than 25" + '\n');
			
			}
		}
		
	}

}

006) The code shown above provides the following output:

Interation No.: 1
The number generated is: 25
The random number generated is lesser than 25

Interation No.: 2
The number generated is: 47
The random number generated is greater than 25

Interation No.: 3
The number generated is: 9
The random number generated is lesser than 25

Interation No.: 4
The number generated is: 25
The random number generated is lesser than 25

Interation No.: 5
The number generated is: 4
The random number generated is lesser than 25

Interation No.: 6
The number generated is: 34
The random number generated is greater than 25

Interation No.: 7
The number generated is: 47
The random number generated is greater than 25

Interation No.: 8
The number generated is: 8
The random number generated is lesser than 25

Interation No.: 9
The number generated is: 28
The random number generated is greater than 25

Interation No.: 10
The number generated is: 33
The random number generated is greater than 25

007) As you can see, there can be either of two outcomes:
	- Either the random number generated is greater than 25
	- Or the random number generated is less than 25.
008) Concentrate on the 'if' statement, and the succeeding code. You will see
     I have generated a random number before the 'if' statement. This line
     generates a random number ranging between 1 and 50.
009) Next, the 'if' statement checks for the number using the condition statement
     within its parenthesis. If the condition is met - the number is lesser than
     25, then the first block of code is run. If the number is more than 25,
     which means the condition is not met, then the first block of code is ignored,
     and the next block, if there is any, is run.

010) Now, you might wonder what does the 'else' statement stand for after the
     first block of code within the 'if' statement. The 'if' followed by the
     'else' makes a more complete form of the 'if' statement, called the 'if-else'
     statement.
011) The 'if-else' statement, as you've seen in the above example provides more
     options, and also more specificity to the flow of execution.

-------------------------------------------------------------------------------

The 'If-Else-If' Ladder:
-------------------------------------------------------------------------------

001) The 'If-Else-If' ladder is a special arragnement of if-else statements that
     make way for more number of possiblilites for flow of execution.
002) Now, let's take another example program to understand this:

import java.util.Random;
public class ifElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random month = new Random();
		int a = month.nextInt(12) + 1;
		
		System.out.println("Random month selected: " + a);
		
		if(a == 12 || a == 1 || a == 2){
			System.out.println("The season is Winter.");
		} else if(a == 3 || a == 4 || a == 5){
			System.out.println("The season is Spring.");
		} else if(a == 6 || a == 7 || a == 8){
			System.out.println("The season is Summer.");
		} else if(a == 9 || a == 10 || a == 11){
			System.out.println("The season is Autumn.");
		}		
	}

}

003) The output generated by the above program is:

Random month selected: 11
The season is Autumn.

004) You can see here, that we have a number of options to choose from, each of
     which has it's own course of action. The if-else-if ladder allows to
     incorporate these options.
005) As seen above, the basic syntax for the 'if-else-if' ladder is as below:

if(condition(s)){
	statements;
	...;
	} else if(condition(s)){
		statements;
		...;
	} else if...{

}

-------------------------------------------------------------------------------

The 'Switch' Statement:
-------------------------------------------------------------------------------

001) The switch statement is another selection statement provided by Java.
002) It often provides a way to ensure better branching than your 'if-else' 
     statements to different parts of your code based on the resulting value 
     of an expression or matching of a condition.

003) The general syntax of a 'switch' statement:

switch(expression){

	case value1:
		statements;
		...;
		break;
	case value2:
		statements;
		...;
		break;
	case value3:
		statements;
		...;
		break;
	case ...
	...
	...
	case value-n:
		statements;
		...;
		break;

}004) Now, the expression within the parenthesis must be of the following types:
	- byte
	- short
	- int
	- char.
005) The values specified alongside each of the cases must be type-compatible
     with the expression. Also, the values for each individual case must be 
     unique.

006) Let's take a fun program that will help you understand how the switch
     statement works:

import java.util.Random;
import java.util.Scanner;
public class switchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Number 1: ");
		int a = scanner.nextByte();
		System.out.print("Number 2: ");
		int b = scanner.nextByte();
		
		int result;
		
		System.out.println("");
		System.out.println("The two numbers generated are " + a + " and " + b + '\n');
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
			result = a * b;
			System.out.println(a + " into " + b + " is " + result);
			break;
			
		case 4:
			result = a / b;
			System.out.println(a + " divided by " + b + " is " + result);
			break;
		
		}
		
	}

}

007) The above program is a simple calculator. Have a look at the output:

Number 1: 22
Number 2: 2

The two numbers generated are 22 and 2

What would like to do?
1 : Addition
2 : Subtraction
3 : Multiplication
4 : Division
Enter your choice: 3

22 into 2 is 44

008) You can clearly see that I first entered two numbers - Number 1 and Number 2
     - using the Scanner class functions. We'll look into these functions at a 
     later stage in this series. Then I presented four options before the user
     of the program. Each option came along with a respective option number.
009) The option entered is fed into the 'switch' statement. Depending on the
     value entered the particular case statement is selected, and the operations
     within that statement are run. In this case, I selected the option 3, which
     provided me with multiplication of the two numbers entered.

010) There is one important statement that I'd like to stress on here. The
     'break' statement at the end of each case is something a lot of beginners
     forget about when building code. Now, let's look at a peculiar case of what
     would happen if we forgot to use break.

import java.util.Random;
import java.util.Scanner;
public class switchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Number 1: ");
		int a = scanner.nextByte();
		System.out.print("Number 2: ");
		int b = scanner.nextByte();
		
		int result;
		
		System.out.println("");
		System.out.println("The two numbers generated are " + a + " and " + b + '\n');
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
			// break;
			
		case 2:
			result = a - b;
			System.out.println(a + " minus " + b + " is " + result);
			// break;
			
		case 3:
			result = a * b;
			System.out.println(a + " into " + b + " is " + result);
			// break;
			
		case 4:
			result = a / b;
			System.out.println(a + " divided by " + b + " is " + result);
			// break;
		
		}
		
	}

}

011) The program is the same as the previous one. You'll only see that I've
     commented out the 'break' statements at the end of each case. The output
     for this program would be:

Number 1: 22
Number 2: 2

The two numbers generated are 22 and 2

What would like to do?
1 : Addition
2 : Subtraction
3 : Multiplication
4 : Division
Enter your choice: 2

22 minus 2 is 20
22 into 2 is 44
22 divided by 2 is 11


012) Here, you see, on selecting option 2, the program not only runs the code
     for case 2, but also for succeeding cases. This is because the 'break'
     statement explicitly breaks the flow of the program, and brings control
     outside of the switch statement. So in cases where we forget to mention
     'break', the program control flows through each of the succeeding cases
     until it encounters a 'break' statement.

013) However, this can also be favourable in a couple of instances. Let's take
     a look at the next program:

import java.util.Scanner;
public class switchStatementChosenBreaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the month in number: ");
	    byte month = scanner.nextByte();
	    System.out.println("");

	    switch(month){
	    
	    case 12:
	    case 1:
	    case 2:
	    	System.out.println("The season is Winter");
	    	break;
	    case 3:
	    case 4:
	    case 5:
	    	System.out.println("The season is Spring");
	    	break;
	    case 6:
	    case 7:
	    case 8:
	    	System.out.println("The season is Summer");
	    	break;
	    case 9:
	    case 10:
	    case 11:
	    	System.out.println("The season is Winter");
	    	break;
	    	
	    }

	}

}

014) Have a good look at the above program. Check out how I've only mentioned
     'break' statements at select cases. Now, let's look at what was the output:

Enter the month in number: 7

The season is Summer

015) Have you understood how employing 'break' statements at select places helps?
016) In a way this is also more efficient that using the 'if-else'if' ladder,
     as it does not require program control to go checking through all the
     unnecessary 'if' and 'else-if' statements until it reaches the right one.
     It directly jumps to the case that is required, and keeps executing till it
     encounters a 'break' statement. In large programs with hundereds of choices
     this could be a major advantage leading to faster execution.
