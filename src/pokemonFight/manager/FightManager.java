package pokemonFight.manager;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JProgressBar;

import pokemonFight.view.GamePanel;

public class FightManager {
	GamePanel gamePanel = StatusSingleton.getInstance().getGamePanel();

	public void loadInfo() throws NullPointerException, IOException, Exception {
		gamePanel.enemyPokemonLifeBar = new JProgressBar(0, gamePanel.enemyPokemonTeam.get(0).getPokemonHP());
		gamePanel.allyPokemonLifeBar = new JProgressBar(0, gamePanel.allyPokemonTeam.get(0).getPokemonHP());
		gamePanel.enemyLvlLbl.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.allyLvlLbl.setText(gamePanel.allyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.enemyPokemonName.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonName());
		gamePanel.allyPokemonName.setText(gamePanel.allyPokemonTeam.get(0).getPokemonName());
		loadImages();
	}

	public void calculateTurn() {
		boolean turnElapsed = false;
		do {
			//calcular velocidad//
						
			
			//elegirAtaque//
						
			
			//turno terminado//
			turnElapsed = true;
		}while(true!=turnElapsed);
		
	}

	private void loadImages() throws IOException {
		BufferedImage scaledEnemyImage = toBufferedImage(gamePanel.enemyPokemonTeam.get(0).getPokemonFront()
				.getScaledInstance(gamePanel.newWidth, gamePanel.newHeight, Image.SCALE_SMOOTH));

		BufferedImage scaledAllyImage = toBufferedImage(gamePanel.allyPokemonTeam.get(0).getPokemonBack()
				.getScaledInstance(gamePanel.newWidth, gamePanel.newHeight, Image.SCALE_SMOOTH));

		gamePanel.scaledEnemyIcon.setImage(scaledEnemyImage);
		gamePanel.enemySprite.setIcon(gamePanel.scaledEnemyIcon);

		gamePanel.scaledAllyIcon.setImage(scaledAllyImage);
		gamePanel.allySprite.setIcon(gamePanel.scaledAllyIcon);
	}

	public BufferedImage toBufferedImage(Image img){
		if (img instanceof BufferedImage) {
			return (BufferedImage) img;
		}

		BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

		Graphics2D bGr = bimage.createGraphics();
		bGr.drawImage(img, 0, 0, null);
		bGr.dispose();

		return bimage;
	}
}