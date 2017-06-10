
public class twoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int twoD[][] = new int[4][5];
		int i, j, k = 0;

		for(i = 0; i < 4; i++){
			for(j = 0; j < 5; j++){

				twoD[i][j] = k;
				if(k <= 9){
					
					System.out.print(" " + twoD[i][j] + " ");
				
				}
				else{
					
					System.out.print(twoD[i][j] + " ");
					
				}
				k++;
			
			}
			System.out.println();
			
		}
		
	}

}
