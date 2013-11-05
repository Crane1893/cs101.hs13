package blatt2;

import ch.unibas.informatik.cs101.ImageWindow;

public class Ex_3e {

  public static void main(String args[]) {
    //creates a new instance of the ImageWindow Class
    //with a viewable image area of 500x500 pixels
    ImageWindow w = new ImageWindow(500,500);

    //opens the corresponding window (makes it visible)
    w.openWindow();

    //colors the pixel at position 255,100 in the image
    //with the rgb color 254 (red), 0 (green), 0 (blue)
    int radius=50;
    int xm=250;
    int ym=250;
    
    for(int x=0;x<=500;x++){
    	for(int y=0;y<=500;y++){
    		if( (x-xm)*(x-xm) + (y-ym)*(y-ym) <= radius*radius){
                w.setPixel(x, y, 0, 0, 0);
    		}
    	}
    }

    // Add your code here

    //redraws the image on the screen so all changes
    //become visible
    w.redraw();
  }
}
