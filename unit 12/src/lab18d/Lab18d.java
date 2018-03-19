package lab18d;
//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCS\\APCSA-liur1190\\unit 12\\src\\lab18d\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<Word> output = new ArrayList<Word>();
		while (file.hasNextLine())
		{
			output.add(new Word(file.nextLine()));
		}
		
		
		boolean ready = true;
		int i_start = 0;
		int i_end = size - 1;
		while (ready)
		{
			ready = false;
			for (int i_left = i_start; i_left < i_end; i_left++)
			{
				int i_right = i_left +1;
				Word left = output.get(i_left);
				Word right = output.get(i_right);
				if (left.compareTo(right) > 0)
				{
					output.set(i_left, right);
					output.set(i_right, left);
					i_start = Math.max(0, i_left - 1);
					ready = true;
					break;
				}
			}
		}
		
		for (Word i : output)
		{
			out.println(i.toString());
		}

	}
}
