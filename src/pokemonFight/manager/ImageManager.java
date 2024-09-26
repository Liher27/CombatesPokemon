package pokemonFight.manager;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import pokemonFight.view.GamePanel;

public class ImageManager {

	GamePanel gamePanel = StatusSingleton.getInstance().getGamePanel();
	
	public List<ImageIcon> getBackgrounds() {
		List<ImageIcon> ret = new ArrayList<ImageIcon>();
		ret.add(new ImageIcon("contents/backgrounds/Background_1.png"));
		ret.add(new ImageIcon("contents/backgrounds/Background_2.png"));
		ret.add(new ImageIcon("contents/backgrounds/Background_3.png"));
		ret.add(new ImageIcon("contents/backgrounds/Background_4.png"));
		ret.add(new ImageIcon("contents/backgrounds/Background_5.png"));
		ret.add(new ImageIcon("contents/backgrounds/Background_6.png"));
		return ret;
	}
	
	public void loadImages() throws IOException {
		BufferedImage scaledEnemyImage = toBufferedImage(gamePanel.enemyPokemonTeam.get(0).getPokemonFront()
				.getScaledInstance(gamePanel.newWidth, gamePanel.newHeight, Image.SCALE_SMOOTH));

		BufferedImage scaledAllyImage = toBufferedImage(gamePanel.allyPokemonTeam.get(0).getPokemonBack()
				.getScaledInstance(gamePanel.newWidth, gamePanel.newHeight, Image.SCALE_SMOOTH));

		gamePanel.scaledEnemyIcon.setImage(scaledEnemyImage);
		gamePanel.enemySprite.setIcon(gamePanel.scaledEnemyIcon);

		gamePanel.scaledAllyIcon.setImage(scaledAllyImage);
		gamePanel.allySprite.setIcon(gamePanel.scaledAllyIcon);
	}

	private BufferedImage toBufferedImage(Image img) {
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
