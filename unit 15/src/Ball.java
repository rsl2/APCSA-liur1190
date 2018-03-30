//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x)
	{
		setXSpeed(x);
		ySpeed = 0;
	}
	
	public Ball(int x, int y)
	{
		setXSpeed(x);
		setYSpeed(y);
	}
	
	   
   //add the set methods
	public void setXSpeed(int x)
	{
		xSpeed = x;
	}
	
	public void setYSpeed(int y)
	{
		ySpeed = y;
	}
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location


      setX(getX()+xSpeed);
		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if (super.equals(obj) && getXSpeed() == other.getXSpeed() && getYSpeed() == other.getYSpeed())
			return true;

		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}

   //add a toString() method
	public String toString()
	{
		String output = " ";
		output += super.toString();
		output += getXSpeed() + " " + getYSpeed();
		return output;
	}
}