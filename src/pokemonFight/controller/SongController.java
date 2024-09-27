package pokemonFight.controller;

import java.util.Random;
import pokemonFight.manager.StatusSingleton;
import javax.sound.sampled.*;

public class SongController {

	public static final SongController black = new SongController("/Black.wav");
	public static final SongController blasco = new SongController("/Blasco.wav");
	public static final SongController kanto = new SongController("/Kanto.wav");
	public static final SongController rayquaza = new SongController("/Rayquaza.wav");
	public static final SongController red = new SongController("/Red.wav");
	public static final SongController[] songs = { black, blasco, kanto, rayquaza, red };

	private Clip clip = null;

	public SongController(String filename) {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(SongController.class.getResource(filename));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			 clip.addLineListener(new SongLineListener());
			 StatusSingleton.getInstance().setSongController(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void play() {
		if (clip.isRunning()) {
			clip.stop();
		}
		clip.setFramePosition(0);
		clip.start();
	}

	public void stop() {
			clip.close();
	}

	public void restart() {
		stop();
		play();
	}
	
    public static void playRandomSong() {
        Random random = new Random();
        int randomIndex = random.nextInt(songs.length);
        songs[randomIndex].play();
        
    }
    //Clase interna para que cuando una cancion termine inicie otra de forma random
    private class SongLineListener implements LineListener {
        @Override
        public void update(LineEvent event) {
            if (event.getType() == LineEvent.Type.STOP) {
                playRandomSong();
            }
        }
    }
}