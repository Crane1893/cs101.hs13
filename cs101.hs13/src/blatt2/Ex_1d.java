package blatt2;

public class Ex_1d {

	public static void main(String[] args) {
		
		
		int summe=0;
		
		/*
		
		//fehler: 
		 
		int max_zahl=0;
		int zahl = 0;
		
		while(max_zahl <= 100){
			
			while(zahl <= max_zahl){
				summe += zahl++;
			}
			
			
			System.out.println("Die Summe von 1 bis "+ max_zahl +" ist: "+ summe);
			++max_zahl;
			
			}
		
			*/
			 int max_zahl = 100;
		
			 for(int i=0 ; i<= max_zahl; i++) {
				 summe+=i;
				 System.out.println("Die Summe von 1 bis "+ i +" ist: "+ summe);
			 }
			 
		
			
		}
}