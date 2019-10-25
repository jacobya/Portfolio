public class Dinglemouse {

  public static String whatTimeIsIt(final double angle) {
    double hour = 12;
    double minute = 0;
    String time = "";
    
    if(angle > 0){
      hour = Math.floor(angle/30);
    }
    if (angle > 360){
      hour = Math.floor(angle/30)%12;
    }
    if(hour == 0){
      hour = 12;
    }
    
    minute = Math.floor(angle%30*2);
    time = (String.format("%02.0f", hour) + ":" + String.format("%02.0f", minute));
    return time;
  }

}
