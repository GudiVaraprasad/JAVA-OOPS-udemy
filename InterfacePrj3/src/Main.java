// Interfaces for loosely coupled code

interface VideoPlayer {
	void play(String fileName);
}

class MP4Player implements VideoPlayer {

	@Override
	public void play(String fileName) {
		System.out.println("play mp4 file " + fileName );
	}
	
}

class AVIPlayer implements VideoPlayer {

	@Override
	public void play(String fileName) {
		System.out.println("play avi file " + fileName);
	}
	
}

class PlayerFactory {
	
	public VideoPlayer getVideoPlayer(String fileName) {
		
		if (fileName.endsWith(".mp4")) {
			return new MP4Player();
		} else if (fileName.endsWith(".avi")) {
			return new AVIPlayer();
		} else {
			return null;
		}
		
	}
}

public class Main {

	public static void main(String[] args) {
		
		String fileName = "Sample.avi";
		PlayerFactory factory = new PlayerFactory();
		VideoPlayer player = factory.getVideoPlayer(fileName);
		if (player != null) {
			player.play(fileName);
		}
		
	}
}
