//© A+ Computer Science  -  www.apluscompsci.com
//Name - Rachael Liu
//Date - 2/21/18
//Class - P.1
//Lab  - Lab11c

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle(0, "");
		size = 0;
		letter = " ";
	}

	public TriangleThree(int sz, String let)
	{
		setTriangle(size, letter);
	}

	public void setTriangle(int sz, String let)
	{
		size = sz;
		letter = let;
	}

	/**public String getLetter()
	{
		return letter;
	}**/

	public String toString()
	{
		String output="";
		for (int i = 0; i < size; i++)
		{
			for (int j = size; j >= i; j--)
			{
				output = output + " ";
			}
			for (int k = 0; k <= i; k++)
			{
				output = output + letter;
			}
			output = output + "\n";
		}
		return output;
	}
}