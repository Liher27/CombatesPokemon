package pokemonFight.manager;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class ImageManager {

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
}
