
public class randonRowSizeTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int twoDimensionalArray[][] = new int[5][];
		twoDimensionalArray[0] = new int[1];
		twoDimensionalArray[1] = new int[2];
		twoDimensionalArray[2] = new int[3];
		twoDimensionalArray[3] = new int[4];
		twoDimensionalArray[4] = new int[5];
		
		int i, j, k = 0;
		
		for(i = 0; i < 5; i++){
			for(j = 0; j < i + 1; j++){
				
				twoDimensionalArray[i][j] = k;
				if(k <= 9){
					
					System.out.print("0" + twoDimensionalArray[i][j] + " ");
					
				}
				else{
					
					System.out.print(twoDimensionalArray[i][j] + " ");
				
				}
				k++;
				
			}
			
			System.out.println();
		
		}
		
	}

}
