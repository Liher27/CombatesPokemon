package pokemonFight.manager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import pokemonFight.manager.pojo.Pokemon;

public class PokemonManager extends AttackManager {

	public List<Pokemon> pokemons = new ArrayList<>();

	public PokemonManager() throws IOException {
		pokemons.add(new Pokemon(5, 45, 45, 49, 16, "Bulbasaur", vineWhip, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/bulbasaur/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/bulbasaur/back.png"))));
		pokemons.add(new Pokemon(16, 60, 60, 63, 32, "Ivysaur", vineWhip, tackle, scratch, null,
				ImageIO.read(new File("contents/pokemonSprites/ivysaur/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/ivysaur/back.png"))));
		pokemons.add(new Pokemon(32, 80, 80, 83, 0, "Venusaur", vineWhip, tackle, scratch, solarBeam,
				ImageIO.read(new File("contents/pokemonSprites/venusaur/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/venusaur/back.png"))));
		pokemons.add(new Pokemon(5, 39, 65, 43, 16, "Charmander", flamethrower, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/charmander/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/charmander/back.png"))));
		pokemons.add(new Pokemon(16, 58, 80, 58, 36, "Charmeleon", flamethrower, scratch, dragonClaw, null,
				ImageIO.read(new File("contents/pokemonSprites/charmeleon/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/charmeleon/back.png"))));
		pokemons.add(new Pokemon(36, 78, 100, 78, 0, "Charizard", flamethrower, dragonClaw, fireBlast, airSlash,
				ImageIO.read(new File("contents/pokemonSprites/charizard/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/charizard/back.png"))));
		pokemons.add(new Pokemon(5, 44, 43, 65, 16, "Squirtle", waterGun, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/squirtle/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/squirtle/back.png"))));
		pokemons.add(new Pokemon(16, 59, 58, 80, 36, "Wartortle", waterGun, tackle, surf, null,
				ImageIO.read(new File("contents/pokemonSprites/wartortle/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/wartortle/back.png"))));
		pokemons.add(new Pokemon(36, 79, 78, 100, 0, "Blastoise", waterGun, earthquake, surf, blizzard,
				ImageIO.read(new File("contents/pokemonSprites/blastoise/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/blastoise/back.png"))));
		pokemons.add(new Pokemon(5, 45, 56, 40, 10, "Caterpie", tackle, null, null, null,
				ImageIO.read(new File("contents/pokemonSprites/caterpie/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/caterpie/back.png"))));
		pokemons.add(new Pokemon(10, 50, 30, 55, 0, "Metapod", tackle, null, null, null,
				ImageIO.read(new File("contents/pokemonSprites/metapod/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/metapod/back.png"))));
		pokemons.add(new Pokemon(10, 60, 70, 50, 0, "Butterfree", tackle, null, null, null,
				ImageIO.read(new File("contents/pokemonSprites/butterfree/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/butterfree/back.png"))));
		pokemons.add(new Pokemon(5, 40, 60, 30, 7, "Weedle", tackle, null, null, null,
				ImageIO.read(new File("contents/pokemonSprites/weedle/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/weedle/back.png"))));
		pokemons.add(new Pokemon(7, 45, 45, 50, 10, "Kakuna", tackle, null, null, null,
				ImageIO.read(new File("contents/pokemonSprites/kakuna/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/kakuna/back.png"))));
		pokemons.add(new Pokemon(10, 65, 80, 40, 0, "Beedrill", tackle, null, null, null,
				ImageIO.read(new File("contents/pokemonSprites/beedrill/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/beedrill/back.png"))));
		pokemons.add(new Pokemon(5, 40, 50, 45, 18, "Pidgey", quickAttack, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/pidgey/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/pidgey/back.png"))));
		pokemons.add(new Pokemon(18, 63, 71, 55, 36, "Pidgeotto", quickAttack, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/pidgeotto/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/pidgeotto/back.png"))));
		pokemons.add(new Pokemon(36, 83, 91, 80, 0, "Pidgeot", quickAttack, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/pidgeot/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/pidgeot/back.png"))));
		pokemons.add(new Pokemon(5, 30, 56, 35, 20, "Rattata", quickAttack, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/rattata/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/rattata/back.png"))));
		pokemons.add(new Pokemon(20, 55, 81, 60, 0, "Raticate", quickAttack, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/raticate/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/raticate/back.png"))));
		pokemons.add(new Pokemon(5, 40, 72, 30, 20, "Spearow", quickAttack, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/spearow/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/spearow/back.png"))));
		pokemons.add(new Pokemon(20, 65, 100, 65, 0, "Fearow", quickAttack, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/fearow/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/fearow/back.png"))));
		pokemons.add(new Pokemon(5, 35, 60, 44, 22, "Ekans", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/ekans/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/ekans/back.png"))));
		pokemons.add(new Pokemon(22, 60, 85, 69, 0, "Arbok", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/arbok/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/arbok/back.png"))));
		pokemons.add(new Pokemon(5, 40, 90, 35, 28, "Pikachu", thunderbolt, quickAttack, null, null,
				ImageIO.read(new File("contents/pokemonSprites/pikachu/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/pikachu/back.png"))));
		pokemons.add(new Pokemon(28, 60, 110, 55, 0, "Raichu", thunderbolt, quickAttack, null, null,
				ImageIO.read(new File("contents/pokemonSprites/raichu/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/raichu/back.png"))));
		pokemons.add(new Pokemon(5, 55, 48, 50, 20, "Sandshrew", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/sandshrew/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/sandshrew/back.png"))));
		pokemons.add(new Pokemon(20, 75, 78, 70, 0, "Sandslash", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/sandslash/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/sandslash/back.png"))));
		pokemons.add(new Pokemon(5, 50, 55, 45, 16, "Nidoran♀", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/nidoran_f/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/nidoran_f/back.png"))));
		pokemons.add(new Pokemon(16, 70, 70, 55, 36, "Nidorina", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/nidorina/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/nidorina/back.png"))));
		pokemons.add(new Pokemon(16, 85, 65, 55, 0, "Nidoqueen", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/nidoqueen/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/nidoqueen/back.png"))));
		pokemons.add(new Pokemon(5, 60, 50, 40, 16, "Nidoran♂", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/nidoran_m/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/nidoran_m/back.png"))));
		pokemons.add(new Pokemon(16, 85, 65, 55, 36, "Nidorino", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/nidorino/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/nidorino/back.png"))));
		pokemons.add(new Pokemon(16, 85, 65, 55, 0, "Nidoking", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/nidoking/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/nidoking/back.png"))));
		pokemons.add(new Pokemon(5, 46, 57, 40, 25, "Clefairy", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/clefairy/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/clefairy/back.png"))));
		pokemons.add(new Pokemon(25, 70, 90, 65, 0, "Clefable", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/clefable/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/clefable/back.png"))));
		pokemons.add(new Pokemon(5, 39, 50, 40, 20, "Vulpix", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/vulpix/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/vulpix/back.png"))));
		pokemons.add(new Pokemon(20, 73, 100, 75, 0, "Ninetales", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/ninetales/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/ninetales/back.png"))));
		pokemons.add(new Pokemon(5, 44, 55, 45, 30, "Jigglypuff", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/jigglypuff/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/jigglypuff/back.png"))));
		pokemons.add(new Pokemon(30, 70, 90, 45, 0, "Wigglytuff", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/wigglytuff/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/wigglytuff/back.png"))));
		pokemons.add(new Pokemon(5, 40, 50, 30, 18, "Zubat", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/zubat/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/zubat/back.png"))));
		pokemons.add(new Pokemon(5, 75, 70, 90, 0, "Golbat", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/golbat/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/golbat/back.png"))));
		pokemons.add(new Pokemon(5, 65, 65, 45, 0, "Oddish", tackle, vineWhip, null, null,
				ImageIO.read(new File("contents/pokemonSprites/oddish/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/oddish/back.png"))));
		pokemons.add(new Pokemon(21, 80, 70, 60, 0, "Gloom", tackle, vineWhip, null, null,
				ImageIO.read(new File("contents/pokemonSprites/gloom/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/gloom/back.png"))));
		pokemons.add(new Pokemon(36, 95, 85, 75, 0, "Vileplume", tackle, vineWhip, null, null,
				ImageIO.read(new File("contents/pokemonSprites/vileplume/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/vileplume/back.png"))));
		pokemons.add(new Pokemon(5, 50, 40, 40, 0, "Paras", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/paras/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/paras/back.png"))));
		pokemons.add(new Pokemon(24, 70, 55, 55, 0, "Parasect", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/parasect/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/parasect/back.png"))));
		pokemons.add(new Pokemon(5, 60, 55, 90, 0, "Venonat", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/venonat/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/venonat/back.png"))));
		pokemons.add(new Pokemon(31, 90, 70, 105, 0, "Venomoth", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/venomoth/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/venomoth/back.png"))));
		pokemons.add(new Pokemon(5, 40, 30, 50, 0, "Diglett", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/diglett/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/diglett/back.png"))));
		pokemons.add(new Pokemon(26, 80, 50, 70, 0, "Dugtrio", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/dugtrio/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/dugtrio/back.png"))));
		pokemons.add(new Pokemon(5, 50, 40, 70, 0, "Meowth", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/meowth/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/meowth/back.png"))));
		pokemons.add(new Pokemon(28, 70, 60, 90, 0, "Persian", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/persian/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/persian/back.png"))));
		pokemons.add(new Pokemon(5, 55, 70, 45, 0, "Psyduck", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/psyduck/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/psyduck/back.png"))));
		pokemons.add(new Pokemon(33, 80, 95, 70, 0, "Golduck", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/golduck/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/golduck/back.png"))));
		pokemons.add(new Pokemon(5, 50, 85, 55, 0, "Mankey", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/mankey/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/mankey/back.png"))));
		pokemons.add(new Pokemon(28, 65, 105, 70, 0, "Primeape", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/primeape/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/primeape/back.png"))));
		pokemons.add(new Pokemon(5, 55, 75, 60, 0, "Growlithe", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/growlithe/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/growlithe/back.png"))));
		pokemons.add(new Pokemon(30, 90, 110, 80, 0, "Arcanine", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/arcanine/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/arcanine/back.png"))));
		pokemons.add(new Pokemon(5, 50, 40, 40, 0, "Poliwag", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/poliwag/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/poliwag/back.png"))));
		pokemons.add(new Pokemon(25, 65, 65, 65, 0, "Poliwhirl", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/poliwhirl/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/poliwhirl/back.png"))));
		pokemons.add(new Pokemon(36, 90, 85, 90, 0, "Poliwrath", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/poliwrath/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/poliwrath/back.png"))));
		pokemons.add(new Pokemon(5, 70, 45, 55, 0, "Abra", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/abra/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/abra/back.png"))));
		pokemons.add(new Pokemon(16, 75, 55, 65, 0, "Kadabra", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/kadabra/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/kadabra/back.png"))));
		pokemons.add(new Pokemon(36, 100, 80, 90, 0, "Alakazam", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/alakazam/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/alakazam/back.png"))));
		pokemons.add(new Pokemon(5, 45, 50, 55, 0, "Machop", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/machop/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/machop/back.png"))));
		pokemons.add(new Pokemon(28, 60, 70, 80, 0, "Machoke", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/machoke/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/machoke/back.png"))));
		pokemons.add(new Pokemon(40, 80, 100, 90, 0, "Machamp", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/machamp/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/machamp/back.png"))));
		pokemons.add(new Pokemon(5, 50, 40, 55, 0, "Bellsprout", tackle, vineWhip, null, null,
				ImageIO.read(new File("contents/pokemonSprites/bellsprout/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/bellsprout/back.png"))));
		pokemons.add(new Pokemon(21, 65, 50, 70, 0, "Weepinbell", tackle, vineWhip, null, null,
				ImageIO.read(new File("contents/pokemonSprites/weepinbell/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/weepinbell/back.png"))));
		pokemons.add(new Pokemon(36, 90, 70, 90, 0, "Victreebel", tackle, vineWhip, null, null,
				ImageIO.read(new File("contents/pokemonSprites/victreebel/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/victreebel/back.png"))));
		pokemons.add(new Pokemon(5, 55, 25, 30, 0, "Tentacool", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/tentacool/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/tentacool/back.png"))));
		pokemons.add(new Pokemon(30, 80, 50, 70, 0, "Tentacruel", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/tentacruel/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/tentacruel/back.png"))));
		pokemons.add(new Pokemon(5, 40, 45, 35, 0, "Geodude", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/geodude/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/geodude/back.png"))));
		pokemons.add(new Pokemon(25, 55, 70, 50, 0, "Graveler", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/graveler/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/graveler/back.png"))));
		pokemons.add(new Pokemon(40, 80, 95, 75, 0, "Golem", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/golem/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/golem/back.png"))));
		pokemons.add(new Pokemon(5, 60, 40, 50, 0, "Ponyta", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/ponyta/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/ponyta/back.png"))));
		pokemons.add(new Pokemon(40, 80, 70, 80, 0, "Rapidash", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/rapidash/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/rapidash/back.png"))));
		pokemons.add(new Pokemon(5, 55, 60, 50, 0, "Slowpoke", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/slowpoke/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/slowpoke/back.png"))));
		pokemons.add(new Pokemon(37, 80, 75, 65, 0, "Slowbro", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/slowbro/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/slowbro/back.png"))));
		pokemons.add(new Pokemon(5, 30, 80, 40, 0, "Magnemite", tackle, thunderbolt, null, null,
				ImageIO.read(new File("contents/pokemonSprites/magnemite/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/magnemite/back.png"))));
		pokemons.add(new Pokemon(30, 50, 95, 60, 0, "Magneton", tackle, thunderbolt, null, null,
				ImageIO.read(new File("contents/pokemonSprites/magneton/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/magneton/back.png"))));
		pokemons.add(new Pokemon(5, 45, 20, 30, 0, "Farfetch'd", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/farfetchd/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/farfetchd/back.png"))));
		pokemons.add(new Pokemon(5, 70, 55, 50, 0, "Doduo", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/doduo/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/doduo/back.png"))));
		pokemons.add(new Pokemon(31, 80, 100, 70, 0, "Dodrio", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/dodrio/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/dodrio/back.png"))));
		pokemons.add(new Pokemon(5, 75, 70, 115, 0, "Seel", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/seel/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/seel/back.png"))));
		pokemons.add(new Pokemon(34, 90, 80, 125, 0, "Dewgong", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/dewgong/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/dewgong/back.png"))));
		pokemons.add(new Pokemon(5, 50, 20, 35, 0, "Grimer", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/grimer/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/grimer/back.png"))));
		pokemons.add(new Pokemon(38, 80, 50, 50, 0, "Muk", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/muk/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/muk/back.png"))));
		pokemons.add(new Pokemon(5, 30, 55, 40, 0, "Shellder", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/shellder/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/shellder/back.png"))));
		pokemons.add(new Pokemon(40, 50, 95, 85, 0, "Cloyster", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/cloyster/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/cloyster/back.png"))));
		pokemons.add(new Pokemon(5, 40, 35, 65, 0, "Gastly", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/gastly/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/gastly/back.png"))));
		pokemons.add(new Pokemon(25, 55, 50, 80, 0, "Haunter", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/haunter/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/haunter/back.png"))));
		pokemons.add(new Pokemon(40, 75, 70, 100, 0, "Gengar", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/gengar/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/gengar/back.png"))));
		pokemons.add(new Pokemon(5, 45, 35, 50, 0, "Onix", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/onix/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/onix/back.png"))));
		pokemons.add(new Pokemon(5, 70, 55, 45, 0, "Drowzee", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/drowzee/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/drowzee/back.png"))));
		pokemons.add(new Pokemon(26, 85, 70, 70, 0, "Hypno", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/hypno/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/hypno/back.png"))));
		pokemons.add(new Pokemon(5, 30, 35, 90, 22, "Krabby", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/krabby/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/krabby/back.png"))));
		pokemons.add(new Pokemon(22, 55, 80, 115, 0, "Kingler", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/kingler/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/kingler/back.png"))));
		pokemons.add(new Pokemon(5, 40, 50, 30, 24, "Voltorb", tackle, thunderbolt, null, null,
				ImageIO.read(new File("contents/pokemonSprites/voltorb/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/voltorb/back.png"))));
		pokemons.add(new Pokemon(24, 60, 70, 140, 0, "Electrode", tackle, thunderbolt, null, null,
				ImageIO.read(new File("contents/pokemonSprites/electrode/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/electrode/back.png"))));
		pokemons.add(new Pokemon(5, 50, 55, 55, 25, "Exeggcute", tackle, vineWhip, null, null,
				ImageIO.read(new File("contents/pokemonSprites/exeggcute/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/exeggcute/back.png"))));
		pokemons.add(new Pokemon(25, 80, 95, 85, 0, "Exeggutor", tackle, vineWhip, null, null,
				ImageIO.read(new File("contents/pokemonSprites/exeggutor/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/exeggutor/back.png"))));
		pokemons.add(new Pokemon(5, 50, 65, 55, 28, "Cubone", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/cubone/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/cubone/back.png"))));
		pokemons.add(new Pokemon(28, 60, 80, 110, 0, "Marowak", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/marowak/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/marowak/back.png"))));
		pokemons.add(new Pokemon(5, 55, 55, 45, 30, "Hitmonlee", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/hitmonlee/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/hitmonlee/back.png"))));
		pokemons.add(new Pokemon(30, 70, 100, 70, 0, "Hitmonchan", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/hitmonchan/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/hitmonchan/back.png"))));
		pokemons.add(new Pokemon(5, 40, 50, 45, 30, "Lickitung", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/lickitung/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/lickitung/back.png"))));
		pokemons.add(new Pokemon(30, 55, 90, 95, 0, "Koffing", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/koffing/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/koffing/back.png"))));
		pokemons.add(new Pokemon(5, 65, 120, 60, 30, "Weezing", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/weezing/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/weezing/back.png"))));
		pokemons.add(new Pokemon(5, 80, 95, 65, 25, "Rhyhorn", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/rhyhorn/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/rhyhorn/back.png"))));
		pokemons.add(new Pokemon(25, 105, 100, 50, 0, "Rhydon", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/rhydon/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/rhydon/back.png"))));
		pokemons.add(new Pokemon(5, 65, 95, 57, 0, "Chansey", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/chansey/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/chansey/back.png"))));
		pokemons.add(new Pokemon(5, 55, 30, 45, 0, "Tangela", vineWhip, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/tangela/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/tangela/back.png"))));
		pokemons.add(new Pokemon(5, 80, 85, 90, 0, "Kangaskhan", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/kangaskhan/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/kangaskhan/back.png"))));
		pokemons.add(new Pokemon(5, 40, 70, 45, 25, "Horsea", waterGun, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/horsea/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/horsea/back.png"))));
		pokemons.add(new Pokemon(25, 55, 95, 65, 0, "Seadra", waterGun, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/seadra/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/seadra/back.png"))));
		pokemons.add(new Pokemon(5, 45, 75, 60, 27, "Goldeen", waterGun, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/goldeen/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/goldeen/back.png"))));
		pokemons.add(new Pokemon(27, 80, 92, 65, 0, "Seaking", waterGun, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/seaking/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/seaking/back.png"))));
		pokemons.add(new Pokemon(5, 30, 70, 55, 30, "Staryu", waterGun, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/staryu/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/staryu/back.png"))));
		pokemons.add(new Pokemon(70, 95, 85, 150, 0, "Starmie", waterGun, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/starmie/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/starmie/back.png"))));
		pokemons.add(new Pokemon(5, 40, 80, 35, 0, "Mr. Mime", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/mr_mime/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/mr_mime/back.png"))));
		pokemons.add(new Pokemon(5, 70, 110, 180, 0, "Scyther", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/scyther/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/scyther/back.png"))));
		pokemons.add(new Pokemon(5, 65, 95, 75, 0, "Jynx", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/jynx/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/jynx/back.png"))));
		pokemons.add(new Pokemon(5, 75, 125, 95, 0, "Electabuzz", thunderbolt, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/electabuzz/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/electabuzz/back.png"))));
		pokemons.add(new Pokemon(5, 95, 55, 80, 0, "Magmar", flamethrower, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/magmar/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/magmar/back.png"))));
		pokemons.add(new Pokemon(5, 130, 5, 180, 0, "Pinsir", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/pinsir/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/pinsir/back.png"))));
		pokemons.add(new Pokemon(5, 50, 95, 85, 0, "Tauros", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/tauros/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/tauros/back.png"))));
		pokemons.add(new Pokemon(5, 20, 10, 55, 20, "Magikarp", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/magikarp/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/magikarp/back.png"))));
		pokemons.add(new Pokemon(20, 95, 125, 79, 0, "Gyarados", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/gyarados/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/gyarados/back.png"))));
		pokemons.add(new Pokemon(5, 70, 55, 45, 0, "Lapras", waterGun, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/lapras/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/lapras/back.png"))));
		pokemons.add(new Pokemon(5, 65, 45, 160, 0, "Ditto", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/ditto/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/ditto/back.png"))));
		pokemons.add(new Pokemon(5, 35, 55, 30, 31, "Eevee", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/eevee/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/eevee/back.png"))));
		pokemons.add(new Pokemon(31, 130, 65, 60, 0, "Vaporeon", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/vaporeon/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/vaporeon/back.png"))));
		pokemons.add(new Pokemon(31, 65, 110, 60, 0, "Jolteon", tackle, thunderbolt, null, null,
				ImageIO.read(new File("contents/pokemonSprites/jolteon/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/jolteon/back.png"))));
		pokemons.add(new Pokemon(31, 65, 130, 60, 0, "Flareon", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/flareon/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/flareon/back.png"))));
		pokemons.add(new Pokemon(5, 65, 60, 70, 0, "Porygon", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/porygon/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/porygon/back.png"))));
		pokemons.add(new Pokemon(5, 105, 55, 90, 0, "Omanyte", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/omanyte/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/omanyte/back.png"))));
		pokemons.add(new Pokemon(40, 115, 70, 95, 0, "Omastar", tackle, waterGun, null, null,
				ImageIO.read(new File("contents/pokemonSprites/omastar/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/omastar/back.png"))));
		pokemons.add(new Pokemon(5, 100, 35, 115, 0, "Kabuto", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/kabuto/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/kabuto/back.png"))));
		pokemons.add(new Pokemon(40, 125, 55, 105, 0, "Kabutops", scratch, tackle, null, null,
				ImageIO.read(new File("contents/pokemonSprites/kabutops/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/kabutops/back.png"))));
		pokemons.add(new Pokemon(5, 80, 85, 90, 0, "Aerodactyl", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/aerodactyl/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/aerodactyl/back.png"))));
		pokemons.add(new Pokemon(5, 160, 90, 110, 0, "Snorlax", tackle, scratch, null, null,
				ImageIO.read(new File("contents/pokemonSprites/snorlax/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/snorlax/back.png"))));
		pokemons.add(new Pokemon(5, 41, 50, 65, 0, "Articuno", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/articuno/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/articuno/back.png"))));
		pokemons.add(new Pokemon(5, 41, 50, 65, 0, "Zapdos", tackle, thunderbolt, null, null,
				ImageIO.read(new File("contents/pokemonSprites/zapdos/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/zapdos/back.png"))));
		pokemons.add(new Pokemon(5, 41, 50, 65, 0, "Moltres", tackle, thunderbolt, null, null,
				ImageIO.read(new File("contents/pokemonSprites/moltres/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/moltres/back.png"))));
		pokemons.add(new Pokemon(5, 41, 50, 65, 0, "Dratini", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/dratini/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/dratini/back.png"))));
		pokemons.add(new Pokemon(30, 41, 50, 65, 55, "Dragonair", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/dragonair/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/dragonair/back.png"))));
		pokemons.add(new Pokemon(55, 41, 50, 65, 0, "Dragonite", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/dragonite/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/dragonite/back.png"))));
		pokemons.add(new Pokemon(5, 41, 50, 65, 0, "Mewtwo", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/mewtwo/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/mewtwo/back.png"))));
		pokemons.add(new Pokemon(5, 41, 50, 65, 0, "Mew", tackle, flamethrower, null, null,
				ImageIO.read(new File("contents/pokemonSprites/mew/front.png")),
				ImageIO.read(new File("contents/pokemonSprites/mew/back.png"))));
	}

}