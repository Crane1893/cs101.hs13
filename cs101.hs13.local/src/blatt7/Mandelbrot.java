package blatt7;

import ch.unibas.informatik.cs101.ImageWindow;

/* Die Komplexen Zahlen a+b i, mit (a+bi)+(c+di) = (a+c)+(b+d)i und (a+bi)(c+di) = (ac-bd)+(ad+bc)i */
class Complex {
	double r,i;
	/* Der Konstruktor */
	public Complex(double a, double b) { 
		this.r=a;this.i=b;
	}

	/* Zugriff auf den realen Anteil */
	double real() { return this.r; }
	
	/* Zugriff auf den imaginaeren Anteil */
	double imag() { return this.i; }

	/* Multiplikation ohne Veraenderung der beteiligten Objekte */
	Complex mult(Complex o) {
		Complex mult = new Complex(this.r*o.r-this.i*o.i , this.r*o.i+this.i*o.r);
		return mult;
	}

	/* Multiplikation mit Veraenderung der beteiligten Objekte. Gibt this zurueck */
	Complex mult_inplace(Complex o) {
		double temp_r = this.r*o.r - this.i* o.i;
		this.i = this.r*o.i + this.i*o.r;
		this.r = temp_r;
		return this;
	}

	/* Das Quadrat (c^2 = c*c) ohne Veraenderung der beteiligten Objekte */
	Complex sqr() {return this.mult(this);}

	/* Das Quadrat (c^2 = c*c) in place. Veraendert das Objekt und gibt this zurueck. */
	Complex sqr_inplace() {return this.mult_inplace(this);}

	/* Das Quadrat des Betrags */
	double abs_sqr() {return Math.pow(this.r,2) + Math.pow(this.i,2);}

	/* Addition zweier komplexer Zahlen ohne Veraenderung der beteiligten Objekte */
	public Complex add(Complex c) {
		Complex sum = new Complex(this.r+c.r,this.i+c.i);
		return sum;
	}

	/* Addition zweier komplexer Zahlen mit Veraenderung der beteiligten Objekte */
	public Complex add_inplace(Complex c) {
		this.r+=c.r;
		this.i+=c.i;
		return this;
	}
}

public class Mandelbrot {

	public static void show_mandelbrot(Complex c_origin, double c_step, int max_iter) {
		long s=System.currentTimeMillis();

		ImageWindow sourceWindow = new ImageWindow(640,480);
		sourceWindow.openWindow("mandelbrot",0,0);
		sourceWindow.resizeImage(640,480);

		for(int x=0;x<640;x++){
			for(int y=0;y<480;y++){
				
				/* Jedem Pixel wird eine komplexe Zahl zugewiesen */
				double real = c_origin.real() + c_step*x;
				double imag = c_origin.imag() + c_step*y;
				Complex c = new Complex(real,imag);
				
				Complex z = new Complex(0,0);
				int n=0;
				while(n < max_iter && z.abs_sqr()<=4){
					z = z.sqr().add(c);
					n++;
				}
				
				int r = (int) (255/Math.log(max_iter)*Math.log(n));
				int g = (int) (n/max_iter*255);
				int b = (int) (255-255/Math.log(max_iter)*Math.log(n));
				sourceWindow.setPixel(x, y, r, g, b);
				sourceWindow.redraw();

			}
		}

		//sourceWindow.redraw();
		System.out.println("Time in ms: "+(System.currentTimeMillis()-s));
	}

	public static void show_mandelbrot_inplace(Complex c_origin, double c_step, int max_iter) {
		long s=System.currentTimeMillis();
		
		ImageWindow sourceWindow= new ImageWindow(640,480);
		sourceWindow.openWindow("source",0,0);
		sourceWindow.resizeImage(640,480);

		for(int x=0;x<640;x++){
			for(int y=0;y<480;y++){
				
				/* Jedem Pixel wird eine komplexe Zahl zugewiesen */
				double real = c_origin.real() + c_step*x;
				double imag = c_origin.imag() + c_step*y;
				Complex c = new Complex(real,imag);
				
				Complex z = new Complex(0,0);
				int n=0;
				while(n < max_iter && z.abs_sqr()<=4){
					z = z.sqr_inplace().add_inplace(c);
					n++;
				}
				
				int r = (int) (255/Math.log(max_iter)*Math.log(n));
				int g = (int) (n/max_iter*255);
				int b = (int) (255-255/Math.log(max_iter)*Math.log(n));
				sourceWindow.setPixel(x, y, r, g, b);
				sourceWindow.redraw();

			}
		}
		//sourceWindow.redraw();	
		System.out.println("Time in ms: "+(System.currentTimeMillis()-s));
	}

	public static void main(String[] args) {
		show_mandelbrot(new Complex(-2.5, -1.3),   0.005, 1000);
		show_mandelbrot(new Complex(-0.755, -0.1), 0.00002, 1000);
    	show_mandelbrot_inplace(new Complex(-2.5, -1.3),   0.005, 1000);
    	show_mandelbrot_inplace(new Complex(-0.755, -0.1), 0.00002, 1000);
	}


}