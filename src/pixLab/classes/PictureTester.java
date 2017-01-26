package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Matt Powley 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("allStarWarsMovies.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("yoda.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture koala = new Picture("darthVader.jpg");
	  koala.explore();
	  koala.mirrorVerticalRightToLeft();
	  koala.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorHorizontalBottomToTop();
	  snowman.explore();
  }
  
  public static void testMirrorHorizontalTopToBottom()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorHorizontalTopToBottom();
	  snowman.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorSeagull()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  seagull.mirrorSeagull();
	  seagull.explore();
  }
  
  public static void testMirrorSnowmanArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrowSnowmanArms();
	  snowman.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(12);
    swan.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture koala = new Picture("koala.jpg");
	  Picture scooter = new Picture("blueMotorcycle.jpg");
	  koala.explore();
	  scooter.explore();
	  koala.mirrorDiagonal();
	  scooter.mirrorDiagonal();
	  koala.explore();
	  scooter.explore();
  }
  
  public static void testMirrorDiagonalBottomRightToTopLeft()
  {
	  Picture koala = new Picture("koala.jpg");
	  Picture scooter = new Picture("blueMotorcycle.jpg");
	  koala.explore();
	  scooter.explore();
	  koala.mirrorDiagonalBottomRightToTopLeft();
	  scooter.mirrorDiagonalBottomRightToTopLeft();
	  koala.explore();
	  scooter.explore();
  }
  
  public static void testFullRandom()
  {
	  Picture yoda = new Picture("oldYoda.jpg");
	  yoda.explore();
	  yoda.fullRandom();
	  yoda.explore();
  }
  
  public static void testFullRandomRed()
  {
	  Picture yoda = new Picture("oldYoda.jpg");
	  yoda.explore();
	  yoda.fullRandomRed();
	  yoda.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testMirrorVertical();
	 // testFullRandom();
	  testFullRandomRed();
//    testMirrorVerticalRightToLeft();
//	  testMirrorHorizontalBottomToTop();
//	  testMirrorHorizontalTopToBottom();
//    testMirrorTemple();
    //testMirrorSnowmanArms();
    //testMirrorSeagull();
    //testMirrorDiagonal();
    //testMirrorDiagonalBottomRightToTopLeft();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}