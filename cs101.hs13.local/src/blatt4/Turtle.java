package blatt4;

import ch.unibas.informatik.cs101.ImageWindow;

public class Turtle {

	static ImageWindow w1;
	static boolean posPencil;
	static int moveX;
	static int moveY;
	static int posX;
	static int posY;
	
	public Turtle(ImageWindow a){ //Constructor
		w1=a;
		posX=w1.getImageWidth()/2;
		posY=w1.getImageHeight()/2;
		moveX=1;
		moveY=0;
		posPencil=false;
	}

	public void print(){ //prints out current values for the variables
	    System.out.println("posX:"+Turtle.posX+" posY:"+Turtle.posY+" moveX:"+Turtle.moveX+" moveY:"+Turtle.moveY+" Pencil:"+Turtle.posPencil);
	}
	
	public void move(int... move){ //moves the turtle
		int red, green, blue;
		if(move.length>1){ //use possible arguments as rgb-values for coloring
			red=move[1]; green=move[2]; blue=move[3];
		}else{
			red=0;green=0;blue=0;
		}
		if(posPencil==true){w1.setPixel(posX, posY, red, green, blue);}
		for(int i=0;i<move[0];i++){
			posX+=moveX;
			posY+=moveY;
			if(posPencil==true){
				w1.setPixel(posX,posY, red, green, blue);
				w1.redraw();
				w1.pause(10);
			}
		}
	}
	
	public void pencil(){ //switches the pencil between "in the air" and "on the paper"
		posPencil = !posPencil;
	}
		
	public void turn90(int turn90){ //turns the turtle by a multiple of 90°; negative turns counterclockwise, positive turns clockwise
		int anzahl = Math.abs(turn90); //how many rotations
		
		for(int z=1;z<=anzahl;z++){
			int moveXold=moveX;
			int moveYold=moveY;			
			
			if(turn90<0){ //turns turtle left
				if(moveXold!=0){moveX=0;}else{moveX=moveYold;}
				if(moveYold!=0){moveY=0;}else{moveY=moveXold*-1;}
			}else{ //turns turtle right
				if(moveXold!=0){moveX=0;}else{moveX=moveYold*-1;}
				if(moveYold!=0){moveY=0;}else{moveY=moveXold;}
			}
			
		}
	}


}
