package pokemonFight.manager;

import pokemonFight.view.GamePanel;

public class StatusSingleton {
	
	private static StatusSingleton statusSingleton = null;
	
	private GamePanel gamePanel = null;
	
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

}
