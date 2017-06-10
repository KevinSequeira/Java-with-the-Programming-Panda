
public class bitwiseShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Left Shift Operator
		byte a = 32, b;
		int i, c;
		
		i = a << 2; // The binary value of 'a' is shifted by two positions to the left
		            // In this case, we see byte a = 32 (00100000)
					// So i = 128 (10000000)
		
		b = (byte) (a << 3); // In this case, we see that the binary value of 32 is
						     // shifted to the left by 3 positions.
							 // The final output would be, b = 256 (0001 00000000)
							 // However, since 'b' has been forcibly type-converted to
							 // 'byte', the value is trimmed to b = 0 (000000000)
		
		c = a << 3;	// Here, we see that the value is automatically type converted to
					// an integer value, and hence there will be no trimming done.
					// Also, since 'c' is of type 'int', the value gets deposited in the
					// variable without any issues.
		
		System.out.println("Integer A: " + a);
		System.out.println("A Left Shifted by 2: " + i);
		System.out.println("A Left Shifted by 3: " + b);
		System.out.println("A Left Shifted by 3 (Automatic type-conversion): " + c + '\n');

		// Right Shift Operator
		byte d = 64, e;
		
		e = (byte) (d >> 2); // This works similarly to the Left Shift Operator as explained above.
		
		System.out.println("Integer D: " + d);
		System.out.println("D Right Shifted by 2: " + e + '\n');
		
		// Let's see how Right Shift Operator works on negative values
		byte f = -16, g;
		
		g = (byte) (f >> 2); // The Right Shift operator works very differently on negative
							 // values. Fore example, the binary equivalent of -16 is 11101111,
							 // where the 1 in the MSB stands for the negative sign.
		
							 // On shifting this to the right by two spaces, we get
		 					 // 11111011, which in integer form is -4.
		
		System.out.println("Integer F: " + f);
		System.out.println("F Right Shifted by 2: " + g + '\n');
		
		// The Unsigned (Zero Fill) Right Shift Operator
		int h = -1, j; // The Unsigned Right Shift operator works even more differently.
					   // Let us take the example of -1. The value for -1 is
					   // 11111111 11111111 11111111 11111110. On shifting this to the
					   // right by 20 spaces, we get 00000000 00000000 00001111 11111111,
					   // which is equal to 4095 in the integer format.
		
		j = h >>> 20;
		
		System.out.println("Integer H: " + h);
		System.out.println("H Unsigned Right Shifted by 20 spaces: " + j + '\n');
		
	}

}
