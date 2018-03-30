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

	public void overRide( )
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

	public void overRide( )
	{
		System.out.println("overRide in Witch\n");
	}

	public String toString()
	{
		return "Witches are the best!!!!!\n";
	}
}

class Ghost extends Monster
{
   public Ghost( String name )
   {
      super(name);
   }

   /*
   //java:57: overRide() in Ghost cannot override overRide() in Monster;
   public int overRide( )
   {
      System.out.println("overRide in Ghost");
      return 0;		///attempting to use incompatible return type
   }*/


   public String toString()
   {
      return "Ghosts are the best!!!!!\n";
   }
}


public class OverRide
{
  public static void main ( String[] args )
  {
     Monster ghost = new Ghost("Casper");
     out.println(ghost);
     ghost.overRide();

     Monster witch = new Witch("Harriet");
     out.println(witch);
     witch.overRide();
  }
}