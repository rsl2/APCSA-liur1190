//© A+ Computer Science  -  www.apluscompsci.com
//Name - Rachael Liu
//Date - 2/12/18
//Class - P.1
//Lab  - Lab05d

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
	}

	public CharacterAnalyzer(char c)
	{
		theChar = ' ';

	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		return Character.getType(theChar) == Character.UPPERCASE_LETTER;
		
	}

	public boolean isLower( )
	{
		return Character.getType(theChar) == Character.LOWERCASE_LETTER;

	}
	
	public boolean isNumber( )
	{
		return Character.isDigit(theChar);

	}	

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
		if (isUpper() == true)
			return "" + getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";

		else if (isLower() == true)
			return "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		
		else if (isNumber() == true)
			return " " + getChar() + " is a number. ASCII == " + getASCII() + "\n";
		
		else
			return null;

	}
}