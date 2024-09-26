package pokemonFight.manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JProgressBar;

import pokemonFight.manager.pojo.Attack;
import pokemonFight.manager.pojo.Pokemon;
import pokemonFight.view.GamePanel;

public class FightManager {

	GamePanel gamePanel = StatusSingleton.getInstance().getGamePanel();

	public void loadInfo() throws NullPointerException, IOException, Exception {
		gamePanel.enemyPokemonLifeBar = new JProgressBar(0, gamePanel.enemyPokemonTeam.get(0).getPokemonHP());
		gamePanel.allyPokemonLifeBar = new JProgressBar(0, gamePanel.allyPokemonTeam.get(0).getPokemonHP());
		gamePanel.enemyLvlLbl.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.allyLvlLbl.setText(gamePanel.allyPokemonTeam.get(0).getPokemonLvl() + "");
		gamePanel.enemyPokemonName.setText(gamePanel.enemyPokemonTeam.get(0).getPokemonName());
		gamePanel.allyPokemonName.setText(gamePanel.allyPokemonTeam.get(0).getPokemonName());
		new ImageManager().loadImages();
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
	
	public long calculateAttackDamage(Attack usedAttack, Pokemon deffensorPokemon, Pokemon attackingPokemon) {
		long baseDamage = Math.round(usedAttack.getAttackPotency() + (attackingPokemon.getPokemonLvl()+attackingPokemon.getPokemonAttackStat() * 0.01)
				- (deffensorPokemon.getPokemonDefense() + deffensorPokemon.getPokemonLvl() * 0.1));

		boolean hit = new Random().nextInt(100) < usedAttack.getAttackPrecission();
		if (!hit) {
			baseDamage = 0;
		}
		return baseDamage;
	}
}