package pokemonFight.manager;

import java.util.Random;

import pokemonFight.manager.pojo.Attack;
import pokemonFight.manager.pojo.Pokemon;

public class AttackManager {
	Attack vineWhip = new Attack("Látigo cepa", 45, 100);
	Attack tackle = new Attack("Placaje", 40, 100);
	Attack flamethrower = new Attack("Lanzallamas", 90, 100);
	Attack scratch = new Attack("Arañazo", 40, 100);
	Attack waterGun = new Attack("Pistola agua", 40, 100);
	Attack quickAttack = new Attack("At. rapido", 40, 100);
	Attack thunderbolt = new Attack("Rayo", 60, 100);
	Attack ironTail = new Attack("Cola ferrea", 80, 100);
	Attack hyperBeam = new Attack("Hiperrayo", 110, 90);
	Attack solarBeam = new Attack("Rayo solar", 100, 90);
	Attack iceBeam = new Attack("Rayo hielo", 90, 100);
	Attack psychic = new Attack("Psiquico", 90, 100);
	Attack rockSlide = new Attack("Rock Slide", 75, 90);
	Attack earthquake = new Attack("Terremoto", 100, 100);
	Attack thunder = new Attack("Trueno", 110, 70);
	Attack blizzard = new Attack("Ventisca", 110, 70);
	Attack shadowBall = new Attack("Bola sombra", 80, 100);
	Attack dragonClaw = new Attack("Garra dragon", 80, 100);
	Attack darkPulse = new Attack("Pulso umbrio", 80, 100);
	Attack sludgeBomb = new Attack("Bomba lodo", 90, 100);
	Attack fireBlast = new Attack("LLamarada", 110, 85);
	Attack surf = new Attack("Surf", 90, 100);
	Attack airSlash = new Attack("Corte aereo", 90, 95);
	Attack brickBreak = new Attack("Abocajarro", 100, 100);
	Attack bugBuzz = new Attack("Estoicismo", 70, 100);

	public long calculateAttackDamage(Attack usedAttack, Pokemon deffensorPokemon, Pokemon attackingPokemon) {
		long baseDamage = Math.round(usedAttack.getAttackPotency() + (attackingPokemon.getPokemonLvl() * 0.01)
				- (deffensorPokemon.getPokemonDefense() + deffensorPokemon.getPokemonLvl() * 0.01));

		boolean hit = new Random().nextInt(100) < usedAttack.getAttackPrecission();
		if (!hit)
			return 0;

		return Math.max(baseDamage, 0);
	}
}
