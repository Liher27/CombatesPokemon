package pokemonFight.manager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import pokemonFight.manager.pojo.Attack;
import pokemonFight.manager.pojo.Pokemon;
import pokemonFight.view.GamePanel;

public class FightManager {

	GamePanel gamePanel = StatusSingleton.getInstance().getGamePanel();
	List<Pokemon> combat = gamePanel.combat;

	public void loadInfo() throws NullPointerException, IOException, Exception {
		gamePanel.enemyPokemonLifeBar = new JProgressBar(0, gamePanel.enemyPokemonTeam.get(0).getPokemonHP());
		gamePanel.allyPokemonLifeBar = new JProgressBar(0, gamePanel.allyPokemonTeam.get(0).getPokemonHP());
		gamePanel.enemyLvlLbl.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.allyLvlLbl.setText(gamePanel.allyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.enemyPokemonName.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonName());
		gamePanel.allyPokemonName.setText(gamePanel.allyPokemonTeam.get(0).getPokemonName());
		new ImageManager().loadImages();
	}

	public void startCombat() {

		combat = calculateTurn(combat);
		boolean continueBattle = true;
		while (continueBattle) {
			if (combat.get(0).getPokemonSpeed() > combat.get(1).getPokemonSpeed()) {
				if (null != combat.get(0).getPokemonAttack1()) {
					gamePanel.attackBtn_1.setText(combat.get(0).getPokemonAttack1().getAttackName());
					gamePanel.attackBtn_1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							doDamage(combat.get(0).getPokemonAttack1());
						}

					});
				}
				if (null != combat.get(0).getPokemonAttack2()) {
					gamePanel.attackBtn_2.setText(combat.get(0).getPokemonAttack2().getAttackName());
					gamePanel.attackBtn_2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							doDamage(combat.get(0).getPokemonAttack2());
						}
					});
				}
				if (null != combat.get(0).getPokemonAttack3()) {
					gamePanel.attackBtn_3.setText(combat.get(0).getPokemonAttack3().getAttackName());
					gamePanel.attackBtn_3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							doDamage(combat.get(0).getPokemonAttack3());
						}
					});
				}
				if (null != combat.get(0).getPokemonAttack4()) {
					gamePanel.attackBtn_4.setText(combat.get(0).getPokemonAttack4().getAttackName());
					gamePanel.attackBtn_4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							doDamage(combat.get(0).getPokemonAttack4());
						}
					});
				}

				if (combat.get(1).getPokemonHP() > 0) {
					Collections.swap(combat, 0, 1);
					if (combat.get(0).getPokemonHP() == 0) {
						JOptionPane.showMessageDialog(null, combat.get(0).getPokemonName() + " Ha muerto!!",
								"Mala suerte...", JOptionPane.ERROR_MESSAGE);
					}
				}
				if (gamePanel.allyPokemonTeam.size() == 0 || gamePanel.enemyPokemonTeam.size() == 0)
					continueBattle = false;
			}
		break;}
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

	private void doDamage(Attack pokemonAttack) {
		System.out.println("Mensajillo de atake!!! ^^" + pokemonAttack.getAttackName());
		long dealtAttack = calculateAttackDamage(pokemonAttack, gamePanel.combat.get(1), gamePanel.combat.get(0));
		if (dealtAttack > 0) {
//			calculatePokemonLife(dealtAttack);
		} else {
			JOptionPane.showMessageDialog(null, "El ataque ha fallado!!!", "Mala suerte...", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void calculatePokemonLife(long dealtAttack) {
//		int newHealth = enemyPokemonLifeBar.getValue() - (int) dealtAttack;
//		enemyPokemonLifeBar.setValue(newHealth);
//		enemyPokemonLifeBar.repaint();
//		enemyPokemon.setPokemonHP(newHealth);
	}

	private long calculateAttackDamage(Attack usedAttack, Pokemon deffensorPokemon, Pokemon attackingPokemon) {
		long baseDamage = Math.round(usedAttack.getAttackPotency()
				+ (attackingPokemon.getPokemonLvl() + attackingPokemon.getPokemonAttackStat() * 0.01)
				- (deffensorPokemon.getPokemonDefense() + deffensorPokemon.getPokemonLvl() * 0.1));

		boolean hit = new Random().nextInt(100) < usedAttack.getAttackPrecission();
		if (!hit) {
			baseDamage = 0;
		}
		return baseDamage;
	}
}