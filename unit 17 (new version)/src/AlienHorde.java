//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde extends Alien
{
	private List<Alien> aliens;
	private Graphics window;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		int x = 0;
		int y = 5;
		int speed = 2;
		for (int i=0; i<size; i++)
		{
			aliens.add(new Alien(x, y, 2));
			x += 65;
			if (x >= 670)
			{
				x = 80;
				speed = -speed;
				y += 80;
			}
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		/**this.window = window;
		for(int i = 0; i <aliens.size();i++)
		{
			aliens.get(i).draw(window);
			if(aliens.get(i).getX()==755)
			{
				window.setColor(Color.black);
				window.fillRect(aliens.get(i).getX(), aliens.get(i).getY(), 50, 50);
			}
			if(aliens.get(i).getSpeed()==0)
			{
				window.setColor(Color.black);
				window.fillRect(aliens.get(i).getX(), aliens.get(i).getY(), 40, 40);
			}
				
		}**/
		for( Alien a : aliens)
			a.draw( window );
	}

	public void moveEmAll(String direction)
	{
		/**for(int i = 0; i < aliens.size(); i++)
		{
			if(aliens.get(i).getSpeed()==0)
				aliens.get(i).setY(-100);
			if(aliens.get(i).getX()==755)
			{
				aliens.get(i).setPos(750, aliens.get(i).getY()+40);
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
			}
			else if (aliens.get(i).getX()==0)
			{
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
				
			}
			else
				aliens.get(i).move("");
		
		}**/
		for(Alien a : aliens)
		{
			a.move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		/**for (int i = 0; i <shots.size();i++)
		{
			for (int j = 0; j <aliens.size();j++)
			{
				if((shots.get(i).getX()>=aliens.get(j).getX()-5)&&(shots.get(i).getX()<=aliens.get(j).getX()+aliens.get(j).getWidth()+5))
				{
					aliens.get(j).setSpeed(0);
					window.setColor(Color.black);
					window.fillRect(aliens.get(j).getX(), aliens.get(j).getY(), 40, 40);
					aliens.remove(j);
					shots.get(i).setSpeed(0);
				}
			}
		}**/
		for (int i=0; i<shots.size(); i++)
		{
			for (int j=0; j<aliens.size(); j++)
			{
				if (shots.get(i).getX() >= aliens.get(j).getX()
						&& shots.get(i).getX() <= aliens.get(j).getX() + 45 
						&& shots.get(i).getY() <= aliens.get(j).getY() + 70)
				{
					shots.remove(i);
					aliens.remove(j);
					if (shots.size()==0) break;
				}
			}
		}
	}
	
	public boolean gameIsOver()
	{
		if (aliens.size()==0) return true;
		return false;
	}
	
	public boolean touchingShip(Graphics window, Ship ship)
	{
		boolean touching = false;
		for (Alien al : aliens)
		{
			if ( ((ship.getX() >= al.getX() && ship.getX() <= al.getX()+45)
					|| (ship.getX()+50 >= al.getX() && ship.getX()+50 <= al.getX()+45))
					&& ((ship.getY()+55 >= al.getY() && ship.getY()+55 <= al.getY()+50)
					|| (al.getY() <= ship.getY() && ship.getY() <= al.getY()+50)) )
			{
				touching = true;
			}
		}
		return touching;
	}

	public String toString()
	{
		return "";
	}
}
