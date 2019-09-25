/* Improved Solution:

import java.util.*;

public class MexicanWave {

    public static String[] wave(String str) {    
      List<String> list = new ArrayList<>();
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == ' ') continue;
        list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
      }
      return list.toArray(new String[0]);
    }
    
}

*/
//Solution
import java.util.Arrays;
public class MexicanWave {

    public static String[] wave(String str) {
        int y = str.length();
        String[] wave = new String[y];
        String[] each = str.split("");
        int x = 0;
        for(int i = 0; i < y; i++){
          if(!each[i].equals(" ")){
            each[i] = each[i].toUpperCase();
            wave[i] = String.join("", each);
            each[i] = each[i].toLowerCase();
            }
          else{
            x++;
            }
          }
        y = y-x;
        int j = 0;
        String[] retWave = new String[y];
        for(int i = 0; i < wave.length; i++){
          if(wave[i] != null){
            retWave[j] = wave[i];
            j++;
            }
          }
        System.out.println(Arrays.toString(wave));
        return retWave;
    }
    
}
