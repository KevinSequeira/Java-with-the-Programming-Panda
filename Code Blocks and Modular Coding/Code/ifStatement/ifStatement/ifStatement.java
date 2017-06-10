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
