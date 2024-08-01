package pokemonFight.view;

import javax.swing.JPanel;

import pokemonFight.manager.AttackManager;
import pokemonFight.manager.FightManager;
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

	JLabel enemyPokemonLifeBarName = null;
	JLabel allyPokemonLifeBarName = null;
	JLabel enemySprite = null;
	JLabel allySprite = null;
	JLabel decissionTextLbl = null;
	JLabel attackBtn = null;
	JLabel attackBtn_1 = null;
	JLabel attackBtn_2 = null;
	JLabel attackBtn_3 = null;
	JLabel attackBtn_4 = null;

	ImageIcon scaledEnemyIcon = null;
	ImageIcon scaledAllyIcon = null;

	public GamePanel() throws IOException {

		allyPokemon = selectTeamPokemons("Selecciona los pokemon para el equipo aliado!!");
		enemyPokemon = selectTeamPokemons("Selecciona los pokemon para el equipo enemigo!!");

		setLayout(null);

		if (true != allyPokemon.isEmpty() && true != enemyPokemon.isEmpty()) {

			JLabel enemyLifeBar = new JLabel(enemyPokemon.get(0).getPokemonHP()+"");
			enemyLifeBar.setBounds(120, 56, 139, 14);
			add(enemyLifeBar);
			
			JLabel allyLifeBar = new JLabel(allyPokemon.get(0).getPokemonHP()+"");
			allyLifeBar.setBounds(626, 353, 139, 14);
			add(allyLifeBar);

			
			if (null != allyPokemon.get(0).getPokemonAttack1()) {
				attackBtn_1 = new JLabel(allyPokemon.get(0).getPokemonAttack1().getAttackName());
				attackBtn_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					}
				});
				attackBtn_1.setHorizontalAlignment(SwingConstants.CENTER);
				attackBtn_1.setForeground(Color.RED);
				attackBtn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				attackBtn_1.setBounds(68, 463, 163, 55);
				add(attackBtn_1);
				attackBtn_1.setVisible(false);
			}

			if (null != allyPokemon.get(0).getPokemonAttack2()) {
				attackBtn_2 = new JLabel(allyPokemon.get(0).getPokemonAttack2().getAttackName());
				attackBtn_2.addMouseListener(new MouseAdapter() {
					@Override
					  public void mouseClicked(MouseEvent e) {
		                long dealtAttack = new AttackManager().calculateAttackDamage(allyPokemon.get(0).getPokemonAttack2(), enemyPokemon.get(0), allyPokemon.get(0));
		                if (dealtAttack > 0) {
		                    pokemonLife(enemyPokemon.get(0), dealtAttack);
//		                    startFight();
		                } else {
						}
					
					}
				});
				attackBtn_2.setHorizontalAlignment(SwingConstants.CENTER);
				attackBtn_2.setForeground(Color.RED);
				attackBtn_2.setFont(new Font("Tahoma", Font.BOLD, 20));
				attackBtn_2.setBounds(68, 530, 163, 55);
				add(attackBtn_2);
				attackBtn_2.setVisible(false);
			}

			if (null != allyPokemon.get(0).getPokemonAttack3()) {
				attackBtn_3 = new JLabel(allyPokemon.get(0).getPokemonAttack3().getAttackName());
				attackBtn_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					}
				});
				attackBtn_3.setHorizontalAlignment(SwingConstants.CENTER);
				attackBtn_3.setForeground(Color.RED);
				attackBtn_3.setFont(new Font("Tahoma", Font.BOLD, 20));
				attackBtn_3.setBounds(337, 530, 163, 55);
				add(attackBtn_3);
				attackBtn_3.setVisible(false);
			}

			if (null != allyPokemon.get(0).getPokemonAttack4()) {
				attackBtn_4 = new JLabel(allyPokemon.get(0).getPokemonAttack4().getAttackName());
				attackBtn_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					}
				});
				attackBtn_4.setHorizontalAlignment(SwingConstants.CENTER);
				attackBtn_4.setForeground(Color.RED);
				attackBtn_4.setFont(new Font("Tahoma", Font.BOLD, 20));
				attackBtn_4.setBounds(337, 463, 163, 55);
				add(attackBtn_4);
				attackBtn_4.setVisible(false);
			}

			enemyPokemonLifeBarName = new JLabel(enemyPokemon.get(0).getPokemonName());
			enemyPokemonLifeBarName.setHorizontalAlignment(SwingConstants.CENTER);
			enemyPokemonLifeBarName.setFont(new Font("Tahoma", Font.BOLD, 18));
			enemyPokemonLifeBarName.setBounds(-10, 11, 163, 37);
			add(enemyPokemonLifeBarName);

			allyPokemonLifeBarName = new JLabel(allyPokemon.get(0).getPokemonName());
			allyPokemonLifeBarName.setFont(new Font("Tahoma", Font.BOLD, 18));
			allyPokemonLifeBarName.setHorizontalAlignment(SwingConstants.CENTER);
			allyPokemonLifeBarName.setBounds(510, 316, 163, 37);
			add(allyPokemonLifeBarName);

			scaledEnemyIcon = new ImageIcon(
					enemyPokemon.get(0).getPokemonFront().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));

			enemySprite = new JLabel("");
			enemySprite.setIcon(scaledEnemyIcon);
			enemySprite.setBounds(432, 106, 164, 145);
			add(enemySprite);

			scaledAllyIcon = new ImageIcon(
					allyPokemon.get(0).getPokemonBack().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));

			allySprite = new JLabel("");
			allySprite.setIcon(scaledAllyIcon);
			allySprite.setBounds(136, 298, 164, 145);
			add(allySprite);

			decissionTextLbl = new JLabel("¿Que deberia hacer " + allyPokemon.get(0).getPokemonName() + "?");
			decissionTextLbl.setForeground(new Color(255, 255, 255));
			decissionTextLbl.setHorizontalAlignment(SwingConstants.CENTER);
			decissionTextLbl.setFont(new Font("Tahoma", Font.BOLD, 24));
			decissionTextLbl.setBounds(10, 443, 458, 157);
			add(decissionTextLbl);
		} else {
			JOptionPane.showMessageDialog(null, "No se han escogido pokemons para el equipo", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
		
		JLabel allyPokemonLifeBarLbl = new JLabel("");
		allyPokemonLifeBarLbl.setBounds(488, 306, 299, 111);
		allyPokemonLifeBarLbl.setIcon(new ImageIcon("contents/pokemonStatus/pokemonLifeBar.png"));
		add(allyPokemonLifeBarLbl);

		JLabel enemyLifeBarLbl = new JLabel("");
		enemyLifeBarLbl.setBounds(0, 11, 299, 80);
		enemyLifeBarLbl.setIcon(new ImageIcon("contents/pokemonStatus/enemyLifeBar.png"));
		add(enemyLifeBarLbl);

		JLabel itemBtn = new JLabel("Objetos");
		itemBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		itemBtn.setHorizontalAlignment(SwingConstants.CENTER);
		itemBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		itemBtn.setBounds(667, 530, 133, 55);
		add(itemBtn);

		JLabel swapBtn = new JLabel("Cambiar");
		swapBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		swapBtn.setHorizontalAlignment(SwingConstants.CENTER);
		swapBtn.setForeground(new Color(237, 230, 80));
		swapBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		swapBtn.setBounds(652, 463, 133, 55);
		add(swapBtn);

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

		JLabel backBtn = new JLabel("Atras");
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				decissionTextLbl.setVisible(true);
				itemBtn.setVisible(true);
				swapBtn.setVisible(true);
				defendBtn.setVisible(true);
				attackBtn.setVisible(true);
				if (attackBtn_1 != null && attackBtn_1.getText() != null)
					attackBtn_1.setVisible(false);
				if (attackBtn_2 != null && attackBtn_2.getText() != null)
					attackBtn_2.setVisible(false);
				if (attackBtn_3 != null && attackBtn_3.getText() != null)
					attackBtn_3.setVisible(false);
				if (attackBtn_4 != null && attackBtn_4.getText() != null)
					attackBtn_4.setVisible(false);
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
				if (attackBtn_1 != null && attackBtn_1.getText() != null)
					attackBtn_1.setVisible(true);
				if (attackBtn_2 != null && attackBtn_2.getText() != null)
					attackBtn_2.setVisible(true);
				if (attackBtn_3 != null && attackBtn_3.getText() != null)
					attackBtn_3.setVisible(true);
				if (attackBtn_4 != null && attackBtn_4.getText() != null)
					attackBtn_4.setVisible(true);
				backBtn.setVisible(true);

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
	
	private void pokemonLife(Pokemon enemyPokemon, long dealtAttack) {
		long pokemonLife = enemyPokemon.getPokemonHP() - dealtAttack;
	}
}