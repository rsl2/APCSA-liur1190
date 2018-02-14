//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		setPrime(number);
	}

	public Prime(int num)
	{
		number = num;
		setPrime(number);
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		for (int run = 2; run < number; run++)
		{
			if (number % run == 0)
			{
				return false;
			}
		}
		return true;
	}

	public String toString()
	{
		String output = " ";
		if (isPrime() == true)
		{
			output = number + " is prime.\n";
		}
		else if (isPrime() == false)
		{
			output = number + " is not prime.\n";
		}
		return output;
	}
}