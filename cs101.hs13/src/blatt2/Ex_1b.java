package blatt2;

public class Ex_1b {

	public static void main(String[] args) {
		
		int dividend = 20;
		int divisor = 2;
		
		int ergebnis = 0;
		int rest = dividend;
		
		if(divisor < rest){
			do{
				ergebnis++;
				rest-=divisor;
			}while (divisor < rest);
			}
		
	System.out.println(dividend + " geteilt durch " + divisor + " gibt " + ergebnis + " Rest " + rest);
	}
}
