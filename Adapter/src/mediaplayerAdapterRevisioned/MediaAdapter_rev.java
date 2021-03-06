package mediaplayerAdapterRevisioned;

public class MediaAdapter_rev implements MediaPlayer_rev {

	   private AdvancedMediaPlayer_rev advancedMusicPlayer;
	   private AudioPlayer_rev audioPlayer;
	   
	   public MediaAdapter_rev(){
	   }

	   @Override
	   public void play(String audioType, String fileName) {
	   
	      if(audioType.equalsIgnoreCase("vlc")){
		     advancedMusicPlayer = new VlcPlayer_rev();	
	         advancedMusicPlayer.playVlc(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
		     advancedMusicPlayer = new Mp4Player_rev();
	         advancedMusicPlayer.playMp4(fileName);
	      } else if (audioType.equalsIgnoreCase("mp3")) {
	    	  audioPlayer = new AudioPlayer_rev();
	    	  audioPlayer.play("mp3", fileName);
	      } else {
	    	  System.out.println("Title " + fileName + " with audioformat " + audioType + " cannot be played.");
	      }
	   }
}
