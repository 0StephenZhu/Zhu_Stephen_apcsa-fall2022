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

public class Pong extends Canvas implements KeyListener, Runnable
{
	//private BlinkyBall ball;
	//private SpeedUpBall ball;
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	
	private Block leftWall;
	private Block rightWall;
	private Block topWall;
	private Block bottomWall;
	
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;


	public Pong()
	{
		//set up all variables related to the game???
		
	
		//ball = new BlinkyBall(30, 100, 10, 10, Color.BLUE, 2, 1);
		//ball = new SpeedUpBall(30, 100, 10, 10, Color.BLUE, 2, 1);
		ball = new Ball(30, 100, 10, 10, Color.BLUE, 2, 1);
		leftPaddle = new Paddle(20, 200, 10, 40, Color.RED, 2);
		rightPaddle = new Paddle(740, 200, 10, 40, Color.GREEN, 2);
		
		leftWall = new Block(0, 0, 25, 600, Color.WHITE);
		rightWall = new Block(750, 0, 60, 600, Color.WHITE);
		topWall = new Block(0, 0, 800, 20, Color.WHITE);
		bottomWall = new Block(0, 550, 800, 50, Color.WHITE);

		keys = new boolean[4];
		leftScore = 0;
		rightScore = 0;
		

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		addKeyListener(this);
		new Thread(this).start();
				//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		if (ball.didCollideLeft(leftWall)) {
			rightScore++;
			ball.reset(graphToBack, 30, 100, 2, 1);
		}
		else if (ball.didCollideRight(rightWall)) {
			leftScore++;
			ball.reset(graphToBack, 30, 100, 2, 1);
		}
		
		//see if the ball hits the top or bottom wall 

//		if (ball.getY() >= 550 || ball.getY() <= 20) {
//			ball.setySpeed(-ball.getySpeed());
//		}
		
		if (ball.didCollideBottom(bottomWall) || ball.didCollideTop(topWall)) {
			//ball.setySpeed(-ball.getySpeed());
		}

		//Collision with paddle to increase speed (ball adjustments in method rn)
		
		if (ball.didCollideLeft(leftPaddle)) {
		}
		
		if (ball.didCollideRight(rightPaddle)) {
		}
		
//		if (ball.didCollide(leftPaddle)) {
//			System.out.println("leftpad");
//		}
//		if (ball.didCollide(rightPaddle)) {
//			System.out.println("rightpad");
//		}
//		if (ball.didCollide(topWall)) {
//			System.out.println("topwall");
//		}
//		if (ball.didCollide(bottomWall)) {
//			System.out.println("botwall");
//		}
//		
		//see if the paddles need to be moved

		if (keys[0] == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		else if (keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		
		if (keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		else if (keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
		//Original case values: W Z I M
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
		//Original case values: W Z I M
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}