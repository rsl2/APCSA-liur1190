//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "";

	}

	public StringChecker(String s)
	{
		setString("");

	}

   public void setString(String s)
   {
	   word = s;
   }

	public boolean findLetter(char c)
	{
		if (word.indexOf(c) == -1) 
			return false;
		else
			return true;
	}

	public boolean findSubString(String a)
	{
		if (word.indexOf(a) == -1)
			return false;
		else
			return true;

	}

 	public String toString()
 	{
 		return word + "\n";
	}
}