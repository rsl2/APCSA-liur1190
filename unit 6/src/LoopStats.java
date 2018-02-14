//© A+ Computer Science  -  www.apluscompsci.com
//Name - Rachael Liu
//Date - 2/12/18
//Class - P.1
//Lab  - Lab08g

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		setNums(start, stop);
	}

	public LoopStats(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int run = start; run <= stop; run++)
		{
			evenCount++;
		}
		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int run = start; run <= stop; run++)
		{
			oddCount++;
		}
		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int run = start; run <= stop; run++)
		{
			total = total + run;
		}
		return total;
	}
	
	public String toString()
	{
		return start + " " + stop + "\ntotal = " + getTotal() + "\neven count: " + getEvenCount() + "\nodd count: " + getOddCount();
	}
}