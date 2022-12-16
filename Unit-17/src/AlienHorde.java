//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
//		for (int i = 0; i < aliens.size(); i++) {
//			Alien a = aliens.get(i);
//			if (a.getAlive()) {
//				a.draw(window);
//			}
//			else {
//				window.setColor(Color.BLACK);
//				window.fillRect(0, 0, 800, 600);
//				System.out.println("RAN THIS!!");
////				window.fillRect(a.getX(), a.getY(), a.getWidth(), a.getHeight());
//				aliens.remove(a);
//			}
//		}
		
		for (Alien al : aliens) {
			al.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien a : aliens) {
			if (a.getCurrDir().equals("LEFT")) {
				if (a.getX() - a.getSpeed() <= 0) {
					a.setCurrDir("RIGHT");
					a.move("DOWN");
				}
			}
			else if (a.getCurrDir().equals("RIGHT")) {
				if (a.getX() + a.getSpeed() >= 750) {
					a.setCurrDir("LEFT");
					a.move("DOWN");
				}
			}
			a.move(a.getCurrDir());
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < shots.size(); i++) {
			for (int j = 0; j < aliens.size(); j++) {
				Alien al = aliens.get(j);
				try {
					if (shots.get(i).isCollide(al)) {
						shots.remove(i);
						aliens.remove(j);
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		}
		
	}

	public String toString()
	{
		String returnString = "";
		for (Alien al : aliens) {
			returnString += al;
		}
		return returnString;
	}
}
