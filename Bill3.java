
public class  Bill3{
	public static void main(String[] args) {

	    String a = args[0];
		String b = args[1];
		String c = args[2];
	    String MoneyString = args[3];
		int moneyInt = Integer.parseInt(MoneyString) ;
		double MoneyValue = (double) moneyInt;  
		System.out.println("Dear " + c + ", " + b + ", and " + a + 
		
		": pay " + Math.ceil(MoneyValue/3)+ " Shekels Each."); 
		


	}
}
