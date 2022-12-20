//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;

    private AlienHorde horde;
	private Bullets shots;
	

	private boolean[] keys;
	private BufferedImage back;
	
	private int shotCooldown;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400, 500, 40, 40, 2);
		int startX = 500;
		int n = 5;
//		alienOne = new Alien(500, 40, 30, 30, 1);
//		alienTwo = new Alien(440, 40, 30, 30, 1);
		
		horde = new AlienHorde(n);
		for (int i = 0; i < n; i++) {
			horde.add(new Alien(startX, 40, 30, 30, 2));
			startX -= 60;
		}
//		horde.add(alienOne);
//		horde.add(alienTwo);
		shots = new Bullets();
		
		shotCooldown = 0;
		

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

//		alienOne.draw(graphToBack);
//		alienTwo.draw(graphToBack);
		
		if (keys[0] == true) {
			ship.move("LEFT");
		}
		if (keys[1] == true) {
			ship.move("RIGHT");
		}
		if (keys[2] == true) {
			ship.move("UP");
		}
		if (keys[3] == true) {
			ship.move("DOWN");
		}
		
		//add code to move Ship, Alien, etc.


		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		shotCooldown++;
		if (keys[4] == true && shotCooldown >= 10) {
			shots.add(new Ammo(ship.getX() + ship.getWidth() / 2, ship.getY() - 10, 1));
			keys[4] = false;
			shotCooldown = 0;
		}
		
		horde.moveEmAll();
		shots.moveEmAll();
		

		horde.removeDeadOnes(shots.getList());
		shots.cleanEmUp();
		
		ship.draw(graphToBack);
		graphToBack.setColor(Color.YELLOW);
		shots.drawEmAll(graphToBack); 
		horde.drawEmAll(graphToBack);

		twoDGraph.drawImage(back, null, 0, 0);
		
//		for (Ammo a : shots.getList()) {
//		graphToBack.setColor(Color.BLACK);
//		a.draw(graphToBack);
//	}
//	shots.cleanEmUp();
//	if (shots.getList().size() > 0) {
//		graphToBack.setColor(Color.BLACK);
//		shots.drawEmAll(graphToBack);
//		shots.moveEmAll();
//		graphToBack.setColor(Color.YELLOW);
//		shots.drawEmAll(graphToBack);
//	}
	
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

