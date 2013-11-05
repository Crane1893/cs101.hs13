package blatt5;
public class Ex_3a {

	public static void main(String[] args){
		int t=0; int x=0;
		for(;;){
			if(x>42) break;
			t+=x++;
			//System.out.println("t: "+t+" x: "+x);
		}System.out.println("t: "+t+" x: "+x);
		 t=0;  x=0;

		while(x<=42){
			t+=x++;
			//System.out.println(t+" "+x);
		}System.out.println("t: "+t+" x: "+x);
		 t=0;  x=0;

		do{
			t+=x++;
			//System.out.println(t+" "+x);
		}while(x<=42);System.out.println("t: "+t+" x: "+x);
	}
}
