package blatt3;
import ch.unibas.informatik.cs101.ImageWindow;
import java.util.Random;

public class ImageArrays {

	public static void main(String[] args) {
			//create & open the first window (to display the source image)
		ImageWindow sourceWindow= new ImageWindow(500,500);
		sourceWindow.openWindow("source",0,0);
			//load the image 
		sourceWindow.loadImage("blatt3/horn.jpg");	
			//redraw to see the image
		sourceWindow.redraw();
			/*  TODO: create an array that is large enough to hold
                      the complete image information
            */
		
		int[] a;
		a = new int[(500*500)*3];

		
			/*  TODO: store the complete image information in the
                 *        array you have created.
                 *  HINT: int red=sourceWindow.getPixelRed(xPosition, yPosition);
                 *        int green=sourceWindow.getPixelGreen(xPosition, yPosition);
                 *        int blue=sourceWindow.getPixelBlue(xPosition, yPosition);
            */

		int xPosition = 1;
		int yPosition = 1;
		int zaehler = 0;
		
		do{
			int red = sourceWindow.getPixelRed(xPosition, yPosition);
            int green = sourceWindow.getPixelGreen(xPosition, yPosition);
            int blue = sourceWindow.getPixelBlue(xPosition, yPosition);
			
            a[zaehler] = red;
            a[zaehler+1] = green;
            a[zaehler+2] = blue;
         
            zaehler += 3;
            
            if(xPosition <= 500)
				xPosition++;
				else{yPosition++; xPosition = 1;}
		
		}while(zaehler<= (500*500*3)-1);
		
		
			//create & open the second window (to draw your copy into)
		ImageWindow destinationWindow= new ImageWindow(500,500);
		destinationWindow.openWindow("Image rotated by 90 degree",550,0);
		
			/*  TODO: write back your array data into the destinationWindow so that
                 *        it appears to be rotated 90 degrees.
                 *  HINT: destinationWindow.setPixel(xPos,yPos,red,green,blue);
            */
		
		int xd = 1;
		int yd = 1;
		
		for(int z=0 ; z <= ((500*500*3)-1) ; z+= 3){
			destinationWindow.setPixel(500-yd, 500-xd, a[z], a[z+1],a[z+2]);
			//x und y vertauschen, von 500 abziehen und voila, 90 grad im UZS gedreht
			
			if(xd <= 500)
				xd++;
				else{ yd++; xd=1;}
			
			
		}

                // redraw to see the changed image
                destinationWindow.redraw();
                
                // Create another output window
		ImageWindow destinationWindow2= new ImageWindow(500,500);
		destinationWindow2.openWindow("Image with permuted color channels",0,550);
                /*  TODO: call here your function which permutes the color channels
                 */
		
		rotate(a);

		
                // redraw to see the changed image
		destinationWindow2.redraw();
	}


    public static void rotate(int[] a){
    	
    	
    	
    	
    	
    	/*  TODO: implement here the function to rotate the color channels.
         *  HINT: think about the arguments you need for the function.
         */




    }
}
