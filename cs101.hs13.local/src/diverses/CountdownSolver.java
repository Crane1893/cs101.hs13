package diverses;

class Operation{
	int n1; //first number
	int n2; //second number
	int res; //result
	char op; //operator ("+" "-" "/" "*")
	
	/* Operator: automatically calculates the result */
	Operation(int a, int b, char x){
		this.n1=a;
		this.n2=b;
		this.op=x;
		switch (x){
			case '+': this.res=a+b;
			case '-': this.res=a-b;
			case '/': this.res=a/b;
			case '*': this.res=a*b;
		}
	}
	
	int first() {return this.n1;}
	
	int second() {return this.n2;}
	
	int result() {return this.res;}
	
	char operator() {return this.op;}
}

public class CountdownSolver {
	/* receives multiple numbers and a wanted total in this order: total number1 number2 number3... */
	public void main(String[] args){
		final int total=Integer.parseInt(args[0]);
		int[] numbers = intArray(args);
		collection(args);
	}
	/* calculates max! : 1*2*3*...*max */
	public int faculty(int max){
		int res=1;
		for(int i=2;i<=max;i++){
			res*=i;
		}
		return res;
	}
	
	/* Combines the inserted values in a printed String */
	void collection(String[] str){
		System.out.print("The numbers are:");
		for(int i=1;i<str.length;i++){System.out.print(" "+str[i]);}
		System.out.println(" and the total is: "+str[0]);
	}
	
	/* Collects just the numbers in an int-Array */
	public int[] intArray(String[] args){
		int[] arr = new int[args.length-1];
		for(int i=1;i<args.length;i++){
			arr[i]=Integer.parseInt(args[i]);
		}
		return arr;
	}
}
