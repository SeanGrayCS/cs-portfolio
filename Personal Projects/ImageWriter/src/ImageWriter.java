/**
 * @ImageWriter.java
 *
 * @author Sean Gray
 *
 * @version 1.00 2020/2/20
 */

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageWriter {

    public static void main(String[] args) throws IOException {
    	//int[][][] pixels = new int[1080][1920][4];
    	BufferedImage image = null;
    	File f = null;
		
		try {
			f = new File("Image.jpg");
			image = ImageIO.read(f);
		} catch(IOException e) {
			System.out.println("Error: "+e);
		}
		int w = image.getWidth();
		int h = image.getHeight();
		
		for (int i = 0; i < h; i++)
		{
			for (int j = 0; j < w; j++)
			{
				int p = (image.getRGB(j,i)) ^ 0xffffffff;
				image.setRGB(j, i, p);
			}
		}
		
		try{
    	  	f = new File("Output.jpg");
  	 		ImageIO.write(image, "jpg", f);
     		System.out.println("Writing complete.");
    	} catch(IOException e){
    		System.out.println("Error: "+e);
 		}
    }
    
    
}