import java.awt.Color;
import java.awt.Graphics;



public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100, 150);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y) {
		setPos(x, y);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int w, int h) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int w, int h, Color col) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(col);
	}
	

	public void setPos(int x, int y) {
	   xPos = x;
	   yPos = y;
   	}
   
   	public void setX(int x) { 
	   xPos = x;
   	}
   
   	public void setY(int y) {
	   yPos = y;
   	}

	public void setWidth(int w) {
		width = w;
	}

	public void setHeight(int h) {
		height = h;
	}

	public void setColor(Color col)
   	{
   		color = col;
   	}


   	public int getX() {
   		return xPos;
   	}
   	
   	public int getY() {
   		return yPos;
   	}

	public int getWidth() {
		return width;
	}

   	public int getHeight() {
		return height;
	}
   	
   	public Color getColor() {
   		return color;
   	}
	

   	public void draw(Graphics window)
   	{
   		window.setColor(color);
   		window.fillRect(getX(), getY(), getWidth(), getHeight());
   	}

    public void draw(Graphics window, Color col)
    {
    	window.setColor(col);
   		window.fillRect(getX(), getY(), getWidth(), getHeight());
    }
   
   	public boolean equals(Object obj)
	{
   		Block other = (Block) obj;
   		return this.getX() == other.getX() && this.getY() == other.getY()
   				&& this.getWidth() == other.getWidth() 
   				&& this.getHeight() == other.getHeight();
	}
   	
   	public String toString() {
   		return xPos +" "+ yPos +" "+ width +" "+ height +" "+ color;
   	}
}