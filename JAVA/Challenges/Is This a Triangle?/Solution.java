class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    boolean tri = true;
    if ( a > 0 && b > 0 && c > 0){ 
      if(a+b <= c){ tri = false; }
      else if(b+c <= a){ tri = false; }
      else if(c+a <= b){ tri = false; }
      }
    else{
      tri = false;
      }
    return tri;
    }
}
