package pokemonFight.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import pokemonFight.controller.SongController;
import pokemonFight.manager.FightManager;
import pokemonFight.manager.ImageManager;
import pokemonFight.manager.PokemonManager;
import pokemonFight.manager.StatusSingleton;
import pokemonFight.manager.pojo.Item;
import pokemonFight.manager.pojo.Pokemon;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public List<Pokemon> allyPokemonTeam = null;
	public List<Pokemon> enemyPokemonTeam = null;
	public List<Pokemon> combat = null;
	
	public List<Item> allyHeldItems = null;
	public List<Item> enemyHeldItems = null;

	public Pokemon allyPokemon = null;
	public Pokemon enemyPokemon = null;

	public FightManager fightManager = null;
	
	public JLabel allyLvlLbl = null;
	public JLabel enemyLvlLbl = null;
	public JLabel enemyPokemonName = null;
	public JLabel allyPokemonName = null;
	public JLabel enemySprite = null;
	public JLabel allySprite = null;
	public JLabel decissionTextLbl = null;
	public JLabel attackBtn = null;
	public JLabel attackBtn_1 = null;
	public JLabel attackBtn_2 = null;
	public JLabel attackBtn_3 = null;
	public JLabel attackBtn_4 = null;
	public JLabel swapBtn = null;
	public JLabel itemBtn = null;
	public JLabel defendBtn = null;
	
	public JProgressBar allyPokemonLifeBar = null;
	public JProgressBar enemyPokemonLifeBar = null;

	public ImageIcon scaledEnemyIcon = null;
	public ImageIcon scaledAllyIcon = null;

	public int newWidth = 150;
	public int newHeight = 150;

	public GamePanel() throws IOException {

		allyPokemonTeam = selectTeamPokemons("Selecciona los pokemon para el equipo aliado!!");
		enemyPokemonTeam = selectTeamPokemons("Selecciona los pokemon para el equipo enemigo!!");

		setLayout(null);

		this.setDoubleBuffered(true);

		this.setFocusable(true);
		this.requestFocusInWindow();

		enemyLvlLbl = new JLabel();
		enemyLvlLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		enemyLvlLbl.setBounds(244, 11, 28, 51);
		add(enemyLvlLbl);

		enemyPokemonLifeBar = new JProgressBar();
		enemyPokemonLifeBar.setBackground(Color.green);
		enemyPokemonLifeBar.setBounds(114, 53, 144, 20);
		add(enemyPokemonLifeBar);

		allyPokemonLifeBar = new JProgressBar();
		allyPokemonLifeBar.setBounds(622, 350, 144, 20);
		allyPokemonLifeBar.setBackground(Color.green);
		add(allyPokemonLifeBar);

		allyLvlLbl = new JLabel();
		allyLvlLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		allyLvlLbl.setBounds(747, 310, 28, 51);
		add(allyLvlLbl);

		allyPokemonName = new JLabel();
		allyPokemonName.setFont(new Font("Tahoma", Font.BOLD, 18));
		allyPokemonName.setHorizontalAlignment(SwingConstants.CENTER);
		allyPokemonName.setBounds(510, 316, 163, 37);
		add(allyPokemonName);

		enemyPokemonName = new JLabel();
		enemyPokemonName.setHorizontalAlignment(SwingConstants.CENTER);
		enemyPokemonName.setFont(new Font("Tahoma", Font.BOLD, 18));
		enemyPokemonName.setBounds(-10, 11, 163, 37);
		add(enemyPokemonName);

		scaledEnemyIcon = new ImageIcon();

		enemySprite = new JLabel("");
		enemySprite.setBounds(432, 106, 164, 145);
		add(enemySprite);

		scaledAllyIcon = new ImageIcon();

		allySprite = new JLabel("");
		allySprite.setBounds(136, 298, 164, 145);
		add(allySprite);

		JLabel allyPokemonLifeBarLbl = new JLabel();
		allyPokemonLifeBarLbl.setBounds(488, 306, 299, 111);
		allyPokemonLifeBarLbl.setIcon(new ImageIcon("contents/pokemonStatus/pokemonLifeBar.png"));
		add(allyPokemonLifeBarLbl);

		JLabel enemyLifeBarLbl = new JLabel();
		enemyLifeBarLbl.setBounds(0, 11, 299, 80);
		enemyLifeBarLbl.setIcon(new ImageIcon("contents/pokemonStatus/enemyLifeBar.png"));
		add(enemyLifeBarLbl);

		JLabel fightBackgroundLbl = new JLabel("");
		fightBackgroundLbl.setIcon(getBackgroundImage());
		fightBackgroundLbl.setBounds(0, 0, 800, 443);
		add(fightBackgroundLbl);

		StatusSingleton.getInstance().setGamePanel(this);

		if (!allyPokemonTeam.isEmpty() && !enemyPokemonTeam.isEmpty()) {
			allyPokemon = allyPokemonTeam.get(0);
			enemyPokemon = enemyPokemonTeam.get(0);

			combat = new ArrayList<Pokemon>();

			combat.add(allyPokemon);
			combat.add(enemyPokemon);

			try {
				new FightManager().loadInfo();
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "No se han escogido pokemons para el equipo", "Error",
						JOptionPane.ERROR_MESSAGE);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Las Imagenes no han podido ser cargadas", "Error",
						JOptionPane.ERROR_MESSAGE);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error general", "Error", JOptionPane.ERROR_MESSAGE);
			}

			decissionTextLbl = new JLabel();
			decissionTextLbl.setForeground(new Color(255, 255, 255));
			decissionTextLbl.setHorizontalAlignment(SwingConstants.CENTER);
			decissionTextLbl.setFont(new Font("Tahoma", Font.BOLD, 24));
			decissionTextLbl.setBounds(10, 443, 458, 157);
			add(decissionTextLbl);

			attackBtn_1 = new JLabel();
			attackBtn_1.setHorizontalAlignment(SwingConstants.CENTER);
			attackBtn_1.setForeground(Color.RED);
			attackBtn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			attackBtn_1.setBounds(68, 463, 163, 55);
			add(attackBtn_1);
			attackBtn_1.setVisible(false);

			attackBtn_2 = new JLabel();
			attackBtn_2.setHorizontalAlignment(SwingConstants.CENTER);
			attackBtn_2.setForeground(Color.RED);
			attackBtn_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			attackBtn_2.setBounds(68, 530, 163, 55);
			add(attackBtn_2);
			attackBtn_2.setVisible(false);

			attackBtn_3 = new JLabel();
			attackBtn_3.setHorizontalAlignment(SwingConstants.CENTER);
			attackBtn_3.setForeground(Color.RED);
			attackBtn_3.setFont(new Font("Tahoma", Font.BOLD, 20));
			attackBtn_3.setBounds(337, 530, 163, 55);
			add(attackBtn_3);
			attackBtn_3.setVisible(false);

			attackBtn_4 = new JLabel();
			attackBtn_4.setHorizontalAlignment(SwingConstants.CENTER);
			attackBtn_4.setForeground(Color.RED);
			attackBtn_4.setFont(new Font("Tahoma", Font.BOLD, 20));
			attackBtn_4.setBounds(337, 463, 163, 55);
			add(attackBtn_4);
			attackBtn_4.setVisible(false);

			swapBtn = new JLabel("Cambiar");
			swapBtn.setHorizontalAlignment(SwingConstants.CENTER);
			swapBtn.setForeground(new Color(237, 230, 80));
			swapBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
			swapBtn.setBounds(652, 463, 133, 55);
			add(swapBtn);

			itemBtn = new JLabel("Objetos");
			itemBtn.setHorizontalAlignment(SwingConstants.CENTER);
			itemBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
			itemBtn.setBounds(667, 530, 133, 55);
			add(itemBtn);

			defendBtn = new JLabel("Defenderse");
//			defendBtn.addMouseListener(new MouseAdapter() {
//				@Override
//				public void mouseClicked(MouseEvent e) {
//				}
//			});
			defendBtn.setHorizontalAlignment(SwingConstants.CENTER);
			defendBtn.setForeground(new Color(0, 128, 255));
			defendBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
			defendBtn.setBounds(510, 530, 133, 55);
			add(defendBtn);

			JLabel backBtn = new JLabel("Atras");
			backBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					decissionTextLbl.setVisible(true);
					itemBtn.setVisible(true);
					swapBtn.setVisible(true);
					defendBtn.setVisible(true);
					attackBtn.setVisible(true);
					if (checkAttackButtons()) {
						attackBtn_1.setVisible(false);
						attackBtn_2.setVisible(false);
						attackBtn_3.setVisible(false);
						attackBtn_4.setVisible(false);
					}
					backBtn.setVisible(false);
				}
			});
			backBtn.setHorizontalAlignment(SwingConstants.CENTER);
			backBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
			backBtn.setBounds(667, 530, 133, 55);
			add(backBtn);
			backBtn.setVisible(false);

			attackBtn = new JLabel("Atacar");
			attackBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					decissionTextLbl.setVisible(false);
					itemBtn.setVisible(false);
					swapBtn.setVisible(false);
					defendBtn.setVisible(false);
					attackBtn.setVisible(false);
					backBtn.setVisible(true);
					if (checkAttackButtons()) {
						attackBtn_1.setVisible(true);
						attackBtn_2.setVisible(true);
						attackBtn_3.setVisible(true);
						attackBtn_4.setVisible(true);
					}
				}
			});

			attackBtn.setHorizontalAlignment(SwingConstants.CENTER);
			attackBtn.setForeground(new Color(255, 0, 0));
			attackBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
			attackBtn.setBounds(488, 464, 133, 55);
			add(attackBtn);

			JLabel layoutFirstClrLbl = new JLabel("");
			layoutFirstClrLbl.setForeground(new Color(0, 0, 0));
			layoutFirstClrLbl.setFont(new Font("Tahoma", Font.BOLD, 28));
			layoutFirstClrLbl.setHorizontalAlignment(SwingConstants.CENTER);
			layoutFirstClrLbl.setIcon(new ImageIcon("contents/layoutColours/DecissionMenuClr.png"));
			layoutFirstClrLbl.setBounds(0, 443, 800, 157);
			add(layoutFirstClrLbl);

			
			try {
				StatusSingleton.getInstance().getSongController();
				SongController.playRandomSong();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			setPreferredSize(new Dimension(800, 600));

			FightManager fightManager = new FightManager();
			fightManager.trainerBattle();
		} else {
			JOptionPane.showMessageDialog(null, "No se han seleccionado pokemon en algun equipo.", "ERROR!",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	}

	/**
	 * Metodo para conseguir un fondo random de la galeria
	 * 
	 * @return Imagen de fondo
	 */
	public ImageIcon getBackgroundImage() {
		ImageIcon background = null;
		List<ImageIcon> backgrounds = new ArrayList<>();
		Random randomNumberToExecute = new Random();
		int randomBackground = randomNumberToExecute.nextInt(5);
		backgrounds = new ImageManager().getBackgrounds();
		background = backgrounds.get(randomBackground);
		return background;
	}

	/**
	 * metodo inicial para seleccionar los pokemon
	 * 
	 * @param message
	 * @return equipo inicial para el combate
	 * @throws IOException
	 */
	public List<Pokemon> selectTeamPokemons(String message) throws IOException {
		JOptionPane.showMessageDialog(null, message, "Bienvenido!!", JOptionPane.INFORMATION_MESSAGE);
		List<Pokemon> selectablePokemon = new PokemonManager().getPokemons();
		String selectablePokemonNames = null;

		JPanel panel = new JPanel();
		panel.add(new JLabel("Selecciona un Pokémon:"));

		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<String>();
		for (int i = 0; i < selectablePokemon.size(); i++) {
			selectablePokemonNames = selectablePokemon.get(i).getPokemonName();
			comboBoxModel.addElement(selectablePokemonNames);
		}

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setModel(comboBoxModel);
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

	/**
	 * Para cambiar los pokemon del arrayList y sacar a otro.
	 * 
	 * @param team
	 * @return el equipo modificado
	 */
	public List<Pokemon> changePokemon(List<Pokemon> team) {
		String selectablePokemonNames = null;

		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<String>();
		for (int i = 0; i < team.size(); i++) {
			selectablePokemonNames = team.get(i).getPokemonName();
			comboBoxModel.addElement(selectablePokemonNames);
		}

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setModel(comboBoxModel);
		JPanel panel = new JPanel();
		panel.add(new JLabel("Selecciona un Pokémon:"));
		panel.add(comboBox);

		for (int i = 0; i < 6; i++) {
			int result = JOptionPane.showConfirmDialog(null, panel, "Seleccionar Pokémon",
					JOptionPane.OK_CANCEL_OPTION);

			if (result == 0) {
				int selectedIndex = comboBox.getSelectedIndex();
				if (selectedIndex != -1) {
					Collections.swap(team, 0, selectedIndex);
					return team;
				}
			} else {
				break;
			}
		}
		return team;
	}
	
	public void stopBattle() {
		fightManager = new FightManager();
	    if (fightManager.battleWorker != null && !fightManager.battleWorker.isDone()) {
	    	fightManager.battleWorker.cancel(true); 
	    }
	}

	private boolean checkAttackButtons() {
		if (attackBtn_1 != null && attackBtn_1.getText() != null && attackBtn_2 != null && attackBtn_2.getText() != null
				&& attackBtn_3 != null && attackBtn_3.getText() != null && attackBtn_4 != null
				&& attackBtn_4.getText() != null)
			return true;
		else
			return false;
	}
}