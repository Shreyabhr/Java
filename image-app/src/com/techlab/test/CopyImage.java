package com.techlab.test;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
  
public class CopyImage{
    public static void main(String args[])throws IOException{
    	try
        {
        	File f = new File("tree.jpg");
            BufferedImage img = ImageIO.read(f);
            int width = img.getWidth();
            int height = img.getHeight();
            for (int i=0; i < width; i++) {
            	for(int j=height/2; j< height; j++) {
            		int p = img.getRGB(0,0);
            		int a = (p>>24) & 0xff;
            		int r = (p>>16) & 0xff;
            		int g = (p>>8) & 0xff;
            		int b = p & 0xff;
                    p = (a<<24) | (r<<16) | (g<<8) | b;
                    img.setRGB(i, j, p);
            	}
            }
            try{
                File f1 = new File("newtree.jpg");
                ImageIO.write(img, "jpg", f1);
            }
            catch(IOException e){
                System.out.println(e);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}