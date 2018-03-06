import java.lang.System;
import java.lang.Math;

public class labassessment1
{
	public static void main( String args[] )
	{
		//add test cases
		Numbers.isGoofy(12);
		Numbers.isGoofy(15);
		Numbers.isGoofy(26);
		Numbers.isGoofy(8);
		Numbers.isGoofy(1234);
		
		Numbers.getSomeGoofyNumbers(3);
		Numbers.getSomeGoofyNumbers(15);
		
	}

}

public class Numbers
{
	
	
	public Numbers()
	{
		
	}
	
	
	public static boolean isGoofy(int num)
	{
		
		int sum = 0;
		int number = num;
		while (num > 0)								//loop: 2
		{
			int dig = num % 10;						//digit extract: 2
			if (dig!= 0 && number % dig == 0)		//conditional: 2
			{
				sum = sum + dig;
				
			}
			num = num / 10;							//num update: 2
		}
		return (sum != 0 && sum % 2 != 0);			//return boolean 1
				
	}
	
	public static int[] getSomeGoofyNumbers(int count)
	{
		/**int[] goofies = new int[count];
		int stop = count;
		while (stop > 0)
			for (int i = 0; i < 100; i++)
				if (isGoofy(i) == false)
					goofies[i] = i;
					stop--;
		
		return goofies;**/
		
		int[] ray = new int[count];
		for (int i =0, x = 1; i < count; x++)
		{
			if (isGoofy(x))
			{
				ray[i] =x;
				i++;
			}
		}
		return ray;
		
	}
}
