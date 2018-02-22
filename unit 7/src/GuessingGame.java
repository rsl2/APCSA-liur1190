//© A+ Computer Science  -  www.apluscompsci.com
//Name - Rachael Liu
//Date - 2/20/18
//Class - P.1
//Lab  - Lab10e

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int ans, guess, totalGuesses = 0, wrongAns = 0;

	public GuessingGame(int stop)
	{
		upperBound = stop;		
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		ans = (int)(Math.random() * upperBound + 1);
		
		do{
			System.out.println("Enter a number between 1 and " + upperBound + ": ");
			guess = keyboard.nextInt();
			totalGuesses++;
			if (guess != ans)
			{
				wrongAns++;
			}
		} while (guess != ans);
	}

	public String toString()
	{
		String output = "It took " + totalGuesses + " guesses to get to " + ans + "\nYou guessed right " + 100/totalGuesses + " percent of the time";
		return output;
	}
}