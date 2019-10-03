public class Dubstep {
  public static String SongDecoder (String song)
  {
     String wub = "WUB";
     if(song.contains(wub)){
       song = song.replaceAll(wub," ");
       song = song.replaceAll(" +", " ");
       song = song.trim();
        
     }
     return song;
   }
}
