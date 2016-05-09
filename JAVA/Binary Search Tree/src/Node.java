
public class Node<E extends Comparable<? super E>> {
	
	private int id;
	private String name;
	private Node<E> parent;
	private Node<E> lChild;
	private Node<E> rChild;
	
	
	
	public Node(int id, String name, Node<E> lChild, Node<E> rChild){
		this.setId(id);
		this.setName(name);
		this.setLChild(lChild);
		this.setRChild(rChild);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
	return name;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
	return id;
	}
	
	public void setParent(Node<E> parent){
		this.parent = parent;
	}
	
	public Node<E> getParent(){
		return parent;
	}
	
	public void setLChild(Node<E> lChild){
		this.lChild = lChild;
	}
	
	public Node<E> getLChild(){
		return lChild;
	}
	
	public void setRChild(Node<E> rChild){
		this.rChild = rChild;
	}
	
	public Node<E> getRChild(){
		return rChild;
	}
}
