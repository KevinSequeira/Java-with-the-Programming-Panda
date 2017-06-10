
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
