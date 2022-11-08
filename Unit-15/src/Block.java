//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

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
		this(100, 150, 10, 10, Color.BLACK);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) {
		this(x, y, 10, 10, Color.BLACK);
	}
	
	public Block(int x, int y, int w, int h) {
		this(x, y, w, h, Color.BLACK);
	}
	
	public Block(int x, int y, int w, int h, Color c) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	
   //add the other set methods
   
   public void setX(int x) {
	   xPos = x;
   }
   
   public void setY(int y) {
	   yPos = y;
   }
   
   public void setPos(int x, int y) {
	   xPos = x;
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
      window.setColor(getColor());
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block)(obj);
		
		if (getX() != other.getX()) return false;
		if (getY() != other.getY()) return false;
		if (getWidth() != other.getWidth()) return false;
		if (getHeight() != other.getHeight()) return false;
		if (getColor() != other.getColor()) return false;

		return true;
	}   

   public String toString() {
	   String returnString = "";
	   returnString += this.getX() + " " + this.getY() + " " + this.getWidth() + " " + this.getHeight() + "\n";
	   return returnString;
   }
   
}