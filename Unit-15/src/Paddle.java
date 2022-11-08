//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
	   setSpeed(5);
   }

   public Paddle(int s) {
	   super(10, 10);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y) {
	   super(x, y);
	   setSpeed(5);
   }
   
   public Paddle(int x, int y, int s) {
	   super(x, y);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y, int w, int h, int s) {
	   super(x, y, w, h);
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int s) {
	   super(x, y, w, h, c);
	   setSpeed(s);
   }
   
   public void setSpeed(int s) {
	   speed = s;
   }


   public void moveUpAndDraw(Graphics window)
   {
	   if (getY() - speed >= 20) {
		   draw(window, Color.WHITE);
		   setY(getY() - speed);
		   draw(window);  
	   }

   }

   public void moveDownAndDraw(Graphics window)
   {
	   if (getY() + speed <= 520) {
		   draw(window, Color.WHITE);
		   setY(getY() + speed);
		   draw(window);   
	   }

   }

   public int getSpeed() {
	   return speed;
   }
   
   public boolean equals(Object obj) {
	   Paddle other = (Paddle) obj;
	   if (super.equals(other) && getSpeed() == other.getSpeed()) {
		   return true;
	   }
	   return false;
   }
   
   public String toString() {
	   String returnString = "";
	   returnString += super.toString();
	   returnString += this.getColor() + " " + this.getSpeed() + "\n";
	   return returnString;
   }
}