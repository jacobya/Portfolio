

public class Item {
	
	public static  int id;
	public static String name;
	public Item next;

	
	public Item(int in_id, String in_name){
		id = in_id;
		name = in_name;
		
	}
	
	public void setNext(Item e){
		next = e;
	}
	
	public Item getNext(){
		return next;
		
	}
	
	public static int getId(){
		return id;
	}
	
	public static String getName(){
		return name;
	}
	
	public void setId(int e){
		id = e;
	}
	
	public void setName(String e){
		name = e;
	}

}