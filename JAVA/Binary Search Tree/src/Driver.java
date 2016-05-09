
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
	
	public static void main (String [] args) throws FileNotFoundException{
		int choice;
		int id;
		String name;
		String sName;
		int sId;
		Scanner in = new Scanner(System.in);
		//Create tree
		BST tree = new BST();
		do{
			//Show menu
			System.out.println("Press 1 to insert manually");
			System.out.println("Press 2 to show post-order");
			System.out.println("Press 3 to show in-order");
			System.out.println("Press 4 to show pre-order");
			System.out.println("Press 5 to search");
			System.out.println("Press 6 to insert via a file");
			System.out.println("Press 7 to delete");
			System.out.println("0 to exit");
		
			choice = in.nextInt();
		
			switch(choice){
			case 1: 
				id = in.nextInt();
				name = in.next();
				tree.insert(id, name);
				break;
			case 2:
				tree.postorderTraversal();
				System.out.println();
				break;
			case 3:
				tree.inorderTraversal();
				System.out.println();
				break;
			case 4:
				tree.preorderTraversal();
				System.out.println();
				break;
			case 5:
				System.out.println("Enter name");
				sName = in.next();
				System.out.println("Enter ID");
				sId = in.nextInt();
				tree.search(sName, sId);
				break;
			case 6:
				Scanner scanner = new Scanner(new File("C:/Users/Mortinec/Dropbox/School/Workspace/Binary Search Tree/src/data.txt")); 
				while(scanner.hasNext()){
					String input = scanner.nextLine();
					//System.out.println(input);
					int index = input.indexOf(' ');
					//System.out.println(index);
					String r = input.substring(0, index);
					id = Integer.parseInt(r);
					//System.out.println("1");					
					name = input.substring(index);
					tree.insert(id, name);
					System.out.printf("%s has been inserted%n", input);
				}
			case 7:
				System.out.println("Currently unavailible");
				break;
			}
			
		}while(choice != 0);//exit menu, close program
	}
}
