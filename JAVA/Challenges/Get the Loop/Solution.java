import java.io.*; 
import java.util.*; 
public class LoopInspector {

  public int loopSize(Node node) {
    ArrayList<Node> arr =  new ArrayList<Node>();
    int size = 0;
    boolean cont = true;
    arr.add(node);
    
    do{
      node = node.getNext();
      if(arr.contains(node)){
        cont = false;
      }
      arr.add(node);
    }while(cont);
    
    return arr.size() - arr.indexOf(node) - 1;
  }

}
