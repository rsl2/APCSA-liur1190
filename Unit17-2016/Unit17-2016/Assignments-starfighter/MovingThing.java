//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Locatable
{
	private int xPos;
	private int yPos;

	public MovingThing()
	{
		//add more code
	}

	public MovingThing(int x, int y)
	{
		//add more code
	}

	public void setPos( int x, int y)
	{
		//add more code
	}


	public void setX(int x)
	{
		//add more code
	}


	public void setY(int y)
	{
		//add more code
	}

	public int getX()
	{
		return 0;
	}


	public int getY()
	{
		return 0;
	}

	public abstract void setSpeed( int s );
	public abstract int getSpeed();
	public abstract void draw(Graphics window);

	public void move(String direction)
	{
		if(direction.equals("LEFT"))
	      setX(getX()-getSpeed());

      //add more code to complete the move method
	}

	public String toString()
	{
		return "";
	}
}