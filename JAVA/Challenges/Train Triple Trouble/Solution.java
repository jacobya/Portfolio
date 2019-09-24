public class Kata
{
  public static int TripleDouble(long num1, long num2) 
  {
    int length1 = String.valueOf(num1).length();
    int length2 = String.valueOf(num2).length();
    long[] numOne = new long[length1];
    long[] numTwo = new long[length2];
    int x = 0;
    int y = 0;
    long isDubTrip = 0;
    int ret = 0;
    
    while (num1 > 0){
      numOne[x] = num1 % 10;
      num1/=10;
      x++;
      }
    
    while (num2 > 0){
      numTwo[y] = num2 % 10;
      num2/=10;
      y++;
      }
    
    if(length1 > 2){
      for(int i = 2; i < length1; i++){
        if(numOne[i] == numOne[i-1] && numOne[i] == numOne[i-2]){
          isDubTrip = numOne[i];
          System.out.print(isDubTrip + " is trip");
          }  
        }
      }
      
    if(length2 > 1){
      for(int i = 1; i < length2; i++){
        if(numTwo[i] == numTwo[i-1] && numTwo[i-1] == isDubTrip){
          ret = 1;
          }
        }
      }
    return ret;
  }
}
