import java.util.Scanner;


public class LinkedList {
	
	public Item first;
	public Item last;
	
	
	public LinkedList(){
		first = null;
		last = null;
		
	}
	
	public void addItem(Item e){
		if(first == null){
			first = e;
			last = e;
		}
		else{
			last.setNext(e);
			last = e;
		}
		
			
	}
	
	public Item deleteItem(Item e){
		
		if(first == e){
			return first.getNext();
		}
		return e;
	}
	
	public Item search(int e){
		Item i = null;
		while(first!=null){
			if(Item.id == e){
				i = first;
			}
			else{
				first.getNext();
			}
		}
		
		return i;
	}
	
	public Item search(String e){
		Item i = null;
		while(first!=null){
			if(Item.name.equals(e)){
				i = first;
			}
			else{
				first.getNext();
			}
		}
		
		return i;
	}
	
	public void print(){
		System.out.format("%s%d%n", Item.getName(), Item.getId() );
	}
	
	public void clear(){
		first = null;
		last = null;
	}
}
