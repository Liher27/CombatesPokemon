package pokemonFight.manager;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import pokemonFight.manager.pojo.Attack;
import pokemonFight.manager.pojo.Pokemon;
import pokemonFight.view.GamePanel;

public class FightManager {

	GamePanel gamePanel = StatusSingleton.getInstance().getGamePanel();
	private List<Pokemon> allyPokemonTeam = gamePanel.allyPokemonTeam;
	private List<Pokemon> enemyPokemonTeam = gamePanel.enemyPokemonTeam;

	public void loadInfo() throws NullPointerException, IOException, Exception {
		gamePanel.enemyPokemonLifeBar = new JProgressBar(0, gamePanel.enemyPokemonTeam.get(0).getPokemonHP());
		gamePanel.allyPokemonLifeBar = new JProgressBar(0, gamePanel.allyPokemonTeam.get(0).getPokemonHP());
		gamePanel.enemyLvlLbl.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.allyLvlLbl.setText(gamePanel.allyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.enemyPokemonName.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonName());
		gamePanel.allyPokemonName.setText(gamePanel.allyPokemonTeam.get(0).getPokemonName());
		new ImageManager().loadImages();
	}

	public void trainerBattle() {
		boolean turn = allyPokemonTeam.get(0).getPokemonSpeed() >= enemyPokemonTeam.get(0).getPokemonSpeed();
		boolean continueBattle = true;
		while (continueBattle) {
			if (turn) {
				if (null != allyPokemonTeam.get(0).getPokemonAttack1()) {
					gamePanel.attackBtn_1.setText(allyPokemonTeam.get(0).getPokemonAttack1().getAttackName());
					gamePanel.attackBtn_1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							doDamageToEnemy(allyPokemonTeam.get(0).getPokemonAttack1());
						}

					});
				}
				if (null != allyPokemonTeam.get(0).getPokemonAttack2()) {
					gamePanel.attackBtn_2.setText(allyPokemonTeam.get(0).getPokemonAttack2().getAttackName());
					gamePanel.attackBtn_2.addMouseListener(new MouseAdapter() {

						@Override
						public void mouseClicked(MouseEvent e) {
							doDamageToEnemy(allyPokemonTeam.get(0).getPokemonAttack2());
						}
					});
				}
				if (null != allyPokemonTeam.get(0).getPokemonAttack3()) {
					gamePanel.attackBtn_3.setText(allyPokemonTeam.get(0).getPokemonAttack3().getAttackName());
					gamePanel.attackBtn_3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							doDamageToEnemy(allyPokemonTeam.get(0).getPokemonAttack3());
						}
					});
				}
				if (null != allyPokemonTeam.get(0).getPokemonAttack4()) {
					gamePanel.attackBtn_4.setText(allyPokemonTeam.get(0).getPokemonAttack4().getAttackName());
					gamePanel.attackBtn_4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							doDamageToEnemy(allyPokemonTeam.get(0).getPokemonAttack4());
						}
					});
				}
				if (enemyPokemonTeam.get(0).getPokemonHP() > 0) {
					turn = false;
				}

				else if (enemyPokemonTeam.size() > 1) {
					enemyPokemonTeam.remove(0);
					gamePanel.changePokemon(enemyPokemonTeam);
					turn = false;
				}

				else {
					JOptionPane.showMessageDialog(null, "El equipo local ha ganado el combate!!!", "Enhorabuena!!!",
							JOptionPane.INFORMATION_MESSAGE);
					turn = false;
				}
			}
			///////////////////////// TURNO DEL POKEMON
			///////////////////////// VISITANTE////////////////////////////////////////////
			else if (!turn) {
				if (null != enemyPokemonTeam.get(0).getPokemonAttack1()) {
					gamePanel.attackBtn_1.setText(enemyPokemonTeam.get(0).getPokemonAttack1().getAttackName());
					gamePanel.attackBtn_1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
//							doDamage(enemyPokemonTeam.get(0).getPokemonAttack1());
						}

					});
				}
				if (null != enemyPokemonTeam.get(0).getPokemonAttack2()) {
					gamePanel.attackBtn_2.setText(enemyPokemonTeam.get(0).getPokemonAttack2().getAttackName());
					gamePanel.attackBtn_2.addMouseListener(new MouseAdapter() {

						@Override
						public void mouseClicked(MouseEvent e) {
//							doDamage(enemyPokemonTeam.get(0).getPokemonAttack2());
						}
					});
				}
				if (null != enemyPokemonTeam.get(0).getPokemonAttack3()) {
					gamePanel.attackBtn_3.setText(enemyPokemonTeam.get(0).getPokemonAttack3().getAttackName());
					gamePanel.attackBtn_3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
//							doDamage(enemyPokemonTeam.get(0).getPokemonAttack3());
						}
					});
				}
				if (null != enemyPokemonTeam.get(0).getPokemonAttack4()) {
					gamePanel.attackBtn_4.setText(enemyPokemonTeam.get(0).getPokemonAttack4().getAttackName());
					gamePanel.attackBtn_4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
//							doDamage(enemyPokemonTeam.get(0).getPokemonAttack4());
						}
					});
				}
				// DEJAR AL USUARIO ATACAR

				if (allyPokemonTeam.get(0).getPokemonHP() > 0) {
					turn = false;
				}

				else if (allyPokemonTeam.size() > 1) {
					allyPokemonTeam.remove(0);
					gamePanel.changePokemon(allyPokemonTeam);
					refreshAllyOverlayData(allyPokemonTeam);
					turn = false;
				}

				else {
					JOptionPane.showMessageDialog(null, "El equipo visitante ha ganado el combate!!!", "Enhorabuena!!!",
							JOptionPane.INFORMATION_MESSAGE);
					continueBattle = false;
				}
			}
		}
	}

	/**
	 * Refresca la pantalla con nueva información de los pokemon.
	 * 
	 * @param allyPokemonTeam
	 */
	public void refreshAllyOverlayData(List<Pokemon> team) {
		gamePanel.allyPokemonLifeBar = new JProgressBar(0, team.get(0).getPokemonHP());
		gamePanel.allyPokemonName.setText(team.get(0).getPokemonName());
		gamePanel.allyLvlLbl.setText(team.get(0).getPokemonLvl() + "");
		gamePanel.decissionTextLbl.setText("¿Que deberia hacer " + team.get(0).getPokemonName() + "?");
		if (null != allyPokemonTeam.get(0).getPokemonAttack1())
			gamePanel.attackBtn_1.setText(allyPokemonTeam.get(0).getPokemonAttack1().getAttackName());
		else
			gamePanel.attackBtn_1.setText("");
		if (null != allyPokemonTeam.get(0).getPokemonAttack2())
			gamePanel.attackBtn_2.setText(allyPokemonTeam.get(0).getPokemonAttack2().getAttackName());
		else
			gamePanel.attackBtn_2.setText("");
		if (null != allyPokemonTeam.get(0).getPokemonAttack3())
			gamePanel.attackBtn_3.setText(allyPokemonTeam.get(0).getPokemonAttack3().getAttackName());
		else
			gamePanel.attackBtn_3.setText("");
		if (null != allyPokemonTeam.get(0).getPokemonAttack4())
			gamePanel.attackBtn_4.setText(allyPokemonTeam.get(0).getPokemonAttack4().getAttackName());
		else
			gamePanel.attackBtn_4.setText("");

		gamePanel.scaledAllyIcon = new ImageIcon(
				allyPokemonTeam.get(0).getPokemonBack().getScaledInstance(gamePanel.newWidth, gamePanel.newHeight, Image.SCALE_SMOOTH));
		gamePanel.allySprite.setIcon(gamePanel.scaledAllyIcon);
	}
	
	public void refreshEnemyOverlayData(List<Pokemon> team) {
		gamePanel.enemyPokemonLifeBar = new JProgressBar(0, team.get(0).getPokemonHP());
		gamePanel.enemyPokemonName.setText(team.get(0).getPokemonName());
		gamePanel.enemyLvlLbl.setText(team.get(0).getPokemonLvl() + "");
		gamePanel.decissionTextLbl.setText("¿Que deberia hacer " + team.get(0).getPokemonName() + "?");
		if (null != enemyPokemonTeam.get(0).getPokemonAttack1())
			gamePanel.attackBtn_1.setText(enemyPokemonTeam.get(0).getPokemonAttack1().getAttackName());
		else
			gamePanel.attackBtn_1.setText("");
		if (null != enemyPokemonTeam.get(0).getPokemonAttack2())
			gamePanel.attackBtn_2.setText(enemyPokemonTeam.get(0).getPokemonAttack2().getAttackName());
		else
			gamePanel.attackBtn_2.setText("");
		if (null != enemyPokemonTeam.get(0).getPokemonAttack3())
			gamePanel.attackBtn_3.setText(enemyPokemonTeam.get(0).getPokemonAttack3().getAttackName());
		else
			gamePanel.attackBtn_3.setText("");
		if (null != enemyPokemonTeam.get(0).getPokemonAttack4())
			gamePanel.attackBtn_4.setText(enemyPokemonTeam.get(0).getPokemonAttack4().getAttackName());
		else
			gamePanel.attackBtn_4.setText("");

		gamePanel.scaledEnemyIcon = new ImageIcon(
				enemyPokemonTeam.get(0).getPokemonBack().getScaledInstance(gamePanel.newWidth, gamePanel.newHeight, Image.SCALE_SMOOTH));
		gamePanel.enemySprite.setIcon(gamePanel.scaledEnemyIcon);
	}
	
	private void doDamageToEnemy(Attack pokemonAttack) {
		long dealtAttack = calculateAttackDamage(pokemonAttack, gamePanel.combat.get(1), gamePanel.combat.get(0));
		if (dealtAttack > 0) {
			calculatePokemonLife(dealtAttack);
		} else {
			JOptionPane.showMessageDialog(null, "El ataque ha fallado!!!", "Mala suerte...", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void calculatePokemonLife(long dealtAttack) {
		int newHealth = gamePanel.enemyPokemonLifeBar.getValue() - (int) dealtAttack;
		gamePanel.enemyPokemonLifeBar.setValue(newHealth);
		gamePanel.enemyPokemonLifeBar.repaint();
		gamePanel.enemyPokemon.setPokemonHP(newHealth);
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