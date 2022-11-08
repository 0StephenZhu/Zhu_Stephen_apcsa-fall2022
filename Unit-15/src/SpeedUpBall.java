//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

   public SpeedUpBall()
   {
	   super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y, xSpd, ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col, xSpd, ySpd);
   }

   public void setxSpeed( int xSpd )
   {
	   super.setxSpeed(xSpd);
   }

   public void setySpeed( int ySpd )
   {
	   super.setySpeed(ySpd);
   }
   
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
				setxSpeed(-getxSpeed() + 1);
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
				setxSpeed(-getxSpeed() - 1);
			}
			return true;
		}
		return false;
	}
	
	public boolean didCollideTop(Object obj) {
		Block object = (Block) obj;
		int objY = object.getY() + object.getHeight();
		if (objY > getY() + getySpeed()) {
			setySpeed(-getySpeed() + 1);
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj) {
		Block object = (Block) obj;
		int objY  = object.getY();
		if (objY < getY() + getySpeed()) {
			setySpeed(-getySpeed() - 1);
			return true;
		}
		return false;
	}
}

