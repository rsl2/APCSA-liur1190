//© A+ Computer Science
// www.apluscompsci.com

//inheritance super this example

import static java.lang.System.*;

class Monster
{
	private String myName;

	public Monster()
	{
		this("Monster");
	}

	public Monster( String name )
	{
		myName = name;
	}

	public void fun( )
	{
		out.println("Monster fun");
	}

	public String toString()
	{
		return myName + " ";
	}
}

class Skeleton extends Monster
{
   private double speed;

   public Skeleton(  )
   {
   	//super(); //super() call happens automatically
      speed=100;
   }

   public Skeleton( String name, double speed )
   {
      super(name);       //super refers to the parent object
      this.speed=speed;   //this seperates instance var from parameter
   }

   public void fun( )
   {
      out.println("Skeleton fun");
   }

   public void funtest( )
   {
      super.fun();  //calls Monster.fun( )

      this.fun();   //calls Skeleton.fun()
   }

   public String toString()
   {
      return super.toString() + " " + speed;   //super refers to the parent object
   }
}

public class SuperThis
{
  public static void main ( String[] args )
  {
     Skeleton skelly = new Skeleton();
     out.println(skelly);
     skelly = new Skeleton("Bones",1002);
     out.println(skelly);
     skelly.fun();
     skelly.funtest();
  }
}