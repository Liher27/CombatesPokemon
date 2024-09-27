package pokemonFight.manager;

import pokemonFight.controller.SongController;
import pokemonFight.view.GamePanel;

public class StatusSingleton {
	
	private static StatusSingleton statusSingleton = null;
	
	private GamePanel gamePanel = null;
	
	private SongController songController = null;
	
	public StatusSingleton() {
    }
	
	public static StatusSingleton getInstance() {
		if (null == statusSingleton) {
			statusSingleton = new StatusSingleton();
		}
		return statusSingleton;
	}

	public GamePanel getGamePanel() {
		return gamePanel;
	}

	public void setGamePanel(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	 public SongController getSongController() {
	    	return songController;
	    }
	 
	public void setSongController(SongController songController) {
		this.songController = songController;
	}
	
}
