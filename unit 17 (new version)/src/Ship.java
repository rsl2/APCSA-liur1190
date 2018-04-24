//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;
	private Graphics window;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
		this(x,y,10,10,10);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		this(x,y,10,10,s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		
		try
		{
			image = ImageIO.read(new File("H:\\APCS\\APCSA-liur1190\\unit 17\\src\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Houston, we have a problem.");
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		if(direction.equals("LEFT"))
		      setX(getX()-getSpeed());

		if(direction.equals("RIGHT"))
			setX(getX()+getSpeed());
			
		if(direction.equals("UP"))
			setY(getY()-getSpeed());
			window.setColor(Color.black);
			window.fillRect(getX()+35, getY()+90, 10, 5);
			
		if(direction.equals("DOWN"))
			setY(getY()+getSpeed());
	}

	public void draw( Graphics window )
	{
		this.window = window;
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	
	/**public void shoot(Graphics window)
	{
		Ammo ammo = new Ammo(this.getX()+40,this.getY()+20,3);
		ammo.draw(window);
		ammo.move("");
	}**/

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
