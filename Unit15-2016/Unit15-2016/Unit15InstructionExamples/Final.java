//© A+ Computer Science
// www.apluscompsci.com

//inheritance method override example

import static java.lang.System.*;

class Monster
{
	private String myName;   	// inherited, but not accessible in sub class

	public Monster() { }

	public Monster( String name )
	{
		myName = name;
	}

	public final void overRide( )
	{
		System.out.println("overRide in Monster\n");
	}

	public String toString()
	{
		return "Monster name :: " + myName + "\n";
	}
}

class Witch extends Monster
{
	public Witch( String name )
	{
		super(name);
	}

	//this will not compile
	/*
	public void overRide( )
	{
		System.out.println("overRide in Witch\n");
	}
	*/
	

	public String toString()
	{
		return "Witches are the best!!!!!\n";
	}
}

public class Final
{
  public static void main ( String[] args )
  {
     Monster monster = new Monster("Monster");
     out.println(monster);
     monster.overRide();
       	
     Monster witch = new Witch("Harriet");
     out.println(witch);
     witch.overRide();
  }
}