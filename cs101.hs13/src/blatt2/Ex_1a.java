package blatt2;

public class Ex_1a 
{

	public static void main(String[] args){
	
	double zahl = 1003998838.58398475;
	
	/*
	//fehler: bei stellen>6
	
	for (int stellen=0; stellen< Math.pow(2, 64);  ++stellen){
		if (zahl*zahl < 1) {
			System.out.println("Die Zahl hat " + stellen + " Stellen");
			break;
		}
		
		zahl /= 10;
		}
		
		*/
	
	int stellen = 0;
	
	do{
		++stellen;
		zahl /= 10;
		
	}while(stellen <= Math.pow(2, 64));
	
	System.out.println("Die Zahl hat " + stellen + " Stellen");
	
	
	}
}
