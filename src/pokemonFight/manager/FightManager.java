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
		gamePanel.enemyPokemonLifeBar = new JProgressBar(0, gamePanel.enemyPokemonTeam.get(0).getPokemonHP());
		gamePanel.allyPokemonLifeBar = new JProgressBar(0, gamePanel.allyPokemonTeam.get(0).getPokemonHP());
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

				while (continueBattle) {
					SwingUtilities.invokeLater(() -> handleTurn(turn));
					if (battleEnded()) {
						continueBattle = false;
					}
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				return null;
			}
		};
		battleWorker.execute();
	}

	private void handleTurn(boolean isAllyTurn) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				if (isAllyTurn) {
					setupAttackButtons(allyPokemonTeam.get(0), isAllyTurn);
				} else {
					setupAttackButtons(enemyPokemonTeam.get(0), isAllyTurn);
				}

				if (isAllyTurn) {
					refreshOverlayData(allyPokemonTeam, true);
				} else {
					refreshOverlayData(enemyPokemonTeam, false);
				}
			}
		});
	}

	private void setupAttackButtons(Pokemon pokemon, boolean isAlly) {
		removeAllMouseListeners(gamePanel.attackBtn_1);
		removeAllMouseListeners(gamePanel.attackBtn_2);
		removeAllMouseListeners(gamePanel.attackBtn_3);
		removeAllMouseListeners(gamePanel.attackBtn_4);
		removeAllMouseListeners(gamePanel.swapBtn);

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
		gamePanel.swapBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (isAlly)
					allyPokemonTeam = gamePanel.changePokemon(allyPokemonTeam);
				else
					enemyPokemonTeam = gamePanel.changePokemon(enemyPokemonTeam);

				turn = !turn;
			}
		});
	}

	private void removeAllMouseListeners(JLabel label) {
		for (MouseListener ml : label.getMouseListeners()) {
			label.removeMouseListener(ml);
		}
	}

	private boolean battleEnded() {
		if (enemyPokemonTeam.get(0).getPokemonHP() <= 0) {
			if (enemyPokemonTeam.size() > 1) {
				enemyPokemonTeam.remove(0);
				gamePanel.changePokemon(enemyPokemonTeam);
				refreshOverlayData(allyPokemonTeam, false);
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
				refreshOverlayData(allyPokemonTeam, true);
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
			gamePanel.allyPokemonLifeBar = new JProgressBar(0, team.get(0).getPokemonHP());
			gamePanel.allyPokemonName.setText(team.get(0).getPokemonName());
			gamePanel.allyLvlLbl.setText(team.get(0).getPokemonLvl() + "");
			gamePanel.decissionTextLbl.setText("¿Qué debería hacer " + team.get(0).getPokemonName() + "?");
			gamePanel.scaledAllyIcon = new ImageIcon(team.get(0).getPokemonBack().getScaledInstance(gamePanel.newWidth,
					gamePanel.newHeight, Image.SCALE_SMOOTH));
			gamePanel.allySprite.setIcon(gamePanel.scaledAllyIcon);
		} else {
			gamePanel.enemyPokemonLifeBar = new JProgressBar(0, team.get(0).getPokemonHP());
			gamePanel.enemyPokemonName.setText(team.get(0).getPokemonName());
			gamePanel.enemyLvlLbl.setText(team.get(0).getPokemonLvl() + "");
			gamePanel.decissionTextLbl.setText("¿Qué debería hacer " + team.get(0).getPokemonName() + "?");
			gamePanel.scaledEnemyIcon = new ImageIcon(team.get(0).getPokemonFront()
					.getScaledInstance(gamePanel.newWidth, gamePanel.newHeight, Image.SCALE_SMOOTH));
			gamePanel.enemySprite.setIcon(gamePanel.scaledEnemyIcon);
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
			JOptionPane.showMessageDialog(null, pokemonAttack.getAttackName() + " ha hecho " + dealtAttack + " de daño!",
					"Ataque acertado", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,dealtAttack + " ha fallado!", "Ataque fallido",
					JOptionPane.ERROR_MESSAGE);
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

		long baseDamage = Math.round(usedAttack.getAttackPotency()
				+ (attackingPokemon.getPokemonLvl()*0.01 + attackingPokemon.getPokemonAttackStat() * 0.01)
				- (deffensorPokemon.getPokemonDefense() + deffensorPokemon.getPokemonLvl() * 0.01));

		return baseDamage;
	}
}