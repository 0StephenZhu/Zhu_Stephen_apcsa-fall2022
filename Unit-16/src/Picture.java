import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyRed() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] row : pixels) {
		  for (Pixel pix : row) {
			  pix.setGreen(0);
			  pix.setBlue(0);
		  }
	  }
  }
  
  public void keepOnlyGreen() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] row : pixels) {
		  for (Pixel pix : row) {
			  pix.setRed(0);
			  pix.setBlue(0);
		  }
	  }
  }
  
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] row : pixels) {
		  for (Pixel pix : row) {
			  pix.setRed(0);
			  pix.setGreen(0);
		  }
	  }
  }
  
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] row : pixels) {
		  for (Pixel pix : row) {
			  pix.setRed(255 - pix.getRed());
			  pix.setGreen(255 - pix.getGreen());
			  pix.setBlue(255 - pix.getBlue());
		  }
	  }	  
  }
  
  public void grayscale() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] row : pixels) {
		  for (Pixel pix : row) {
			  int avgVal = (pix.getRed() + pix.getGreen() + pix.getBlue()) / 3;
			  pix.setRed(avgVal);
			  pix.setGreen(avgVal);
			  pix.setBlue(avgVal);
		  }
	  }	  
  }
  
  public void fixUnderwater() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] row : pixels) {
		  for (Pixel pix : row) {
//			  pix.setRed(avgVal);
//			  pix.setGreen(avgVal);
			  pix.setRed(pix.getRed() * 4);
			  pix.setGreen(pix.getGreen() / 2);
			  pix.setBlue(pix.getBlue() / 2);
		  }
	  }	
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++) {
    	for (int col = 0; col < pixels[0].length; col++) {
    		topPixel = pixels[row][col];
    		botPixel = pixels[height - 1 - row][col];
    		botPixel.setColor(topPixel.getColor());
    	}
    }
  }
  
  public void mirrorHorizontalBotToTop() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++) {
    	for (int col = 0; col < pixels[0].length; col++) {
    		topPixel = pixels[row][col];
    		botPixel = pixels[height - 1 - row][col];
    		topPixel.setColor(botPixel.getColor());
    	}
    }
  }
  
  public void mirrorDiagonal() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel origPixel = null;
    Pixel reflectPixel = null;
    for (int row = 0; row < pixels.length; row++) {
    	for (int col = 0; col < row; col++) {
    		origPixel = pixels[row][col];
    		reflectPixel = pixels[col][row];
    		reflectPixel.setColor(origPixel.getColor());
    	}
    }
  
  }
  
  
  
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count);
  }
  
  public void mirrorArms() {
	  	int centerRow = 195;
	    Pixel topPixel = null;
	    Pixel botPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    for (int row = 160; row < centerRow; row++) {
	    	for (int col = 100; col < 170; col++) {
	    		topPixel = pixels[row][col];
	    		botPixel = pixels[2 * centerRow - row][col];
	    		botPixel.setColor(topPixel.getColor());
	    	}
	    	
	    	for (int col = 235; col < 300; col++) {
	    		topPixel = pixels[row][col];
	    		botPixel = pixels[2 * centerRow - row][col];
	    		botPixel.setColor(topPixel.getColor());
	    	}
	    }
  }
  
  public void mirrorGull() {
	  	int centerCol = 350;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D(); 
	    
	    for (int row = 225; row < 330; row++) {
	    	for (int col = 225; col < centerCol; col++) {
	    		leftPixel = pixels[row][col];
	    		rightPixel = pixels[row][2 * centerCol - col];
	    		rightPixel.setColor(leftPixel.getColor());
	    	}
	    }
  }
  
  public void copy(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
	{
	Pixel fromPixel = null;
	Pixel toPixel = null;
	Pixel[][] toPixels = this.getPixels2D();
	Pixel[][] fromPixels = fromPic.getPixels2D();
	for (int fromRow = 0, toRow = startRow; 
	  fromRow < fromPixels.length &&
	  toRow < endRow && toRow < toPixels.length; 
	  fromRow++, toRow++)
	{
	for (int fromCol = 0, toCol = startCol; 
	    fromCol < fromPixels[0].length &&
	    toCol < endCol && toCol < toPixels[0].length;  
	    fromCol++, toCol++)
	{
	 fromPixel = fromPixels[fromRow][fromCol];
	 toPixel = toPixels[toRow][toCol];
	 toPixel.setColor(fromPixel.getColor());
	}
	}   
}
  public void createCollage2() {
	  Picture flower1 = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/flower1.jpg");
	  Picture flower2 = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/flower2.jpg");
	  this.copy(flower1,0,50, 0, 50);
	  this.copy(flower2,200,250,0,30);
//	  this.copy(flower1,400,0,220,20);
	  this.mirrorVertical();
	  this.write("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/640x480.jpg");
  }
  
  public void myCollage() {
	  Picture pic = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/koala.jpg");
	  Picture picNoBlue = new Picture(pic);
	  picNoBlue.zeroBlue();
	  Picture picBright = new Picture(pic);
	  picBright.fixUnderwater();
	  Picture picNegate = new Picture(pic);
	  picNegate.negate();
	  this.copy(picNoBlue, 0, 40, 0, 50);
	  this.copy(picBright, 40, 80, 50, 100);
	  this.copy(picNegate, 80, 120, 60, 90);
	  this.mirrorVertical();
	  this.write("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/wall.jpg");
  }
  
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/flower1.jpg");
    Picture flower2 = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/640x480.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        
        Pixel topPixel = pixels[row][col];
        Pixel botPixel = pixels[row + 1][col];
        Color botColor = botPixel.getColor();
        
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else if (topPixel.colorDistance(botColor) > edgeDist)
        	topPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  

  
  public int decodePixel(Pixel currPixel) {
	  if (currPixel.getRed() % 4 == 2) return 8;
	  int four = (currPixel.getRed() % 2) * 4;
	  int two = (currPixel.getGreen() % 2) * 2;
	  int one = (currPixel.getBlue() % 2);
	  return (four + two + one);
  }
 
  
  public void encode(Picture msgPic) {
	  Pixel[][] msgPixels = msgPic.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel msgPixel = null;
	  
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++) {
			  int count = 0;
			  ArrayList<ArrayList<Integer>> neigh = validNeighbors(row, col, this.getHeight(), this.getWidth());
			  for (ArrayList<Integer> n : neigh) {
				  msgPixel = msgPixels[n.get(0)][n.get(1)];
				  if (msgPixel.colorDistance(Color.BLACK) < 100) { count++; }
			  }

			  //Encoding Algorithm:
			  currPixel = currPixels[row][col];
			  int red = currPixel.getRed();
			  int green = currPixel.getGreen();
			  int blue = currPixel.getBlue();
			  
			  		//Turning all rgb pixels to even
			  red -= red % 4;
			  green -= green % 4;
			  blue -= blue % 4;
			  
			  		//Turn count to binary and encode in pixel
			  		//Exception: if count is 8, then red, green, and blue will be 2 mod 4
			  if (count == 8) {
				  red += 2;
				  green += 2;
				  blue += 2;
			  }
			  else {
				  red += count / 4;
				  count %= 4;
				  green += count / 2;
				  count %= 2;
				  blue += count % 2;
			  }
			  
			  currPixel.setRed(red);
			  currPixel.setGreen(green);
			  currPixel.setBlue(blue);
		  }
	  }
  }
  
  public Picture decode() {
	  Pixel[][] pixels = this.getPixels2D();
	  int row = this.getHeight();
	  int col = this.getWidth();
	  
	  Picture messagePicture = new Picture(row,col);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  
	  int[][] neighborCount = new int[row][col];
	  boolean[][] isDetermined = new boolean[row][col];
	  int[][] unknownNeighborCount = new int[row][col];
	  
	  //Filling isDetermined, unknownNeighborCount, and neighborCount array
	  for (int r = 0; r < row; r++) {
		  for (int c = 0; c < col; c++) {
			  isDetermined[r][c] = false;
			  
			  //Cases for when unknownNeighborCount has pixels at edge or corner:
			  if (r == 0 || r == row - 1 || c == 0 || c == col - 1) {
				  if (r == 0 && c == 0) {
					  unknownNeighborCount[r][c] = 3;
				  }
				  else if (r == 0 && c == col - 1) {
					  unknownNeighborCount[r][c] = 3;
				  }
				  else if (r == row - 1 && c == 0) {
					  unknownNeighborCount[r][c] = 3;
				  }
				  else if (r == row - 1 && c == col - 1) {
					  unknownNeighborCount[r][c] = 3;
				  }
				  else {
					  unknownNeighborCount[r][c] = 5;
				  }
			  }
			  else {
				  unknownNeighborCount[r][c] = 8;
			  }
			  
			  //Decoding the encoded pic
			  neighborCount[r][c] = decodePixel(pixels[r][c]);
		  }
	  }
	  
	  
	  
	  int unknownLeft = row * col;
	  //Loop until no pixel has any neighor black pixels
	  do {
		  for (int r = 0; r < row; r++) {
			  for (int c = 0; c < col; c++) {
				  //Skip if current pixel has all neighbors determined
				  if (unknownNeighborCount[r][c] == 0) continue;
				  
				  //Case if all unknown neighbors are white pixels
				  if (neighborCount[r][c] == 0 && unknownNeighborCount[r][c] > 0) {
					  ArrayList<ArrayList<Integer>> neigh = validNeighbors(r, c, row, col);
					  for (ArrayList<Integer> n : neigh) {
						  int newR = n.get(0);
						  int newC = n.get(1);
						  if (isDetermined[newR][newC]) continue;
						  isDetermined[newR][newC] = true;
						  unknownLeft--;
						  messagePixels[newR][newC].setColor(Color.WHITE);
						  
						  //Decrement unknownNeighborCount for each neighbor of the current pixel's neighbor
						  ArrayList<ArrayList<Integer>> neigh2 = validNeighbors(newR, newC, row, col);
						  for (ArrayList<Integer> n2 : neigh2) {
							  newR = n2.get(0);
							  newC = n2.get(1);
							  unknownNeighborCount[newR][newC]--;
						  }
					  }
				  }
				  //Case if all unknown neighbors are black pixels
				  else if (neighborCount[r][c] == unknownNeighborCount[r][c]) {
					  ArrayList<ArrayList<Integer>> neigh = validNeighbors(r, c, row, col);
					  for (ArrayList<Integer> n : neigh) {
						  int newR = n.get(0);
						  int newC = n.get(1);
						  if (isDetermined[newR][newC]) continue;
						  isDetermined[newR][newC] = true;
						  unknownLeft--;
						  messagePixels[newR][newC].setColor(Color.BLACK);
						  
						  //Decrement unknownNeighborCount and neighborCount
						  ArrayList<ArrayList<Integer>> neigh2 = validNeighbors(newR, newC, row, col);
						  for (ArrayList<Integer> n2 : neigh2) {
							  newR = n2.get(0);
							  newC = n2.get(1);
							  unknownNeighborCount[newR][newC]--;
							  neighborCount[newR][newC]--;
						  }
					  }
				  }
			  }
		  }
		  
		  //System.out.println(unknownLeft);
		  
	  } while (unknownLeft > 0);
	  
	  return messagePicture;
  }
  
  public ArrayList<ArrayList<Integer>> validNeighbors(int row, int col, int height, int width) {
	  ArrayList<ArrayList<Integer>> valid = new ArrayList<ArrayList<Integer>>();
	  int r, c;
	  for (int i = -1; i <= 1; i++) {
		  for (int j = -1; j <= 1; j++) {
			  r = i + row;
			  c = j + col;
			  if (r < 0 || r >= height) continue;
			  if (c < 0 || c >= width) continue;
			  if (i == 0 && j == 0) continue;
			  valid.add(new ArrayList<Integer>(List.of(r, c)));
		  }
	  }
	  return valid;
  }
  
  public Picture convolution() {
	  this.grayscale();
	  Pixel[][] pixels = this.getPixels2D();
      int rows = this.getHeight();
      int cols = this.getWidth();
      
      Picture convolutedPicture = new Picture(rows, cols);
      Pixel[][] convolutedPixels = convolutedPicture.getPixels2D();
      
      int[][] filter = {
    		  {-1, -2, -1},
    		  {0, 0, 0},
    		  {1, 2, 1}
      };
//      int[][] filter = {
//    		  {-1, 0, 1},
//    		  {-2, 0, 2},
//    		  {-1, 0, 1}
//      };
      
      for (int row = 0; row < rows; row++) {
    	  for (int col = 0; col < cols; col++) {
    		  int currVal = 0;
    		  
    		  //Loop neighbors
    		  for (int i = -1; i <= 1; i++) {
    			  for (int j = -1; j <= 1; j++) {
    				  int r = i + row;
    				  int c = j + col;
    				  if (r < 0 || r >= rows) continue;
    				  if (c < 0 || c >= cols) continue;
    				  currVal += filter[i + 1][j + 1] * (int)pixels[r][c].getAverage();
    			  }
    		  }
    		  
    		  if (currVal < 0) currVal = 0;
    		  if (currVal > 255) currVal = 255;
    		  convolutedPixels[row][col].setColor(new Color(currVal, currVal, currVal));
    	  }
      }
      
	  return convolutedPicture;
  }
  
  public Picture maxPool() {
	  Pixel[][] pixels = this.getPixels2D();
      int rows = this.getHeight();
      int cols = this.getWidth();
      
      Picture poolPic = new Picture((rows + 1) / 2, (cols + 1) / 2); 
      Pixel[][] poolPicPixels = poolPic.getPixels2D();
      
      for (int row = 0; row < rows; row += 2) {
    	  for (int col = 0; col < cols; col += 2) {
    		  int currMax = (int)pixels[row][col].getAverage();
    		  if (row + 1 < rows) {
    			  currMax = Math.max(currMax, (int)pixels[row + 1][col].getAverage());
    		  }
    		  if (col + 1 < cols) {
    			  currMax = Math.max(currMax, (int)pixels[row][col + 1].getAverage());
    		  }
    		  if (row + 1 < rows && col + 1 < cols) {
    			  currMax = Math.max(currMax, (int)pixels[row + 1][col + 1].getAverage());
    		  }
    		  
    		  poolPicPixels[row / 2][col / 2].setColor(new Color(currMax, currMax, currMax));
    	  }
      }
      
      return poolPic;
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
//    Picture img = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg");
//    //C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/apple_icon.jpg
//    //C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/msg.jpg
//    Picture encodePic = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/msg.jpg");
//    img.explore();
//    encodePic.explore();
//    img.encode(encodePic);
//    img.explore();
//    Picture decodePic = img.decode();
//    decodePic.explore();
	  
	  Picture img = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/scipy-misc-ascent-2.jpg");
	  img.explore();
	  Picture convul = img.convolution();
	  convul.explore();
	  Picture pool = convul.maxPool();
	  pool.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
