package mediaplayerAdapterRevisioned;

public class AudioPlayer_rev implements MediaPlayer_rev {

	   @Override
	   public void play(String audioType, String fileName) {		

	      //inbuilt support to play mp3 music files
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: " + fileName);			
	      } 
	   } 
}
