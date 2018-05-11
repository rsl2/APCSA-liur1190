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
	

	public Ball(int x, int y)
	{
		super(x, y);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x, y, w, h);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, Color col)
	{
		super(x, y, w, h, col);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xS, int yS)
	{
		super(x, y, w, h, col);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	
	
	   
   //add the set methods
	public void setXSpeed(int xS) {
		xSpeed = xS;
	}
	
	public void setYSpeed(int yS) {
		ySpeed = yS;
	}
	

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   Color temp = getColor();
		draw(window, Color.WHITE);
		setPos(getX()+xSpeed, getY()+ySpeed);
		draw(window, temp);

		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		return super.equals(other)
				&& this.getXSpeed() == other.getXSpeed()
				&& this.getYSpeed() == other.getYSpeed();




		
	}   
	
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

   //add the get methods
	
	public boolean didCollideLeftWall(Object obj) {
		Wall other = (Wall) obj;
		return this.getX() <= other.getLeft();
	}
	
	public boolean didCollideRightWall(Object obj) {
		Wall other = (Wall) obj;
		return this.getX() >= other.getRight();
	}
	
	public boolean didCollideTopWall(Object obj) {
		Wall other = (Wall) obj;
		return this.getY() <= other.getTop();
	}

	public boolean didCollideBottomWall(Object obj) {
		Wall other = (Wall) obj;
		return this.getY()+9 /*because the bottom wall is screwed up*/ >= other.getBottom();
	}
	
	
	
	/**public boolean didCollideLeft(Object obj)
	{
		Paddle paddle = (Paddle)obj;
		if((getX() <= paddle.getX() + paddle.getWidth() && getX() > paddle.getX() && (getY() >= paddle.getY() && getY()<= paddle.getY()+paddle.getHeight()))){
			System.out.println("Colliding Left");
			return true;

		}
		return false;
	}
    public boolean didCollideRight(Object obj)
    {
		Paddle paddle = (Paddle)obj;
		if((getX()+getWidth() >= paddle.getX() && getX()<paddle.getX() && (getY() >= paddle.getY() && getY() <= paddle.getY()+paddle.getHeight()))){
			System.out.println("Colliding Right");
				return true;
		}
    	return false;
    }
    public boolean didCollideTop(Object obj)
    {
		Paddle paddle = (Paddle)obj;
    	if (getY()<=paddle.getY() && getY() <= paddle.getY()+paddle.getHeight()&&(getX()>=paddle.getX()&& getX()+getWidth()<=paddle.getHeight())){
			System.out.println("Colliding Top");
			return true;


    	}
    	return false;
    }
    public boolean didCollideBottom(Object obj)
    {
		Paddle paddle = (Paddle)obj;
    	if(getY()>=paddle.getY()&&getY()<=paddle.getY()+paddle.getHeight()&&(getX()>=paddle.getX()&&getX()<=paddle.getWidth()+paddle.getX()))
    	{
			System.out.println("Colliding Bottom");

    		return true;

    	}
    	return false;
    }**/
	
	public boolean didCollidePaddle(Object obj){
		   Paddle paddle = (Paddle) obj;
		   if(getX()>paddle.getX() && getX() < paddle.getX()+paddle.getWidth()){
				if(getY()>paddle.getY() && getY() < paddle.getY()+paddle.getHeight()){
					return true;
				}
			}
		   return false;
	   }
	   
	   public boolean didCollidePaddleX(Object obj){
		   Paddle paddle = (Paddle) obj;
		   if(getX()-5*getXSpeed()>paddle.getX()+40){
			   return true;
		   }
		   if(getX()-5*getXSpeed()<paddle.getX()){
			   return true;
		   }
		   return false;
	   }
	   
	   public boolean didCollidePaddleY(Object obj){
		   Paddle paddle = (Paddle) obj;
		   if(getY()-5*getYSpeed()>paddle.getY()+40){
			   return true;
		   }
		   if(getY()-5*getYSpeed()<paddle.getY()){
			   return true;
		   }
		   return false;
	   }
	   
	public String toString() {
		return super.toString() +" "+ getXSpeed() +" "+ getYSpeed();
	}

   //add a toString() method
}