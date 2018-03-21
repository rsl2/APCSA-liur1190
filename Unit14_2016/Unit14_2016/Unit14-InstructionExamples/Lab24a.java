//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Lab24a
{
	public static void main( String args[] )
	{
		MatrixFunHouse test = new MatrixFunHouse(10,10);
		out.println("mat before changes \n"+test);
		test.setSpot(2,2,6);
		test.setSpot(3,4,7);
		test.setSpot(1,1,2);
		test.setSpot(0,1,4);
		test.setSpot(0,2,6);
		test.setSpot(0,0,5);
		test.setSpot(3,2,9);
		test.setSpot(8,2,9);
		test.setSpot(7,8,9);
		out.println("mat after changes \n"+test);
		System.out.println("matrix row 0 total  = "+test.getRowTotal(0) + "\n");
		System.out.println("matrix row 2 total = "+test.getRowTotal(2) + "\n");
		System.out.println("matrix row 4 total = "+test.getRowTotal(4) + "\n");
		System.out.println("matrix total = "+test.getTotal() + "\n\n");
	}
}