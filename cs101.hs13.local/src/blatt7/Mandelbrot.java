package blatt7;
import ch.unibas.informatik.cs101.ImageWindow;

/* Die Komplexen Zahlen a+b i, mit (a+bi)+(c+di) = (a+c)+(b+d)i und (a+bi)(c+di) = (ac-bd)+(ad+bc)i */
class Complex {

	/* Definieren Sie hier die Daten der Klasse */

	/* Der Konstruktor */
	public Complex(double a, double b) { 
		/* Implementieren */
	}

	/* Zugriff auf den realen Anteil */
	double real() { /* Implementieren */ }
	/* Zugriff auf den imaginaeren Anteil */
	double imag() { /* Implementieren */ }

	/* Multiplikation ohne Veraenderung der beteiligten Objekte */
	Complex mult(Complex o) {/* Implementieren */ }

	/* Multiplikation mit Veraenderung der beteiligten Objekte. Gibt this zurueck */
	Complex mult_inplace(Complex o) {/* Implementieren */ }

	/* Das Quadrat (c^2 = c*c) ohne Veraenderung der beteiligten Objekte */
	Complex sqr() { /* Implementieren */ }

	/* Das Quadrat (c^2 = c*c) in place. Veraendert das Objekt und gibt this zurueck. */
	Complex sqr_inplace() { /* Implementieren */  }

	/* Das Quadrat des Betrags */
	double abs_sqr() { /* Implementieren */ }

	/* Addition zweier komplexer Zahlen ohne Veraenderung der beteiligten Objekte */
	public Complex add(Complex c) {     /* Implementieren */   }

	/* Addition zweier komplexer Zahlen mit Veraenderung der beteiligten Objekte */
	public Complex add_inplace(Complex c) {    /* Implementieren */   }
}

public class Mandelbrot {

	public static void show_mandelbrot(Complex c_origin, double c_step, int max_iter) {
		ImageWindow sourceWindow= new ImageWindow(640,480);
		sourceWindow.openWindow("mandelbrot",0,0);
		sourceWindow.resizeImage(640,480);

		/* Implementieren des Mandelbrot Algorithmus */

		sourceWindow.redraw();	

	}

	public static void show_mandelbrot_inplace(Complex c_origin, double c_step, int max_iter) {
		ImageWindow sourceWindow= new ImageWindow(640,480);
		sourceWindow.openWindow("source",0,0);
		sourceWindow.resizeImage(640,480);

		/* Implementieren des Mandelbrot Algorithmus */

		sourceWindow.redraw();	
	}

	public static void main(String[] args) {
		show_mandelbrot(new Complex(-2.5, -1.3),   0.005, 1000);
		show_mandelbrot(new Complex(-0.755, -0.1), 0.00002, 1000);

		/*
		 * In Teilaufgabe 3
    	show_mandelbrot_inplace(new Complex(-2.5, -1.3),   0.005, 10000);
    	show_mandelbrot_inplace(new Complex(-0.755, -0.1), 0.00002, 10000);
		 */
	}


}
