package pokemonFight.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.imageio.ImageIO;

import pokemonFight.manager.pojo.Attack;
import pokemonFight.manager.pojo.Pokemon;

public class PokemonController extends AttackController {

	private Map<String, Attack> attackMap;

	public PokemonController() {
		attackMap = new HashMap<>();

		attackMap.put("vineWhip", vineWhip);
		attackMap.put("tackle", tackle);
		attackMap.put("flamethrower", flamethrower);
		attackMap.put("scratch", scratch);
		attackMap.put("waterGun", waterGun);
		attackMap.put("bite", bite);
		attackMap.put("crunch", crunch);
		attackMap.put("quickAttack", quickAttack);
		attackMap.put("thunderbolt", thunderbolt);
		attackMap.put("ironTail", ironTail);
		attackMap.put("hyperBeam", hyperBeam);
		attackMap.put("solarBeam", solarBeam);
		attackMap.put("iceBeam", iceBeam);
		attackMap.put("psychic", psychic);
		attackMap.put("rockSlide", rockSlide);
		attackMap.put("earthquake", earthquake);
		attackMap.put("thunder", thunder);
		attackMap.put("blizzard", blizzard);
		attackMap.put("shadowBall", shadowBall);
		attackMap.put("dragonClaw", dragonClaw);
		attackMap.put("darkPulse", darkPulse);
		attackMap.put("sludgeBomb", sludgeBomb);
		attackMap.put("fireBlast", fireBlast);
		attackMap.put("surf", surf);
		attackMap.put("airSlash", airSlash);
		attackMap.put("brickBreak", brickBreak);
		attackMap.put("bugBuzz", bugBuzz);
		attackMap.put("bodySlam", bodySlam);
		attackMap.put("megaPunch", megaPunch);
		attackMap.put("razorLeaf", razorLeaf);
		attackMap.put("thunderShock", thunderShock);
		attackMap.put("ember", ember);
		attackMap.put("swift", swift);
		attackMap.put("hydroPump", hydroPump);
		attackMap.put("fly", fly);
		attackMap.put("fireSpin", fireSpin);
		attackMap.put("dig", dig);
		attackMap.put("doubleEdge", doubleEdge);
		attackMap.put("megaKick", megaKick);
		attackMap.put("strength", strength);
		attackMap.put("submission", submission);
		attackMap.put("seismicToss", seismicToss);
		attackMap.put("solarBlade", solarBlade);
		attackMap.put("magicalLeaf", magicalLeaf);
		attackMap.put("confusion", confusion);
		attackMap.put("psywave", psywave);
		attackMap.put("teleport", teleport);
		attackMap.put("futureSight", futureSight);
	}

	public List<Pokemon> loadPokemons() throws IOException {
		List<Pokemon> pokemons = new ArrayList<>();

		File pokemonInfo = new File("contents/pokemon.csv");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(pokemonInfo));
		String line = null;

		while ((line = bufferedReader.readLine()) != null) {
			String[] values = line.split(",");
			String pokemonName = values[0];
			String pokemonPath = pokemonName.toLowerCase(Locale.ROOT);
			if (pokemonName.equalsIgnoreCase("Mr. Mime")) {
				pokemonPath = "mr_mime";
			} else if (pokemonName.equalsIgnoreCase("Nidoran♀")) {
				pokemonPath = "nidoran_f";
			} else if (pokemonName.equalsIgnoreCase("Nidoran♂")) {
				pokemonPath = "nidoran_m";
			}
			int pokemonLvl = Integer.parseInt(values[1]);
			int pokemonHp = Integer.parseInt(values[2]);
			int pokemonAtk = Integer.parseInt(values[3]);
			int pokemonDefense = Integer.parseInt(values[4]);
			int pokemonSpeed = Integer.parseInt(values[5]);
			Attack pokemonFirstAttack = attackMap.get(values[6]);
			Attack pokemonSecondAttack = attackMap.get(values[7]);
			Attack pokemonThirdAttack = attackMap.get(values[8]);
			Attack pokemonFourthAttack = attackMap.get(values[9]);
			Pokemon pokemon = new Pokemon(pokemonLvl, pokemonHp, pokemonSpeed, pokemonDefense, pokemonAtk, pokemonName,
					pokemonFirstAttack, pokemonSecondAttack, pokemonThirdAttack, pokemonFourthAttack,
					ImageIO.read(new File("contents/pokemonSprites/" + pokemonPath + "/front.png")),
					ImageIO.read(new File("contents/pokemonSprites/" + pokemonPath + "/back.png")));
			pokemons.add(pokemon);
		}
		bufferedReader.close();
		return pokemons;
	}

}
