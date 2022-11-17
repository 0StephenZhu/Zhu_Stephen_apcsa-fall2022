/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture();
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyRed() {
		Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg");
		image.explore();
		image.keepOnlyRed();
		image.explore();
  }
  
  public static void testKeepOnlyGreen() {
		Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg");
		image.explore();
		image.keepOnlyGreen();
		image.explore();
  }
  
  public static void testKeepOnlyBlue() {
		Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg");
		image.explore();
		image.keepOnlyBlue();
		image.explore();
  }
  
  public static void testNegate() {
		Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg");
		image.explore();
		image.negate();
		image.explore();
  }
  
  public static void testGrayscale() {
		Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg");
		image.explore();
		image.grayscale();
		image.explore();
  }
  
  public static void testFixUnderwater() {
		Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/water.jpg");
		image.explore();
		image.fixUnderwater();
		image.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
		Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg");
		image.explore();
		image.mirrorVerticalRightToLeft();
		image.explore();
  }
  
  
  public static void testMirrorHorizontal() {
		Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/redMotorcycle.jpg");
		image.explore();
		image.mirrorHorizontal();
		image.explore();
  }
  
  public static void testMirrorHorizontalBotToTop() {
	  Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/redMotorcycle.jpg");
	  image.explore();
	  image.mirrorHorizontalBotToTop();
	  image.explore();
  }

  public static void testMirrorDiagonal() {
	  Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg");
	  image.explore();
	  image.mirrorDiagonal();
	  image.explore();
  }
  
  public static void testMirrorArms() {
	  Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/snowman.jpg");
	  image.explore();
	  image.mirrorArms();
	  image.explore();
  }
  
  public static void testMirrorGull() {
	  Picture image = new Picture("C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/seagull.jpg");
	  image.explore();
	  image.mirrorGull();
	  image.explore();
  }
  
  public static void testCollage2() {
	    Picture canvas = new Picture();
	    canvas.createCollage2();
	    canvas.explore();
  }
  
  public static void testMyCollage() {
	  Picture image = new Picture();
	  image.myCollage();
	  image.explore();
  }
  
//  static String testImage = "C:/Users/zhus1953/Desktop/APCSA-StephenZ/Zhu_Stephen_apcsa-fall2022/Unit-16/src/images/beach.jpg";
//Picture image = new Picture("");
//image.explore();
//image.
//image.explore();

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//	  testMirrorVerticalRightToLeft();
//	  testMirrorHorizontal();
//	  testMirrorHorizontalBotToTop();
//	  testMirrorDiagonal();
//    testMirrorTemple();
//    testMirrorArms();
//    testMirrorGull();
//    testMirrorDiagonal();
//    testCollage();
//    testCollage2();
//	  testMyCollage();
//    testEdgeDetection();
    //testEdgeDetection2(); No edge detection 2 because we don't need to make our own
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}