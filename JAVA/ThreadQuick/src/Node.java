public class Node implements Comparable<Node>{
 
 private int id;
 
 public Node(int idNumber){
 id = idNumber; 
 }
 
 public int getId(){
 return id;
 }
   
 public int compareTo(Node otherNode){
 
     if (this.id < otherNode.id) {return -1;}
     else if (this.id > otherNode.id) {return 1;}
     else return 0;
 }
}