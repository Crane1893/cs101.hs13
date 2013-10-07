package blatt2;

import ch.unibas.informatik.cs101.ImageWindow;

public class Ex_4 {

  public static void main(String args[]) {
    //creates a new instance of the ImageWindow Class
    //with a viewable image area of 500x500 pixels
    ImageWindow w = new ImageWindow(500,500);

    //opens the corresponding window (makes it visible)
    w.openWindow();

    //colors the pixel at position 255,100 in the image
    //with the rgb color 254 (red), 0 (green), 0 (blue)
    
    int h = 456;
    int vx = 20;
    int vy = 51;
    
    for(int t=0;t<=500;t+=vx){
    	w.setPixel(t, 500-h, 0, 0, 0);
    	System.out.println("t: "+t+" h: "+h+" vy: "+vy);
    	if(h<=0){break;}

    	h=h-vy;
    	vy=vy-3;
    }

    // Add your code here

    //redraws the image on the screen so all changes
    //become visible
    w.redraw();
  }
}
