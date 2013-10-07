package blatt2;

public class Ex_1c {

	public static void main(String[] arg){
		
		double zahl = 3;
		
		/*
		 
		//fehler: abbruchkriterium - !=1
		 
		int zaehler = 0;
		while (zahl <20 || zaehler == 0){
			zahl+=5; ++zaehler;
		}
		*/
		
		 
		do{
			zahl+=5;
			
			}while (zahl<20);

		 
		
		System.out.println("Der erreichte Wert ist: " + zahl);
	}
}

