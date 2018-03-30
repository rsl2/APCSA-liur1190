//© A+ Computer Science
// www.apluscompsci.com

//inheritance super this example

import static java.lang.System.*;

class Monster
{
	private String myName;

	public Monster()
	{
		this("Monster");  //calls method Monster(name)
	}

	public Monster( String name )
	{
		myName = name;
	}

	public String toString()
	{
		return myName + " ";
	}
}

public class This
{
  public static void main( String[] args )
  {
     Monster thisOne = new Monster();
     out.println(thisOne);
     thisOne=new Monster("Sammy");
     out.println(thisOne);
     thisOne=new Monster("Benny");
     out.println(thisOne);     
  }
}