package blatt4;

class Scope {
		static int sum;
		static int doit(int n) { sum++ /* 1 */ ; return (n-1); }
		public static void main(String[] a){
			if (a.length != 1) System.exit(-1);
			int n= Integer.parseInt(a[0]);
			sum = 0;
			for (int i=0;i<10;++i) n = doit(n) /* 2 */ ; n = doit(n) /* 3 */ ;
			doit(n);
			/* 4 */
		}
}
