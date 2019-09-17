//use seperate the int into characters and sort using Arrays. reverse using String, and parse back to int
import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    char[] seperate = (""+num).toCharArray();
    Arrays.sort(seperate);
    String descDigits = new StringBuilder(new String(seperate)).reverse().toString();
    return Integer.parseInt(descDigits);
  }
}
