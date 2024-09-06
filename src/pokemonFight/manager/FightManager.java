package pokemonFight.manager;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JProgressBar;

import pokemonFight.manager.pojo.Pokemon;
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

	public List<Pokemon> calculateTurn(List<Pokemon> combate) {
		List<Pokemon> ret = new ArrayList<Pokemon>();

		int iniciativa0 = combate.get(0).getPokemonSpeed();
		int iniciativa1 = combate.get(1).getPokemonSpeed();

		if (iniciativa0 == iniciativa1) {
			ret.add(combate.get(0));
			ret.add(combate.get(1));

		} else if (iniciativa0 > iniciativa1) {

			ret.add(combate.get(0));
			ret.add(combate.get(1));
		} else {
			ret.add(combate.get(1));
			ret.add(combate.get(0));

		}

		return ret;
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

	public BufferedImage toBufferedImage(Image img) {
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