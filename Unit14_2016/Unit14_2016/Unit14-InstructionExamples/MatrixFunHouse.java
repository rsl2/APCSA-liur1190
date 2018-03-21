//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class MatrixFunHouse
{
	private int[][] mat;

	public MatrixFunHouse()
	{

	}

	public MatrixFunHouse(int numRows, int numCols)
	{

	}
	
   public void setSize(int numRows, int numCols)
   {

   }	

	public void setSpot(int row, int col, int val)
	{

	}
	
   public int getRowTotal(int row)
   {
   	int total=0;




		return total;
   }

	public int getTotal()
	{
		int total=0;





		return total;
	}

	public String toString()
	{
		String output="";
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[r].length; c++)
			{
				output+=" "+mat[r][c];
			}
			output+="\n";
		}
		return output;
	}
}