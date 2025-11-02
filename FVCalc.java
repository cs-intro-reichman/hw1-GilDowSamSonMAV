
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double IntersetRate = (Double.parseDouble(args[1]));
		int NumberOfYears = Integer.parseInt(args[2]);
	     double FutureValue = (currentValue * (Math.pow((IntersetRate + 1 ), NumberOfYears/ 100))); 
		System.out.println("After " + NumberOfYears + " years $" + currentValue + " saved at " + IntersetRate + "%" + " will yield " + (int) FutureValue + "$" ) ;
 




		
	}
}