class Persist {
static int count = 0;
	public static int persistence(long n) {
		    
    if(n < 10) { 
      int temp = count;
      count = 0;
      return temp; 
      }
      
    count++;
    long mult = 1;
    String temp = Long.toString(n);
    long[] nSplit = new long[temp.length()];
    
    for (int i = 0; i < temp.length(); i++) {
      nSplit[i] = temp.charAt(i) - '0';
    }
    
    for (int i = 0; i < temp.length(); i++) {
      System.out.println(mult + " * " + nSplit[i]);
      mult *= nSplit[i];
      
    }
    
    return persistence(mult);
    
	}
}
