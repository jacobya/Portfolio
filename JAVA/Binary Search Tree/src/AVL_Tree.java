import java.util.Scanner;


public class AVL_Tree {
	
	private Node root;
	private boolean increase, decrease, addReturn;
	private Scanner stop;
	
	public AVL_Tree(){
		root = null;
		addReturn = false;
		increase = false;
		stop = new Scanner(System.in);
		
	}
	
	public boolean add(int item){
		System.out.println("Starting search to place " + item);
		increase = false;
		root = add(root, item);
		return addReturn;
	}
	
	private Node add(Node localRoot, int item){
		
		if(localRoot == null){
			addReturn = true;
			increase = true;
			System.out.println("added " + item);
			return new Node(item);
		}
	}

}
