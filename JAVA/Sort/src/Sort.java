import java.util.Scanner;


public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please give array size.");
		Scanner chicken = new Scanner(System.in);
		int size = chicken.nextInt(); 
		int[] stuff = new int[size]; 
		for (int i = 0; i < stuff.length; i++)
        	{
            	stuff[i] = new Integer ((int) (Math.random() * size));
        	}
        
        System.out.println("Choose Bubble (1) or Insertion (2)");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if(choice == 2){
    		double startTime1 = System.nanoTime();
            InsertSort.sort(stuff);
            double finishTime1 = System.nanoTime();
            System.out.println("The time in nanoseconds to insert sort " + size + " items is " + (finishTime1 - startTime1));
            }
        if(choice == 1){
    		double startTime1 = System.nanoTime();
            BubbleSort.sort(stuff);
            double finishTime1 = System.nanoTime();
            System.out.println("The time in nanoseconds to bubble sort " + size + " items is " + (finishTime1 - startTime1));
            }


	}

}
