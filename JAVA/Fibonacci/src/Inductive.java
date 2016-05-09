
public class Inductive {
	private static int x, y, z, n;
	
	public static void inductive(int n){
		x=1;
		y=1;
		z=0;
		fibInductive(n);
	}
	
	private static int fibInductive(int n_input){

		n=n_input;
		if(n==1){
			return 1;
		}
		if(n==2){
			return 1;
		}
		for(int i=0; i<n; i++){
			z=x+y;
			y=x;
			x=z;
		}
		return x;
	}

}
