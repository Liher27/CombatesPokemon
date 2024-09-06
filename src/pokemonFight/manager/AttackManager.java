package pokemonFight.manager;

import java.util.Random;

import pokemonFight.manager.pojo.Attack;
import pokemonFight.manager.pojo.Pokemon;

public class AttackManager {

	public long calculateAttackDamage(Attack usedAttack, Pokemon deffensorPokemon, Pokemon attackingPokemon) {
		long baseDamage = Math.round(usedAttack.getAttackPotency() + (attackingPokemon.getPokemonLvl()+attackingPokemon.getPokemonAttackStat() * 0.01)
				- (deffensorPokemon.getPokemonDefense() + deffensorPokemon.getPokemonLvl() * 0.1));

		boolean hit = new Random().nextInt(100) < usedAttack.getAttackPrecission();
		if (!hit)
			baseDamage = 0;
		return baseDamage;
	}
}
