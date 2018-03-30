//© A+ Computer Science
// www.apluscompsci.com

//inheritance example

import static java.lang.System.*;

class A
{
   private int x;
   
   public A() { 
      x =8;
   }
   
   public void setX(int val)
   {
   	x=val;
   }
   
   public int getX()
   {
   	return x;
   }
   
   public String toString() 
   { 
      return ""+getX();
   }
}

class B extends A
{
   //no visible code
}

public class InheritOne
{
  public static void main ( String[] args )
  {
		//test code in the main method
		A one = new A();
		out.println(one);
		one.setX(11);
		out.println(one.getX());
		one = new B();
		out.println(one);    
		one.setX(24);
		out.println(one.getX());		
  }
}