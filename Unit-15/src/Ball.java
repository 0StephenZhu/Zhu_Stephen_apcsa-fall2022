//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setxSpeed(3);
		setySpeed(1);
	}

	public Ball(int x, int y) {
		super(x, y);
		setxSpeed(3);
		setySpeed(1);
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		setxSpeed(3);
		setySpeed(1);
	}
	
	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		setxSpeed(3);
		setySpeed(1);
	}

	public Ball(int x, int y, int w, int h, int xS, int yS) {
		super(x, y, w, h);
		setxSpeed(xS);
		setySpeed(yS);
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xS, int yS) {
		super(x, y, w, h, c);
		setxSpeed(xS);
		setySpeed(yS);
	}
	
	
   public void setxSpeed(int x) {
	   xSpeed = x;
   }
   
   public void setySpeed(int y) {
	   ySpeed = y;
   }
   
   public int getxSpeed() {
	   return xSpeed;
   }
   
   public int getySpeed() {
	   return ySpeed;
   }
   

   public void moveAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
       setX(getX()+xSpeed);
	   setY(getY()+ySpeed);
	   draw(window); 
   }
   
   //Reset ball
   public void reset(Graphics window, int x, int y, int xS, int yS) {
	   draw(window, Color.WHITE);
	   setX(x);
	   setY(y);
	   setxSpeed(xS);
	   setySpeed(yS);
   }
   
   
   //Collision methods
   
	public boolean didCollideLeft(Object obj) {
		Block object = (Block) obj;
		int objX = object.getX() + object.getWidth();
		int objY = object.getY() + object.getHeight();
		int predX = getX() + getxSpeed();
		int predY = getY() ; //+ getySpeed()
		
		boolean testX = (predX <= objX);
		boolean testY1 = (predY + getHeight() >= object.getY() && predY <= objY);
		if (testX && (testY1)) {
			if (predX <= objX - Math.abs(getxSpeed())) {
				setySpeed(-getySpeed());
			}
			else {
				setxSpeed(-getxSpeed());
			}
			return true;
		}
		
		return false;
	}
	
	public boolean didCollideRight(Object obj) {
		Block object = (Block) obj;
		int objX = object.getX();
		int objY = object.getY() + object.getHeight();
		int predX = getX() + getWidth() + getxSpeed();
		int predY = getY() ; //+ getySpeed()
		
		boolean testX = (predX >= objX);
		boolean testY1 = (predY + getHeight() >= object.getY() && predY <= objY);
		
		if (testX && testY1) {
			if (predX >= objX + Math.abs(getxSpeed())) {
				setySpeed(-getySpeed());
			}
			else {
				setxSpeed(-getxSpeed());
			}
			return true;
		}
		return false;
	}
	
	public boolean didCollideTop(Object obj) {
		Block object = (Block) obj;
		int objY = object.getY() + object.getHeight();
		if (objY > getY() + getySpeed()) {
			setySpeed(-getySpeed());
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj) {
		Block object = (Block) obj;
		int objY  = object.getY();
		if (objY < getY() + getySpeed()) {
			setySpeed(-getySpeed());
			return true;
		}
		return false;
	}
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		if (super.equals(obj) && getxSpeed() == other.getxSpeed() && getySpeed() == other.getySpeed()) {
			return true;
		}

		return false;
	}   

    public String toString() {
    	String returnString = "";
    	returnString += super.toString();
    	returnString += getxSpeed() + " " + getySpeed() + "\n";
    	return returnString;
    }
}