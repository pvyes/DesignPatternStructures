package mediaplayerAdapterRevisioned;

public class Mp4Player_rev implements AdvancedMediaPlayer_rev {
	   @Override
	   public void playVlc(String fileName) {
	      //do nothing
	   }

	   @Override
	   public void playMp4(String fileName) {
	      System.out.println("Playing mp4 file. Name: "+ fileName);		
	   }
}
