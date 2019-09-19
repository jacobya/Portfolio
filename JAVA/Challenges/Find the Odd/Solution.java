
import java.io.*; 
import java.util.*; 
public class FindOdd {
  public static int findIt(int[] arr) {
    int odd = 0;
    HashMap<Integer, Integer> numCountMap = new HashMap<Integer, Integer>();
    for ( int i = 0; i < arr.length; i++) {
      if(numCountMap.containsKey(arr[i])){
        numCountMap.put(arr[i], numCountMap.get(arr[i]) + 1); 
             
      }
      else {
        numCountMap.put(arr[i], 1); 
      }
    }
    for(Integer a:numCountMap.keySet()) 
        { 
            if(numCountMap.get(a) % 2 != 0) 
                odd = a; 
        } 
    System.out.println(numCountMap);
    return odd;
  }
}
