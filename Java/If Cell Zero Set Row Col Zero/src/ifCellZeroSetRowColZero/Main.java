/**
 * @author Chaitanya Bilgikar
 */
package ifCellZeroSetRowColZero;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int matrix [][] = new int[5][5];
		for (int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				matrix[i][j] = i+j;
			}
		}
		
		CheckCellsForZeros checkCellsForZeros = new CheckCellsForZeros(matrix);
		//checkCellsForZeros.printMatrix();
		checkCellsForZeros.checkForZeros();
		//checkCellsForZeros.printMatrix();
	}

}
