/**
 * @author Chaitanya Bilgikar
 */
package ifCellZeroSetRowColZero;

public class CheckCellsForZeros {

	private int matrix[][];
	private int rows[];
	private int cols[];	

	public int[] getCols() {
		return cols;
	}

	public void setCols(int[] cols) {
		for(int i = 0 ;i<cols.length ; i++)
		{
			cols[i] = 1;
		}
		this.cols = cols;
	}

	public int[] getRows() {
		return rows;
	}

	public void setRows(int[] rows) {
		for(int i=0; i<rows.length;i++)
		{
			rows[i] = 1;
		}
		this.rows = rows;
		
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		
		this.matrix = matrix;
	}
	
	public CheckCellsForZeros(int matrix[][]) {
		this.setMatrix(matrix);
		this.setRows(new int[this.getMatrix()[0].length]);
		this.setCols(new int[this.getMatrix().length]);
	}
	/*
	 * Method that checks each cell if it is zero. If the zero marker for a row is already set to 0,
	 * that row is skipped. When running throught the columns, the row and column marker should be 
	 * non-zero for a check on that cell to happen.
	 */
	public void checkForZeros()
	{
		for (int i = 0; i<this.getMatrix()[0].length; i++)
		{
			if(this.getRows()[i]!=0)
			{
				for (int j = 0; j<this.getMatrix().length; j++)
				{
					if(this.getCols()[j]!=0 && this.getRows()[i]!=0)
					{
						if(this.getMatrix()[i][j]==0)
						{
							this.getRows()[i]=0;
							this.getCols()[j] =0;
							this.setRowColToZero(i,j);
						}
					}
				}
			}
			
		}
	}
	
	/*
	 * If a cell is found to be zero, this method makes all the elements in that row and column 0
	 */
	public void setRowColToZero(int row,int col)
	{
		for(int j=col; j<this.getMatrix()[row].length; j++)
		{
			this.getMatrix()[row][j] = 0;
		}
		for(int i = row; i<this.getMatrix().length; i++)
		{
			this.getMatrix()[i][col] =0;
		}
	}
	
	public void printMatrix()
	{
		for(int i=0; i<this.getMatrix()[0].length; i++)
		{
			for (int j=0;j<this.getMatrix().length; j++)
			{
				System.out.print("("+i+","+j+")"+this.getMatrix()[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
