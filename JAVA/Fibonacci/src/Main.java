import java.util.Scanner;


public class Main {

	/**
	 * Implement and time three methods for Fibonacci
	 * @param args
	 */
	public static void main(String[] args) {
		int choose = 0;
		long startTime = 0;
		long  endTime = 0;
		int num = 0;
		Scanner in = new Scanner(System.in);
		boolean quit = false;
		long time = 0;
		do{
			System.out.println("CHOOSE! Fibonacci: 1. rec | 2. Ind | 3. Form | 0. Quit");
			choose = in.nextInt();
			switch(choose){
			case 1:
				System.out.println("How Many?");
				num = in.nextInt();
				startTime = System.nanoTime(); 
				Recursive.recursion(num);
				endTime = System.nanoTime();
				time = (endTime - startTime);
				System.out.printf("It took %d nanoseconds%n",time);
				break;
			case 2:
				System.out.println("How Many?");
				num = in.nextInt();
				startTime = System.nanoTime(); 
				Inductive.inductive(num);
				endTime = System.nanoTime();
				time = (endTime - startTime);
				System.out.printf("It took %d nanoseconds%n",time);
				break;
			case 3: 
				System.out.println("How Many?");
				num = in.nextInt();
				startTime = System.nanoTime(); 
				Formula.fibFormula(num);
				endTime = System.nanoTime();
				time = (endTime - startTime);
				System.out.printf("It took %d nanoseconds%n",time);
				break;
			case 0:
				quit = true;
				break;
			}
		} while(!quit);
	}

}
