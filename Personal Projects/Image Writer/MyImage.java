/**
 * @MyImage.java
 *
 * @author Sean Gray
 *
 * @version 1.00 2020/2/20
 */

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MyImage {

    public static void main(String[] args) throws IOException {
    	//int[][][] pixels = new int[1080][1920][4];
    	BufferedImage image = null;
    	File f = null;
    	int a = 255;
    	int r = 0;
    	int g = 0;
    	int b = 0;
    	int pixel;
    	
		int w = 1920;
		int h = 1080;
    	image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		
		for (int i = 0; i < h; i++)
		{
			for (int j = 0; j < w; j++)
			{
				pixel = a | (r<<i) | (g<<i<<j) | (b<<j);
				image.setRGB(j, i, pixel);
				g++;
				r += 4;
				b += 2;
			}
			r -= 200;
			g -= 50;
			b -= 100;
		}
		
		try{
    	  	f = new File("C:\\Users\\gray_902073\\Desktop\\Output.jpg");
  	 		ImageIO.write(image, "jpg", f);
     		System.out.println("Writing complete.");
    	} catch(IOException e){
    		System.out.println("Error: "+e);
 		}
    }
    
    
}