package pixLab.classes;
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
  public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(255 - pixelObj.getRed());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
			  pixelObj.setBlue(255 - pixelObj.getBlue());
		  }
	  }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue() ) / 3);
			  pixelObj.setGreen((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue() ) / 3);
			  pixelObj.setBlue((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue() ) / 3);
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
  
  public void mirrorVerticalRightToLeft()
  {
	  Pixel [][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  
	  int width = pixels[0].length;
	  
	  for (int row = pixels.length - 1; row >= 0; row--)
	  {
		  for (int col = (width / 2) -1; col >= 0; col-- )
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][width - col - 1];
			  leftPixel.setColor(rightPixel.getColor());
		  }
	  }
  }
  
  public void mirrorHorizontalBottomToTop()
  {
	  Pixel [][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  
	  //loop over columns
	  //inside the columns loop over half the rows
	  //Change the top pixel to the bottoms color
	  int height = pixels.length;
	  
	  for (int col = 0; col < pixels[0].length; col++)
	  {
		  for (int row = (height /2) - 1; row >= 0; row--)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[height - row - 1][col];
			  topPixel.setColor(bottomPixel.getColor());
		  }
	  }
  }
  
  public void mirrorHorizontalTopToBottom()
  {
	  Pixel [][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  
	  //loop over columns
	  //inside the columns loop over half the rows
	  //Change the top pixel to the bottoms color
	  int height = pixels.length;
	  
	  for (int col = 0; col < pixels[0].length; col++)
	  {
		  for (int row = (height /2) - 1; row >= 0; row--)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[height - row - 1][col];
			  bottomPixel.setColor(topPixel.getColor());
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
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorSeagull()
  {
	  int mirrorPoint = 350;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int count = 0;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 224; row < 330; row ++)
	  {
		  for(int col = 230; col < mirrorPoint; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
			 
  }
  
  public void mirrowSnowmanArms()
  {
	  int mirrorPoint = 195;
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int count = 0;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 165; row < mirrorPoint; row++)
	  {
		  for (int col = 100; col < 295; col ++)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
			  bottomPixel.setColor(topPixel.getColor());
			  
		  }
	  }
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
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length &&toRow < toPixels.length; fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length &&toCol < toPixels[0].length;  fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel [][] toPixels = this.getPixels2D();
	  Pixel [][] fromPixels = fromPic.getPixels2D();
	  int copyWidth = Math.min(endCol, fromPixels[0].length -2);
	  int copyHeight = Math.min(endRow, fromPixels.length -1);
	  
	  for (int fromRow = 0, toRow = startRow; fromRow < endRow && toRow < copyHeight; fromRow++, toRow++)
	  {
		  for(int fromCol = 0, toCol = startCol; fromCol < endCol && toCol < copyWidth; fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
			
		  }
	  
	  }
  }
  
  public void scale()
  {
	  Picture p = new Picture("elephant.jpg");
	  Picture smallP = p.scale(0.25,0.25);
	  smallP.write("smallElephant.jpg");
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void createStarWarsCollage()
  {
	  Picture yoda = new Picture("yoda.jpg");
	  Picture darthVader = new Picture("darthVader.jpg");
	  Picture forceAwakens = new Picture("forceAwakens.jpg");
      this.copy(yoda,10,10);
      this.copy(darthVader,10,990);
      this.copy(forceAwakens,645,450);
      this.write("starWarsCollage.jpg");
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
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    
  }
  
  public void edgeDetection2(int edgeDist)
  {
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel bottomPixel = null;
	  Pixel diagonalPixel = null;
	  Pixel [][] pixels = this.getPixels2D();
	  Color rightColor = null;
	  Color bottomColor = null;
	  Color diagonalColor = null;
	  for (int row=0; row < pixels.length - 1; row ++)
	  {
		  for (int col = 0; col < pixels[0].length -1; col ++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][col + 1];
			  bottomPixel = pixels[row + 1][col];
			  diagonalPixel = pixels [row + 1][col + 1];
			  rightColor = rightPixel.getColor();
			  bottomColor = bottomPixel.getColor();
			  diagonalColor = diagonalPixel.getColor();
			  if(leftPixel.colorDistance(rightColor) > edgeDist && leftPixel.colorDistance(bottomColor) > edgeDist && leftPixel.colorDistance(diagonalColor)
					  > edgeDist)
			  {
				  leftPixel.setColor(Color.BLACK);  
			  }
			  else
				  leftPixel.setColor(Color.WHITE);
		  }
	  }
  }
  
  public void mirrorDiagonal()
  {
	  Pixel topRight = null;
	  Pixel bottomLeft = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 0; row < pixels.length - 1; row ++)
	  {
		  for (int col = 0; col < pixels[0].length - 1; col ++)
		  {
			  if (row != col && row < pixels[0].length && col < pixels.length)
			  {
				  //inits for location must be after you know the index is not out of bounds
				  //these inits must be here after the if statement.
				  topRight = pixels[row][col];
				  bottomLeft = pixels[col][row];
				  
				  bottomLeft.setColor(topRight.getColor());
			  }
				  
		  }
	  }
	  
  }
  
  public void mirrorDiagonalBottomRightToTopLeft()
  {
	  Pixel topLeft = null;
	  Pixel bottomRight = null;
	  Pixel[][] pixels = this.getPixels2D();
	  int mirrorPoint = Math.min(pixels.length, pixels[0].length)-1;
	  
	  for (int row = 0; row < pixels.length - 1; row ++)
	  {
		  for (int col = 0; col < pixels[0].length - 1; col ++)
		  {
			  if(row + col != mirrorPoint && row < pixels[0].length && col < pixels.length)
			  {
				  topLeft = pixels[row][col];
				  bottomRight = pixels[mirrorPoint - col][mirrorPoint - row];
				  
				  topLeft.setColor(bottomRight.getColor());
			  }
				  
		  }
	  }
	  
  }

  public void fullRandom()
  {
	  Pixel [][] currentPicture = this.getPixels2D();
	  for (Pixel [] row : currentPicture)
	  {
		  for(Pixel currentPixel : row)
		  {
			  int red = (int) (Math.random() * 256);
			  int green = (int) (Math.random() * 256);
			  int blue = (int) (Math.random() * 256);
			  
			  currentPixel.setColor(new Color(red, green, blue));
			  
		  }
	  }
  }
  
  public void fullRandomRed()
  {
	  Pixel [][] currentPicture = this.getPixels2D();
	  for (Pixel [] row : currentPicture)
	  {
		  for(Pixel currentPixel : row)
		  {
			  int red = (int) (Math.random() * 256);
			  
			  currentPixel.setColor(new Color(red, currentPixel.getGreen(), currentPixel.getBlue() ));
			  
		  }
	  }
  }

  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
//    Picture beach = new Picture("beach.jpg");
//    beach.explore();
//    beach.zeroBlue();
//    beach.explore();
	  
	  Picture starWarsPic = new Picture("hanAndChewy.jpg");
	  starWarsPic.negate();
	  starWarsPic.fullRandomRed();
	  starWarsPic.mirrorHorizontalTopToBottom();
	  starWarsPic.keepOnlyBlue();
	  starWarsPic.mirrorDiagonal();
	  starWarsPic.explore();
	  starWarsPic.write("photProjectReadingFilters.jpg");
	  
  }
  
} // this } is the end of class Picture, put all new methods before this
