package blatt3;

public class Ex_2a {
public static void main(String args[]){
	int dez = Integer.parseInt(args[0]);
	int rest=dez%16;
	int quotient=dez/16;
	String zeichen[]={"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
	String hex=zeichen[rest-1];
	
	while (quotient != 0){
		//System.out.println(hex);
		rest=quotient%16;
		quotient=quotient/16;
		hex=zeichen[rest-1]+hex;
	}
	System.out.println("0x"+hex);
}
}
