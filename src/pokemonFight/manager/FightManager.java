package pokemonFight.manager;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import pokemonFight.manager.pojo.Attack;
import pokemonFight.manager.pojo.Pokemon;
import pokemonFight.view.GamePanel;

public class FightManager {

	GamePanel gamePanel = StatusSingleton.getInstance().getGamePanel();
	private List<Pokemon> allyPokemonTeam = gamePanel.allyPokemonTeam;
	private List<Pokemon> enemyPokemonTeam = gamePanel.enemyPokemonTeam;
	boolean turn = allyPokemonTeam.get(0).getPokemonSpeed() >= enemyPokemonTeam.get(0).getPokemonSpeed();
	public SwingWorker<Void, Void> battleWorker;

	public void loadInfo() throws NullPointerException, IOException, Exception {
		gamePanel.allyPokemonLifeBar.setMaximum(allyPokemonTeam.get(0).getPokemonHP());
		gamePanel.allyPokemonLifeBar.setValue(allyPokemonTeam.get(0).getPokemonHP());
		gamePanel.enemyPokemonLifeBar.setMaximum(enemyPokemonTeam.get(0).getPokemonHP());
		gamePanel.enemyPokemonLifeBar.setValue(enemyPokemonTeam.get(0).getPokemonHP());
		gamePanel.enemyLvlLbl.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.allyLvlLbl.setText(gamePanel.allyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.enemyPokemonName.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonName());
		gamePanel.allyPokemonName.setText(gamePanel.allyPokemonTeam.get(0).getPokemonName());
		new ImageManager().loadImages();
	}

	public void trainerBattle() {
		battleWorker = new SwingWorker<Void, Void>() {
			@Override
			protected Void doInBackground() {
				boolean continueBattle = true;

				do {
					SwingUtilities.invokeLater(() -> handleTurn(turn));
					if (battleEnded()) {
						continueBattle = false;
					}
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} while (continueBattle);
				return null;
			}
		};
		battleWorker.execute();
	}

	private void handleTurn(boolean isAllyTurn) {
		if (isAllyTurn) {
			gamePanel.decissionTextLbl.setText("¿Qué debería hacer " + allyPokemonTeam.get(0).getPokemonName() + "?");
			setupAttackButtons(allyPokemonTeam.get(0), isAllyTurn);
		} else {
			gamePanel.decissionTextLbl.setText("¿Qué debería hacer " + enemyPokemonTeam.get(0).getPokemonName() + "?");
			setupAttackButtons(enemyPokemonTeam.get(0), isAllyTurn);
		}
	}

	private void setupAttackButtons(Pokemon pokemon, boolean isAlly) {
		JLabel[] buttonList = { gamePanel.attackBtn_1, gamePanel.attackBtn_2, gamePanel.attackBtn_3,
				gamePanel.attackBtn_4, gamePanel.swapBtn, gamePanel.defendBtn };
		removeAllMouseListeners(buttonList);

		if (pokemon.getPokemonAttack1() != null) {
			gamePanel.attackBtn_1.setText(pokemon.getPokemonAttack1().getAttackName());
			gamePanel.attackBtn_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					doDamage(pokemon.getPokemonAttack1(), isAlly);
					turn = !turn;
				}
			});
		} else
			gamePanel.attackBtn_1.setText("");

		if (pokemon.getPokemonAttack2() != null) {
			gamePanel.attackBtn_2.setText(pokemon.getPokemonAttack2().getAttackName());
			gamePanel.attackBtn_2.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					doDamage(pokemon.getPokemonAttack2(), isAlly);
					turn = !turn;
				}
			});
		} else
			gamePanel.attackBtn_2.setText("");

		if (pokemon.getPokemonAttack3() != null) {
			gamePanel.attackBtn_3.setText(pokemon.getPokemonAttack3().getAttackName());
			gamePanel.attackBtn_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					doDamage(pokemon.getPokemonAttack3(), isAlly);
					turn = !turn;
				}
			});
		} else
			gamePanel.attackBtn_3.setText("");

		if (pokemon.getPokemonAttack4() != null)

		{
			gamePanel.attackBtn_4.setText(pokemon.getPokemonAttack4().getAttackName());
			gamePanel.attackBtn_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					doDamage(pokemon.getPokemonAttack4(), isAlly);
					turn = !turn;
				}
			});
		} else
			gamePanel.attackBtn_4.setText("");

		gamePanel.defendBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				handleDefense(isAlly);
				turn = !turn;
			}
		});

		gamePanel.swapBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (isAlly && allyPokemonTeam.size() > 1 || !isAlly && enemyPokemonTeam.size() > 1) {
					if (isAlly) {
						allyPokemonTeam = gamePanel.changePokemon(allyPokemonTeam);
						refreshOverlayData(allyPokemonTeam, isAlly);
					} else {
						enemyPokemonTeam = gamePanel.changePokemon(enemyPokemonTeam);
						refreshOverlayData(enemyPokemonTeam, isAlly);
					}
				} else {
					writeLog(isAlly, "No quedan pokemon en tu equipo...!!! \n");
				}
			}

		});
	}

	private void removeAllMouseListeners(JLabel[] buttonList) {
		for (int i = 0; i < buttonList.length; i++) {
			for (MouseListener ml : buttonList[i].getMouseListeners()) {
				buttonList[i].removeMouseListener(ml);
			}
		}
	}

	private boolean battleEnded() {
		if (enemyPokemonTeam.get(0).getPokemonHP() <= 0) {
			if (enemyPokemonTeam.size() > 1) {
				enemyPokemonTeam.remove(0);
				gamePanel.changePokemon(enemyPokemonTeam);
				refreshOverlayData(allyPokemonTeam, turn);
				turn = !turn;
			} else {
				JOptionPane.showMessageDialog(null, "El equipo local ha ganado el combate!!!", "Enhorabuena!!!",
						JOptionPane.INFORMATION_MESSAGE);
				return true;
			}
		}

		if (allyPokemonTeam.get(0).getPokemonHP() <= 0) {
			if (allyPokemonTeam.size() > 1) {
				allyPokemonTeam.remove(0);
				gamePanel.changePokemon(allyPokemonTeam);
				refreshOverlayData(allyPokemonTeam, turn);
				turn = !turn;
			} else {
				JOptionPane.showMessageDialog(null, "El equipo visitante ha ganado el combate!!!", "Enhorabuena!!!",
						JOptionPane.INFORMATION_MESSAGE);
				return true;
			}
		}
		return false;
	}

	/**
	 * Refresca la pantalla con nueva información de los pokemon.
	 * 
	 * @param allyPokemonTeam
	 */
	public void refreshOverlayData(List<Pokemon> team, boolean ally) {
		if (ally) {
			gamePanel.allyPokemonLifeBar.setMaximum(team.get(0).getPokemonHP());
			gamePanel.allyPokemonLifeBar.setMinimum(0);
			gamePanel.allyPokemonLifeBar.repaint();
			gamePanel.allyPokemonName.setText(team.get(0).getPokemonName());
			gamePanel.allyLvlLbl.setText(String.valueOf(team.get(0).getPokemonLvl()));
			gamePanel.decissionTextLbl.setText("¿Qué debería hacer " + team.get(0).getPokemonName() + "?");
			gamePanel.scaledAllyIcon = new ImageIcon(team.get(0).getPokemonBack().getScaledInstance(gamePanel.newWidth,
					gamePanel.newHeight, Image.SCALE_SMOOTH));
			gamePanel.allySprite.setIcon(gamePanel.scaledAllyIcon);
			turn = !turn;
		} else {
			gamePanel.enemyPokemonLifeBar.setMaximum(team.get(0).getPokemonHP());
			gamePanel.enemyPokemonLifeBar.setMinimum(0);
			gamePanel.enemyPokemonLifeBar.repaint();
			gamePanel.enemyPokemonName.setText(team.get(0).getPokemonName());
			gamePanel.enemyLvlLbl.setText(String.valueOf(team.get(0).getPokemonLvl()));
			gamePanel.decissionTextLbl.setText("¿Qué debería hacer " + team.get(0).getPokemonName() + "?");
			gamePanel.scaledEnemyIcon = new ImageIcon(team.get(0).getPokemonFront()
					.getScaledInstance(gamePanel.newWidth, gamePanel.newHeight, Image.SCALE_SMOOTH));
			gamePanel.enemySprite.setIcon(gamePanel.scaledEnemyIcon);
			turn = !turn;
		}
	}

	private void doDamage(Attack pokemonAttack, boolean ally) {
		long dealtAttack = 0;
		Pokemon targetPokemon = null;
		Pokemon attackingPokemon = null;
		if (ally) {
			attackingPokemon = gamePanel.allyPokemonTeam.get(0);
			targetPokemon = gamePanel.enemyPokemonTeam.get(0);
		} else {
			attackingPokemon = gamePanel.enemyPokemonTeam.get(0);
			targetPokemon = gamePanel.allyPokemonTeam.get(0);
		}

		dealtAttack = calculateAttackDamage(pokemonAttack, targetPokemon, attackingPokemon);

		if (dealtAttack > 0) {
			calculatePokemonLife(dealtAttack, ally);
			writeLog(ally, (pokemonAttack.getAttackName() + " ha hecho " + dealtAttack + " de daño! \n"));
		} else {
			writeLog(ally, (pokemonAttack.getAttackName() + " ha fallado! \n"));
		}
	}

	private void calculatePokemonLife(long dealtAttack, boolean isAlly) {
		int newHealth = 0;
		if (isAlly) {
			newHealth = enemyPokemonTeam.get(0).getPokemonHP() - (int) dealtAttack;
			enemyPokemonTeam.get(0).setPokemonHP(newHealth);
			gamePanel.enemyPokemonLifeBar.setValue(newHealth);
			gamePanel.enemyPokemonLifeBar.revalidate();
			gamePanel.enemyPokemonLifeBar.repaint();
		} else {
			newHealth = allyPokemonTeam.get(0).getPokemonHP() - (int) dealtAttack;
			allyPokemonTeam.get(0).setPokemonHP(newHealth);
			gamePanel.allyPokemonLifeBar.setValue(newHealth);
			gamePanel.allyPokemonLifeBar.revalidate();
			gamePanel.allyPokemonLifeBar.repaint();
		}
	}

	private long calculateAttackDamage(Attack usedAttack, Pokemon deffensorPokemon, Pokemon attackingPokemon) {
		boolean hit = new Random().nextInt(100) < usedAttack.getAttackPrecission();
		if (!hit)
			return 0;

		long baseDamage = Math.round((((0.2 * attackingPokemon.getPokemonLvl() + 1) * usedAttack.getAttackPotency()
				* attackingPokemon.getPokemonAttackStat()) / (25 * deffensorPokemon.getPokemonDefense() + 2)));

		return baseDamage;
	}

	private void handleDefense(boolean isAlly) {
		if (isAlly) {
			int defenseUp = (int) (allyPokemonTeam.get(0).getPokemonDefense() * 1.75);
			allyPokemonTeam.get(0).setPokemonDefense(defenseUp);
		} else {
			int defenseUp = (int) (enemyPokemonTeam.get(0).getPokemonDefense() * 1.75);
			enemyPokemonTeam.get(0).setPokemonDefense(defenseUp);
		}
		writeLog(isAlly, "Tu defensa ha aumentado!!! \n");

	}

	private void writeLog(boolean isAlly, String log) {
		if (isAlly) {
			gamePanel.textArea.setText("");
			gamePanel.textArea.append(log);
		} else {
			gamePanel.enemyTextArea.setText("");
			gamePanel.enemyTextArea.append(log);
		}

	}
}