
public class  Bill3{
	public static void main(String[] args) {

	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
	    String MoneyString = args[3];
		int moneyInt = Integer.parseInt(MoneyString);
		double MoneyValue = Math.ceil(moneyInt)/3; 
		System.out.println( name1 +" " + name2 + " and " + name3 + " needs to pay " + MoneyValue + " Shekels Each"); 
		


	}
}
