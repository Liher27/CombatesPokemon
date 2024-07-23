package pokemonFight.view;

import javax.swing.JPanel;
import pokemonFight.manager.ImageManager;
import pokemonFight.manager.PokemonManager;
import pokemonFight.manager.pojo.Pokemon;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	List<Pokemon> allyPokemon = null;
	List<Pokemon> enemyPokemon = null;
	int newWidth = 150;
	int newHeight = 150;
	
	public GamePanel() throws IOException {

		allyPokemon = selectTeamPokemons("Selecciona los pokemon para el equipo aliado!!");
		enemyPokemon = selectTeamPokemons("Selecciona los pokemon para el equipo enemigo!!");
		
		setLayout(null);

		if (true != allyPokemon.isEmpty() && true != enemyPokemon.isEmpty()) {

			JLabel enemyPokemonLifeBarName = new JLabel(enemyPokemon.get(0).getPokemonName());
			enemyPokemonLifeBarName.setHorizontalAlignment(SwingConstants.CENTER);
			enemyPokemonLifeBarName.setFont(new Font("Tahoma", Font.BOLD, 18));
			enemyPokemonLifeBarName.setBounds(-10, 11, 163, 37);
			add(enemyPokemonLifeBarName);

			JLabel allyPokemonLifeBarName = new JLabel(allyPokemon.get(0).getPokemonName());
			allyPokemonLifeBarName.setFont(new Font("Tahoma", Font.BOLD, 18));
			allyPokemonLifeBarName.setHorizontalAlignment(SwingConstants.CENTER);
			allyPokemonLifeBarName.setBounds(510, 316, 163, 37);
			add(allyPokemonLifeBarName);

			Image originalEnemyImage = new ImageIcon(enemyPokemon.get(0).getPokemonFront()).getImage();
			ImageIcon scaledEnemyIcon = new ImageIcon(
					originalEnemyImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));

			JLabel enemySprite = new JLabel("");
			enemySprite.setIcon(scaledEnemyIcon);
			enemySprite.setBounds(432, 106, 164, 145);
			add(enemySprite);
			
			Image originalAllyImage = new ImageIcon(allyPokemon.get(0).getPokemonBack()).getImage();
			ImageIcon scaledAllyIcon = new ImageIcon(
					originalAllyImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));

			JLabel allySprite = new JLabel("");
			allySprite.setIcon(scaledAllyIcon);
			allySprite.setBounds(136, 298, 164, 145);
			add(allySprite);

			JLabel decissionTextLbl = new JLabel("¿Que deberia hacer " + allyPokemon.get(0).getPokemonName() + "?");
			decissionTextLbl.setForeground(new Color(255, 255, 255));
			decissionTextLbl.setHorizontalAlignment(SwingConstants.CENTER);
			decissionTextLbl.setFont(new Font("Tahoma", Font.BOLD, 24));
			decissionTextLbl.setBounds(10, 443, 458, 157);
			add(decissionTextLbl);
		} else {
			JOptionPane.showMessageDialog(null, "No se han podido cargar los pokemon correctamente", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		JLabel allyPokemonLifeBarLbl = new JLabel("");
		allyPokemonLifeBarLbl.setBounds(488, 307, 299, 111);
		allyPokemonLifeBarLbl.setIcon(new ImageIcon("contents/pokemonStatus/pokemonLifeBar.png"));
		add(allyPokemonLifeBarLbl);

		JLabel enemyLifeBarLbl = new JLabel("");
		enemyLifeBarLbl.setBounds(0, 11, 299, 80);
		enemyLifeBarLbl.setIcon(new ImageIcon("contents/pokemonStatus/enemyLifeBar.png"));
		add(enemyLifeBarLbl);

		JLabel runBtn = new JLabel("Huir");
		runBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		runBtn.setHorizontalAlignment(SwingConstants.CENTER);
		runBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		runBtn.setBounds(667, 530, 133, 55);
		add(runBtn);

		JLabel catchBtn = new JLabel("Capturar");
		catchBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		catchBtn.setHorizontalAlignment(SwingConstants.CENTER);
		catchBtn.setForeground(new Color(237, 230, 80));
		catchBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		catchBtn.setBounds(652, 463, 133, 55);
		add(catchBtn);

		JLabel defendBtn = new JLabel("Defenderse");
		defendBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		defendBtn.setHorizontalAlignment(SwingConstants.CENTER);
		defendBtn.setForeground(new Color(0, 128, 255));
		defendBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		defendBtn.setBounds(510, 530, 133, 55);
		add(defendBtn);

		JLabel attackBtn = new JLabel("Atacar");
		attackBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		attackBtn.setHorizontalAlignment(SwingConstants.CENTER);
		attackBtn.setForeground(new Color(255, 0, 0));
		attackBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		attackBtn.setBounds(488, 464, 133, 55);
		add(attackBtn);

		JLabel layoutSecondClrLbl = new JLabel("");
		layoutSecondClrLbl.setBounds(478, 443, 343, 157);
		layoutSecondClrLbl.setIcon(new ImageIcon("contents/layoutColours/Op.png"));
		add(layoutSecondClrLbl);

		JLabel layoutFirstClrLbl = new JLabel("");
		layoutFirstClrLbl.setForeground(new Color(0, 0, 0));
		layoutFirstClrLbl.setFont(new Font("Tahoma", Font.BOLD, 28));
		layoutFirstClrLbl.setHorizontalAlignment(SwingConstants.CENTER);
		layoutFirstClrLbl.setIcon(new ImageIcon("contents/layoutColours/DecissionMenuClr.png"));
		layoutFirstClrLbl.setBounds(0, 443, 481, 157);
		add(layoutFirstClrLbl);

		JLabel fightBackgroundLbl = new JLabel("");
		fightBackgroundLbl.setIcon(getBackgroundImage());
		fightBackgroundLbl.setBounds(0, 0, 800, 443);
		add(fightBackgroundLbl);

		setPreferredSize(new Dimension(800, 600));
	}

	public ImageIcon getBackgroundImage() {
		ImageIcon background = null;
		List<ImageIcon> backgrounds = new ArrayList<>();
		Random randomNumberToExecute = new Random();
		int randomBackground = randomNumberToExecute.nextInt(5);
		backgrounds = new ImageManager().getBackgrounds();
		background = backgrounds.get(randomBackground);
		return background;
	}

	public List<Pokemon> selectTeamPokemons(String message) throws IOException {
		JOptionPane.showMessageDialog(null, message, "Bienvenido!!", JOptionPane.INFORMATION_MESSAGE);

		List<Pokemon> selectablePokemon = new PokemonManager().pokemons;
		String selectablePokemonNames = null;

		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<String>();
		for (int i = 0; i < selectablePokemon.size(); i++) {
			selectablePokemonNames = selectablePokemon.get(i).getPokemonName();
			comboBoxModel.addElement(selectablePokemonNames);
		}

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setModel(comboBoxModel);

		JPanel panel = new JPanel();
		panel.add(new JLabel("Selecciona un Pokémon:"));
		panel.add(comboBox);

		List<Pokemon> selectedPokemons = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			int result = JOptionPane.showConfirmDialog(null, panel, "Seleccionar Pokémon",
					JOptionPane.OK_CANCEL_OPTION);

			if (result == 0) {
				int selectedIndex = comboBox.getSelectedIndex();
				if (selectedIndex != -1) {
					Pokemon selectedPokemon = selectablePokemon.get(selectedIndex);
					selectedPokemons.add(selectedPokemon);
				}
			} else {
				break;
			}
		}
		return selectedPokemons;

	}
}