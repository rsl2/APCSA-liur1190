package lab18e;
//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File ("H:\\APCS\\APCSA-liur1190\\unit 12\\src\\lab18e\\lab18e.dat"));
		int size = file.nextInt();
		file.nextLine();
		Word2[] wordlist = new Word2[size];
		
		for(int i = 0; i < size; i++){
			wordlist[i] = new Word2(file.nextLine());
		}
		
		for(int i = 0; i < size; i++){
			for(int a = 0; a < size - 1; a++){
				if(wordlist[a].compareTo(wordlist[a + 1]) == 1){
					Word2 one = wordlist[a + 1];
					wordlist[a + 1] = wordlist[a];
					wordlist[a] = one;
				}
			}
		}
		
		for(int i = 0; i < wordlist.length; i++){
			System.out.println(wordlist[i].toString());
		}
	
	}
	
}


