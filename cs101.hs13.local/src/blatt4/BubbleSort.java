package blatt4;
import ch.unibas.informatik.cs101.ImageWindow;

class BubbleSort {
	
	static ImageWindow w = new ImageWindow(500,500);	//neues fenster
	static int vkonst = 10;								//geschwindigkeitskonstante
	static int hkonst = 2;								//streckungsfaktor
	
	public static void draw(char[] characters){
		int bbreite = w.getImageWidth()/characters.length;	//bbreite = balkenbreite
		int arrmax = characters.length;						//arrmax = l�nge array
		
		w.clearImage();										//fenster clear
		
		for(int i=0 ; i<arrmax ; i++){					//array durchgehen
			
				int bhoehe = characters[i]*hkonst;		//balkenh�he setzen
				for(int h=0 ; h<= bhoehe ; h++){		//balkenh�he durchgehen von unten her
					
					for(int u=0 ; u<bbreite ; u++)		//ganze balkenbreite zeichnen f�r jedes h
						w.setPixel((i*bbreite+u), 500-h, bhoehe, 100, 200);
						w.redraw();
						
				}
			
			
		}
		
		
		
		
		
		
	}
	
	public static void sort(char[] characters) {
	    
		boolean changed = false;
		
		do{
			  changed = false;
			  
			  for(int x=1; x < characters.length ; x++){
				 
				  if(characters[x-1] > characters[x]){
					  char temp = characters[x-1];
					  characters[x-1] = characters[x];
					  characters[x] = temp;
					  
					  changed = true;
					  
					  draw(characters);			//zeichnen ausl�sen
					  w.pause(vkonst);			//draw delay
				  }
				  
			  }	  
			  
			  
		  } while(changed==true);

		  
	  }

	public static void displayArray(char[] characters) {
		  System.out.println(characters);
		  
		  /*
		  for(int j=0; j <= characters.length; j++){
		  System.out.println(characters[j]);
		  }
		   */
	  }

	public static void main(String[] args) {
	    if (args.length != 1) {
	      System.out.println("Bitte rufen Sie das Programm mit einem Eingabewert auf");
	      System.out.println("  java BubbleSort 'dies ist ein text'");
	      System.exit(-1);
	    }
	    
	    char[] characters = args[0].toCharArray();
	    w.openWindow();
	    sort(characters);
	    displayArray(characters);
	  }

}
