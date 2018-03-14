//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab17b
{
	public static void main( String args[] )
	{
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("\nEnter the word to display :: ");
			String wordInput = keyboard.next();
	
			out.print("Enter the times to display :: ");
 			int timesInput = keyboard.nextInt();
	

			
			
			//call the printWord method
 			WordPrinter.printWord(wordInput, timesInput);



			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));		
	}
}