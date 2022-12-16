//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   this(x, y, 10, 10, 2);
	}

	public Ship(int x, int y, int s)
	{
	   this(x, y, 10, 10, s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h, s);
		try
		{
			URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("hmmm");
		}
	}


	public void move(String direction)
	{
		int width = 800;
		int height = 600 - 100;
		if (direction.equals("LEFT")) {
			this.setX(Math.max(this.getX() - this.getSpeed(), 0));
		}
		else if (direction.equals("RIGHT")) {
			this.setX(Math.min(this.getX() + this.getSpeed(), width));
		}
		else if (direction.equals("UP")) {
			this.setY(Math.max(this.getY() - this.getSpeed(), 0));
		}
		else if (direction.equals("DOWN")) {
			this.setY(Math.min(this.getY() + this.getSpeed(), height));
		}
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,this.getX(),this.getY(),this.getWidth(),this.getHeight(),null);
	}

	public String toString()
	{
		return super.toString();
	}
}
