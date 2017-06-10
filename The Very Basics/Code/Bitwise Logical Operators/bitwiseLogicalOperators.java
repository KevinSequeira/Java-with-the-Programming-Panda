
public class bitwiseLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String binary[] = {
							"0000",
							"0001",
							"0010",
							"0011",
							"0100",
							"0101",
							"0110",
							"0111",
							"1000",
							"1001",
							"1010",
							"1011",
							"1100",
							"1101",
							"1110",
							"1111"
		};
		
		int a = 8; // 0 + 2 + 1 or 0011 in binary
		int b = 13; // 4 + 2 + 0 or 0110 in binary
		
		int A_OR_B 		= a | b;
		int A_AND_B 	= a & b;
		int A_EXOR_B 	= a ^ b;
		int NOT_A		= ~ a;
		
		System.out.println("A: " + a);
		System.out.println("Binary A: " + binary[a] + '\n');
		
		System.out.println("B: " + b);
		System.out.println("Binary B: " + binary[b] + '\n');
		
		System.out.println("A OR B: " + A_OR_B);
		System.out.println("Binary A OR B: " + binary[A_OR_B] + '\n');
		
		System.out.println("A AND B: " + A_AND_B);
		System.out.println("Binary A AND B: " + binary[A_AND_B] + '\n');
		
		System.out.println("A EX-OR B: " + A_EXOR_B);
		System.out.println("Binary A EX-OR B: " + binary[A_EXOR_B] + '\n');
		
		System.out.println("NOT A: " + NOT_A);

	}

}
