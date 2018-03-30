//© A+ Computer Science
// www.apluscompsci.com

//inheritance example

import static java.lang.System.*;

class Monster
{
	private String myName = "long way to go for a toString()";

	public Monster()
	{
		//myName = "Monster";    //uncomment and recompile and run
	}

	public Monster( String name )
	{
		myName = name;
	}

	public String toString( )
	{
		return myName;
	}
}

class Witch extends Monster
{
   public Witch( )	//GoodWitch will not compile without this constructor
   { 
   	//automatically calls super()
   }  

   public Witch( String name )
   {

   }
}

class GoodWitch extends Witch
{
   //what do we need here??
   
   
   public GoodWitch( String name )
   {
 	  //automatically calls super()
   }
}

public class WhatsOnTheInside
{
	public static void main ( String[] args )
	{
		GoodWitch bad = new GoodWitch();		//why does this not compile
		out.println(bad);
		
		GoodWitch witch = new GoodWitch("Harriet");
		out.println(witch);
	}
}