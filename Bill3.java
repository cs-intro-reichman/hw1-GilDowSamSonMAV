
public class  Bill3{
	public static void main(String[] args) {

	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
	    String MoneyString = args[3];
		int moneyInt = Integer.parseInt(MoneyString) ;
		double MoneyValue = (double) moneyInt;  
		System.out.println("Dear " + name3 + ", " + name2 + ", and" + name1 + 
		
		": pay" + Math.ceil(MoneyValue/3)+ " Shekels Each"); 
		


	}
}
