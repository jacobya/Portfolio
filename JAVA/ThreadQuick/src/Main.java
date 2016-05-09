/*
 * Creates a random array for testing
 * 
 * Times a Threaded QuickSort
 * 
 */
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int id;
		Node Node;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("How many Nodes?%n");
		int maxNodes = keyboard.nextInt();
		Node[] NodeList1 = new Node[maxNodes];
		Node[] NodeList2 = new Node[maxNodes];
		Node[] NodeList3 = new Node[maxNodes];
		Random generator = new Random(197586);
		for(int i = 0; i < maxNodes; i++){
			id = generator.nextInt();
			NodeList1[i] = new Node(id);
			NodeList2[i] = new Node(id);
			NodeList3[i] = new Node(id);
		}
		double time5 = System.currentTimeMillis();
		QuickSortThreaded dude = new QuickSortThreaded(NodeList3, 0, maxNodes-1);
		dude.run();
		try {
			dude.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double time6 = System.currentTimeMillis();
		System.out.printf("Threaded QuickSort took %f ms%n", (time6 - time5));
		
		
	}
}
 
