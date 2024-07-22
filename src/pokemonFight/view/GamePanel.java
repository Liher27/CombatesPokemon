package pokemonFight.view;

import javax.swing.JPanel;

import pokemonFight.manager.ImageManager;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase en la que se crea el panel
 */
public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor de la clase GamePanel
	 */
	public GamePanel() {

		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(new Color(255, 255, 255));
		this.setDoubleBuffered(true); // opcional, es para un mejor renderizado de los graficos del panel
		this.setFocusable(true);
		setLayout(null);
		
		JLabel allyPokemonLifeBarLbl = new JLabel("");
		allyPokemonLifeBarLbl.setBounds(488, 307, 299, 111);
		allyPokemonLifeBarLbl.setIcon(new ImageIcon("contents/pokemonStatus/pokemonLifeBar2.png"));
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
		
		JLabel decissionTextLbl = new JLabel("¿Que deberia hacer " + //nombre del pokemon
				"?");
		decissionTextLbl.setForeground(new Color(255, 255, 255));
		decissionTextLbl.setHorizontalAlignment(SwingConstants.CENTER);
		decissionTextLbl.setFont(new Font("Tahoma", Font.BOLD, 24));
		decissionTextLbl.setBounds(10, 443, 458, 157);
		add(decissionTextLbl);
		
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
		
	}
	
	public ImageIcon getBackgroundImage() {
		ImageIcon background = null;
		List<ImageIcon> backgrounds = new ArrayList<>();
		Random randomNumberToExecute = new Random();
		int randomBackground = (randomNumberToExecute.nextInt(5) + 1);
		backgrounds = new ImageManager().getBackgrounds();
		background = backgrounds.get(randomBackground);
		return background;
		}

	}
