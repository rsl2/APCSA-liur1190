//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCS\\APCSA-liur1190\\unit 14\\src\\lab21i.dat"));
		int size = file.nextInt(); file.nextLine();
		String line = file.nextLine();
		Maze test = new Maze(size, line);
		test.hasExitPath(0, 0);
		out.println(test);
		
		
		size = file.nextInt(); file.nextLine();
		line = file.nextLine();
		Maze test2 = new Maze(size, line);
		test2.hasExitPath(0,0);
		out.println(test2);
		
		size = file.nextInt(); file.nextLine();
		line = file.nextLine();
		Maze test3 = new Maze(size, line);
		test3.hasExitPath(0,0);
		out.println(test3);
		
		size = file.nextInt(); file.nextLine();
		line = file.nextLine();
		Maze test4 = new Maze(size, line);
		test4.hasExitPath(0,0);
		out.println(test4);
		
		size = file.nextInt(); file.nextLine();
		line = file.nextLine();
		Maze test5 = new Maze(size, line);
		test5.hasExitPath(0,0);
		out.println(test5);
		
		size = file.nextInt(); file.nextLine();
		line = file.nextLine();
		Maze test6 = new Maze(size, line);
		test6.hasExitPath(0,0);
		out.println(test6);
		
	}
}