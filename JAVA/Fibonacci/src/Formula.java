
public class Formula {
	
	public static void fibFormula(int x){
		fibonacci(x);
	}
	private static int fibonacci(int num){ 
	    double phi= (1+Math.sqrt(5))/2; 
	    return((int)((Math.pow(phi,num)-Math.pow(1-phi,num))/Math.sqrt(5))); //finding fibonnaci number using formula.
	  }
	  
	
}
