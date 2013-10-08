package blatt2;

import ch.unibas.informatik.cs101.ImageWindow;

public class Ex_4_flugsimulator {

  public static void main(String args[]) {
    //creates a new instance of the ImageWindow Class
    //with a viewable image area of 500x500 pixels
    ImageWindow w = new ImageWindow(500,500);

    //opens the corresponding window (makes it visible)
    w.openWindow();

    //colors the pixel at position 255,100 in the image
    //with the rgb color 254 (red), 0 (green), 0 (blue)
    w.setPixel(255, 100, 254, 0, 0);

    
    int h = 456;
    int flug_gesch = 20;
    int sink_geschw = 51;
    
    for(int t = 0 ; h >= 0 ; t += flug_gesch){
    	w.setPixel(t, 500-h, 0, 0, 0);
    	System.out.println("v: " + sink_geschw + " h: " + h);
    	
    	
    	h -= sink_geschw;
    	sink_geschw -=3;
    	
    	
    	
    	
    
    }
    

    
    
    //redraws the image on the screen so all changes
    //become visible
    //Hallo Emi
    w.redraw();
  }
}
