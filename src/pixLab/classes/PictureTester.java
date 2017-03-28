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
  
  public static void testStripeRGB()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.stripeRGB();
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
  
  public static void testRandomSectional()
  {
	  Picture yoda = new Picture("oldYoda.jpg");
	  yoda.explore();
	  yoda.sectionalRandom();
	  yoda.explore();
  }
  
  public static void testCopy2()
  {
	  Picture starWars = new Picture("starWarsLogo.jpg");
	  Picture allMovies = new Picture("allStarWarsMovies.jpg");
	  starWars.explore();
	  starWars.copy2(allMovies, 20, 155, 20, 250 );
	  starWars.explore();
  }
  
  public static void testStarWarsCollage()
  {
	  Picture starWars = new Picture("starWarsLogo.jpg");
	  starWars.explore();
	  starWars.createStarWarsCollage();
	  starWars.explore();
  }
  
  public static void explorePic()
  {
	  Picture yoda = new Picture("yoda.jpg");
	  Picture darthVader = new Picture("darthVader.jpg");
	  Picture forceAwakens = new Picture("forceAwakens.jpg");
	  Picture starWars = new Picture("starWarsLogo.jpg");
	  Picture greenScreen = new Picture("newSpidermanGreenScreen.jpg");
//	  yoda.explore();
//	  darthVader.explore();
//	  forceAwakens.explore();
	  greenScreen.explore();
  }
  
  public static void testGlitchArt()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.glitchArt();
	  beach.explore();
  }
  
  public static void testChromakey()
  {
	  Picture moon = new Picture("moon-surface.jpg");
	  Picture spiderman = new Picture("newSpidermanGreenScreen.jpg");
	  moon.explore();
	  spiderman.explore();
	  spiderman.chromakeyGreenScreen(moon);
	  spiderman.explore();
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture("base image.png");
	  source.explore();
	  Picture hidden = new Picture("hiddenImage.png");
	  source.steganographyEncode(hidden);
	  source.explore();
	  hidden.explore();
	  source.steganographyDecode();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//explorePic();
	  //testCopy2();
//    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
	  //testStripeRGB();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testMirrorVertical();
	 // testFullRandom();
	  //testFullRandomRed();
//    testMirrorVerticalRightToLeft();
//	  testMirrorHorizontalBottomToTop();
//	  testMirrorHorizontalTopToBottom();
//    testMirrorTemple();
    //testMirrorSnowmanArms();
    //testMirrorSeagull();
    //testMirrorDiagonal();
    //testMirrorDiagonalBottomRightToTopLeft();
    //testCollage();
    //testStarWarsCollage();
    //testRandomSectional();
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
	  //testGlitchArt();
	  //testChromakey();
	  testSteganography();
  }
}