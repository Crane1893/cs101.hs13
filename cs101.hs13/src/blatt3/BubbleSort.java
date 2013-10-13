package blatt3;

class BubbleSort {
	 
		/**
		 * Sortiert das Eingabearray und aendert das Array in place
		 **/
	  public static void sort(char[] characters) {
	    /* Diese Methode muss implementiert werden */
		  
		  for(int i=0; i < characters.length; i++){
			  
			  for(int x=1; x < characters.length - i; x++){
				 
				  if(characters[x-1] > characters[x]){
					  char temp = characters[x-1];
					  characters[x-1] = characters[x];
					  characters[x] = temp;
			 
				  }
			  }	  
		  }
		  
		  
	  }

	  
	  
	  	/**
	  	 * Schreibt das Array auf die Ausgabekonsole
	  	 **/
	  public static void displayArray(char[] characters) {
	    /* Diese Methode muss implementiert werden */
		  
		  System.out.println(characters);
		  
		  /*
		  for(int j=0; j <= characters.length; j++){
		  System.out.println(characters[j]);
		  }
		   */
	  }

	  
	  
	  	/**
	  	 * Die Hauptfunktion liest das Character Array und ruft die Sortierfunktion
	  	 * und die Ausgabefunktion auf
	  	 **/
	  public static void main(String[] args) {
	    if (args.length != 1) {
	      System.out.println("Bitte rufen Sie das Programm mit einem Eingabewert auf");
	      System.out.println("  java BubbleSort 'dies ist ein text'");
	      System.exit(-1);
	    }
	    
	    char[] characters = args[0].toCharArray();
	    
	    sort(characters);

	    displayArray(characters);
	  }
	

}
