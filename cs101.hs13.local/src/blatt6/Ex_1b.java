package blatt6;

public class Ex_1b {
public static void main(String[] args){
	System.out.println("String 1=\""+args[0]+"\"; String 2=\""+args[1]+"\"; String 3=\""+args[2]+"\"");
	System.out.println("Position: "+args[0].indexOf(args[1]));
	args[0]=args[0].trim();
	System.out.println(args[0]);
	args[0]=args[0].replaceAll(args[1], args[2]);
	System.out.println(args[0]);
}
}
