//Actual Solution:
class Fracts {
    
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static String convertFrac(long[][] lst) {
        long lcmall = 1;
        long[][] newlst = new long[lst.length][2];
        for  (int i = 0; i < lst.length; i++) {
            long g = gcd(lst[i][0], lst[i][1]);
            newlst[i][0] = lst[i][0] / g;
            newlst[i][1] = lst[i][1] / g;
        }
        for (long[] item : newlst) {
            lcmall = lcm(lcmall, item[1]);
        }
        String result = "";
        for (long[] item : newlst) {
            result += "(" + (item[0] * lcmall / item[1]) + "," + lcmall + ")";
        }
        return result;
    }
}

/* First Attempt:
public class Fracts {
  public static String convertFrac(long[][] lst) {
    if(lst.length==0){
      return "";
      }
	  long lowestCD = lst[0][1];
	  String result="";
	  for(int i=0; i<lst.length;i++){
	    lowestCD = getLCM(lowestCD, lst[i][1]);
	    }
	  for(int i=0; i<lst.length;i++){
	    lst[i][0] = (lowestCD/lst[i][1])*lst[i][0];
      lst[i][1] = lowestCD;
	    result+="("+lst[i][0]+","+lst[i][1]+")";
	    }  
    return result;
  }
  
  public static long getGCD(long a, long b){
    if (a == 0 || b == 0) {
	    return a + b;
	  }
	long big = Math.max(a, b);
  long small = Math.min(a, b);
  return getGCD(big % small, small);
	}
	  
	public static long getLCM(long a, long b){
	  if (a == 0 || b == 0) {
	    return 0;
    }
    long gcd = getGCD(a, b);
    
    return Math.abs(a * b) / gcd;
	}

}
*/
