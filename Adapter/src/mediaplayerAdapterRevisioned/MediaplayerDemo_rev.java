package mediaplayerAdapterRevisioned;

public class MediaplayerDemo_rev {
	   public static void main(String[] args) {
		      MediaPlayer_rev mediaAdapter = new MediaAdapter_rev();

		      mediaAdapter.play("mp3", "beyond the horizon.mp3");
		      mediaAdapter.play("mp4", "alone.mp4");
		      mediaAdapter.play("vlc", "far far away.vlc");
		      mediaAdapter.play("avi", "mind me.avi");
		   }
}
