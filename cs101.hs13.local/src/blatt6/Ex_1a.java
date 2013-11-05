package blatt6;

public class Ex_1a {
public static void main(String[] args){
	double a=Double.parseDouble(args[0]); double b=Double.parseDouble(args[1]);
	System.out.println(args[0]+"^"+args[1]+"="+Math.pow(a,b));
	System.out.println("sin("+a+")="+Math.sin(a));
}

public static int fakult(int arg){
	int prod=1;
	for(int i=2;i<=arg;i++){
		prod*=i;
	}
	return prod;
}
}
