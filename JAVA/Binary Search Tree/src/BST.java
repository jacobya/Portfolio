
public class BST<E extends Comparable<? super E>> {

	private Node<E> root;
	
	
	public void insert(int id, String name){
		insert(new Node<E>(id, name, null, null));
	}
	
	public void insert(Node<E> z){
		
		Node<E> y = null;
		Node<E> x = root;
		
		while(x != null){
			y = x;
			
			if(z.getId() < x.getId()){
				x = x.getLChild();
			}
			else {
				x = x.getRChild();
			}
		}
		
		z.setParent(y);
		
		if(y == null){
			root = z;
		}
		else if(z.getId() < y.getId()){
			y.setLChild(z);
		}
		else y.setRChild(z);//Bloody hell, I had forgot this, could not understand. 6 hours looking for why this didnt work. Im pretty sure nobody will read this.
	}
	
	public void preorderTraversal(){
		preorderTraversal(root);
	}
	
	public void preorderTraversal(Node<E> node) {
        if (node != null) {
            System.out.print(node.getId() + " " + node.getName());
            preorderTraversal(node.getLChild());
            preorderTraversal(node.getRChild());            
        }
    }
 
    public void inorderTraversal() {
        inorderTraversal(root);
    }
 
    private void inorderTraversal(Node<E> node) {
        if (node != null) {
            inorderTraversal(node.getLChild());
            System.out.print(node.getId() + " " + node.getName());
            inorderTraversal(node.getRChild());
        }
    }
 
    public void postorderTraversal() {
        postorderTraversal(root);
    }
 
    private void postorderTraversal(Node<E> node) {
        if (node != null) {
            postorderTraversal(node.getLChild());
            postorderTraversal(node.getRChild());
            System.out.print(node.getId() + " " + node.getName());
        }
    }
 
    public Node<E> search(String s, int i){
    	Node<E> node = root;
    	while (node != null){
    		if(s.compareTo(node.getName()) == 0){
    			if(i == node.getId()){
    				return node;
    			}
    			else{
    				node = node.getRChild();
    				}
    		}
    		else if(s.compareTo(node.getName()) < 0){
    			node = node.getLChild();
    			}
    		else if(s.compareTo(node.getName()) > 0){
    			node = node.getRChild();
    			}
    	}
    	return null;
    }
    
    public Node<E> delete(String s, int i){
    	Node<E> node = root;
    	if(node == null){
    		System.out.print("does not exist");
    		return null;
    	}
    	if(s.compareTo(node.getName()) == 0){
    		if(i == node.getId()){
    			if(node.getLChild() == null){
    				return node.getRChild();
    			}
    			else if(node.getRChild() == null){
    				return node.getLChild();
    			}
    			else{
    				return null;
    			}
    		}
    	}
    	
    	return node;
    }
    
}
