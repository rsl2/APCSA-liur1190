//© A+ Computer Science
// www.apluscompsci.com

//polymorphism example

import static java.lang.System.*;

class Monster
{
	private String myName;

	public Monster()
	{
		myName = "Monster";
	}

	public Monster( String name )
	{
		myName = name;
	}

	public String toString()
	{
		return "Monster name :: " + myName + "\n";
	}
}

class Witch extends Monster
{
	public Witch(  )
	{
		super();
	}

	public Witch(String name)
	{
		super(name);
	}
}


class Ghost extends Monster
{
	public Ghost(  )
	{
		super();  //happens automatically
	}

	public Ghost(String name)
	{
		super(name);
	}

	public void whoot()
	{
		System.out.println("Ghost says whoot!");
	}
}

public class Poly
{
	public static void main ( String[] args )
	{
	   Monster x = new Ghost("Casper");
	   out.println(x);

	   x=new Witch("Harriet");
	   out.println(x);

	   x=new Ghost("Johny Cash");
	   out.println(x);

	   x=new Ghost("Chucky");
	   out.println(x);
	   //x.whoot();  //what is the problem?
   }
}
