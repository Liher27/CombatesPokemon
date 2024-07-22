package pokemonFight.view;

import javax.swing.JFrame;

/**
 * Clase para crear el frame y añadirle el Panel
 */
public class PokemonFightFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * constructor
	 */
	public PokemonFightFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Combates Pokemon!!!");

		GamePanel gamePanel = null;
		gamePanel = new GamePanel();

		add(gamePanel);

		pack();
		setLocationRelativeTo(null);
	}

}
