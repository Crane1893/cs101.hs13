package blatt4;

import ch.unibas.informatik.cs101.ImageWindow;
import blatt4.Turtle;

public class BasicTurtle {

  public static void main(String args[]) {

    ImageWindow w = new ImageWindow(500,500);
    w.openWindow();
    
    Turtle a = new Turtle(w);
    a.move(150);
    a.pencil();
    a.move(50,0,255,0);
    a.turn90(1);
    a.move(40,255,0,0);
    a.turn90(-1);
    a.move(30,0,0,255);
    a.turn90(1);
    a.move(50);
    
    Turtle b = new Turtle(w);
    b.pencil();
    int array[]={0,80,160,255};
    int schritt=40;
    for(int i : array){
    	b.move(schritt,255-i,0,i);
    	b.turn90(1);
    	b.move(schritt,255-i,0,i);
    	b.turn90(-1);
    	b.move(schritt,255-i,0,i);
    	b.turn90(1);
    	b.move(schritt,255-i,0,i);
    	b.turn90(1);
    	b.move(schritt,255-i,0,i);
    	b.turn90(-1);
    	b.move(schritt,255-i,0,i);
    	b.turn90(1);
    	b.move(schritt,255-i,0,i);
    	b.turn90(-1);
    }
  }
}
