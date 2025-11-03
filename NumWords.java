
public class NumWords {
	public static void main(String args[]) {
	    int Number = Integer.parseInt(args[0]) ;
		int Number2 = (Number/100) ;
		int Number3 = (Number/10)%10 ;
		int Number4 = (Number%10) ; 
		System.out.print(Number2 + " hundreds, " + Number3 + " tens, and " + Number4 + " ones.") ;

		


	}
}
