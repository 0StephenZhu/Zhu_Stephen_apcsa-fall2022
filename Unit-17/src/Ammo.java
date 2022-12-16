//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private boolean shot;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x, y, 3);
	}

	public Ammo(int x, int y, int s)
	{
		super(x, y, 5, 10, s);
		shot = true;
	}
	
	public boolean isShot() {
		return shot;
	}

	public void draw( Graphics window )
	{
//		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
		window.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}
	
	public void move(String direction) 
	{
		this.setY(this.getY() - this.getSpeed());
		
	}

	public String toString()
	{
		return super.toString();
	}
}
