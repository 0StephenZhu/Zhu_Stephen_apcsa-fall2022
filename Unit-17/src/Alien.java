//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private Image image;
	private String currDir;
	private boolean isAlive;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		this(x, y, 20, 20, 1);
	}

	public Alien(int x, int y, int s)
	{
		this(x, y, 20, 20, s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h, s);
		currDir = "LEFT";
		isAlive = true;
		try
		{
			URL url = getClass().getResource("/images/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public boolean getAlive() {
		return isAlive;
	}
	
	public void setAlive(boolean val) {
		isAlive = val;
	}
	
	public void setCurrDir(String dir) {
		currDir = dir;
	}
	
	public String getCurrDir() {
		return currDir;
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
			this.setY(Math.max(this.getY() - 20*this.getSpeed(), 0));
		}
		else if (direction.equals("DOWN")) {
			this.setY(Math.min(this.getY() + 20*this.getSpeed(), height));
		}
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString();
	}
}
