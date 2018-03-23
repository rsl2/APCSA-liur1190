//© A+ Computer Science
// www.apluscompsci.com

//binary search example

import static java.lang.System.*;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item, int bot, int top)
	{
		if(bot>top)
	      return -1;   //returns -1 if not found
	   int spot = (bot+top)/2;
	   if(ray[spot]==item)
	      return spot;
	   else if(ray[spot]>item)
	      return binarySearch(ray, item, bot, spot-1);
	   else
	      return binarySearch(ray, item, spot+1, top);   
	}
}