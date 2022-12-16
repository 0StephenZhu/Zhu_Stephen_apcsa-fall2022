//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Moveable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int speed;

	public MovingThing()
	{
		this(10, 10, 10, 10, 2);
	}

	public MovingThing(int x, int y)
	{
		this(x, y, 10, 10, 2);
	}

	public MovingThing(int x, int y, int w, int h)
	{
		this(x, y, w, h, 2);
	}
	
	public MovingThing(int x, int y, int w, int h, int s) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setSpeed(s);
	}

	public void setPos( int x, int y)
	{
		xPos = x;
		yPos = y;
	}

	public void setX(int x)
	{
		xPos = x;
	}

	public void setY(int y)
	{
		yPos = y;
	}

	public int getX()
	{
		return xPos;
	}

	public int getY()
	{
		return yPos;
	}

	public void setWidth(int w)
	{
		width = w;
	}

	public void setHeight(int h)
	{
		height = h;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean isCollide(MovingThing other) {
		int h = this.getY() + this.getHeight();
		int w = this.getX() + this.getWidth();
		if (simplify(this.getX(), h - this.getHeight() / 2, other)) return true;
		if (simplify(w, h - this.getHeight() / 2, other)) return true;
		if (simplify(w - this.getWidth() / 2, this.getY(), other)) return true;
		if (simplify(w - this.getWidth() / 2, h, other)) return true;
		return false;
	}
	
	public boolean simplify(int x, int y, MovingThing other) {
		return (x > other.getX() && x < other.getX() + other.getWidth() && y > other.getY() && y < other.getY() + other.getHeight());
	}

	public abstract void move(String direction);
	public abstract void draw(Graphics window);

	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getSpeed();
	}
}