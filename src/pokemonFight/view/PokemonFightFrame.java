package pokemonFight.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Clase para crear el frame y añadirle el Panel
 */
public class PokemonFightFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public PokemonFightFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Combates Pokemon!!!");

		try {
			GamePanel gamePanel = new GamePanel();

			add(gamePanel);

			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					gamePanel.stopBattle();
					System.exit(0);
				}
			});

			pack();
			setLocationRelativeTo(null);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se han podido cargar las imagenes de los pokemon correctamente",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}