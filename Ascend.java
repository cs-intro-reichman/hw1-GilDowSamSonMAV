

public class Ascend {
	public static void main(String[] args) {
		int Number = Integer.parseInt(args[0]) ;
		int n = (int) (Math.random()*Number) ;
		int t = (int) (Math.random()*Number) ;
		int s = (int) (Math.random()*Number) ;
		int x = (Math.min(n ,Math.min(s, t))) ;
		int z = (Math.max(s ,Math.max(t, n))) ;
		int v = (( n + t + s) - z - x) ;

		System.out.println( x + " " + v + " " + z ) ;
		System.out.println( z + " " + v + " " + x ) ;

		


	}
}
