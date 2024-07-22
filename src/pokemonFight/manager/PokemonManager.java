package pokemonFight.manager;

import java.io.IOException;

import javax.imageio.ImageIO;

import pokemonFight.manager.pojo.Pokemon;

public class PokemonManager extends AttackManager {
	// Creamos instancias de 150 Pokémon en orden de Pokédex
	Pokemon[] pokemons = new Pokemon[150];

	public PokemonManager() throws IOException {
		pokemons[0] = new Pokemon(5, 45, 45, 49, 16, "Bulbasaur", vineWhip, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[1] = new Pokemon(16, 60, 60, 63, 32, "Ivysaur", vineWhip, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[2] = new Pokemon(32, 80, 80, 83, 0, "Venusaur", vineWhip, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[3] = new Pokemon(5, 39, 65, 43, 16, "Charmander", flamethrower, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[4] = new Pokemon(16, 58, 80, 58, 36, "Charmeleon", flamethrower, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[5] = new Pokemon(36, 78, 100, 78, 0, "Charizard", flamethrower, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[6] = new Pokemon(5, 44, 43, 65, 16, "Squirtle", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[7] = new Pokemon(16, 59, 58, 80, 36, "Wartortle", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[8] = new Pokemon(36, 79, 78, 100, 0, "Blastoise", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[9] = new Pokemon(5, 45, 56, 40, 10, "Caterpie", tackle, null, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[10] = new Pokemon(10, 50, 30, 55, 0, "Metapod", tackle, null, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[11] = new Pokemon(10, 60, 70, 50, 0, "Butterfree", tackle, null, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[12] = new Pokemon(5, 40, 60, 30, 7, "Weedle", tackle, null, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[13] = new Pokemon(7, 45, 45, 50, 10, "Kakuna", tackle, null, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[14] = new Pokemon(10, 65, 80, 40, 0, "Beedrill", tackle, null, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[15] = new Pokemon(5, 40, 50, 45, 18, "Pidgey", quickAttack, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[16] = new Pokemon(18, 63, 71, 55, 36, "Pidgeotto", quickAttack, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[17] = new Pokemon(36, 83, 91, 80, 0, "Pidgeot", quickAttack, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[18] = new Pokemon(5, 30, 56, 35, 20, "Rattata", quickAttack, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[19] = new Pokemon(20, 55, 81, 60, 0, "Raticate", quickAttack, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[20] = new Pokemon(5, 40, 72, 30, 20, "Spearow", quickAttack, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[21] = new Pokemon(20, 65, 100, 65, 0, "Fearow", quickAttack, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[22] = new Pokemon(5, 35, 60, 44, 22, "Ekans", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[23] = new Pokemon(22, 60, 85, 69, 0, "Arbok", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[24] = new Pokemon(5, 40, 90, 35, 28, "Pikachu", thunderbolt, quickAttack, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[25] = new Pokemon(28, 60, 110, 55, 0, "Raichu", thunderbolt, quickAttack, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[26] = new Pokemon(5, 55, 48, 50, 20, "Sandshrew", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[27] = new Pokemon(20, 75, 78, 70, 0, "Sandslash", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[28] = new Pokemon(5, 50, 55, 45, 16, "Nidoran♀", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[29] = new Pokemon(16, 70, 70, 55, 36, "Nidorina", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[30] = new Pokemon(16, 85, 65, 55, 0, "Nidoqueen", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[31] = new Pokemon(5, 60, 50, 40, 16, "Nidoran♂", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[32] = new Pokemon(16, 85, 65, 55, 36, "Nidorino", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[33] = new Pokemon(16, 85, 65, 55, 0, "Nidoking", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[34] = new Pokemon(5, 46, 57, 40, 25, "Clefairy", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[35] = new Pokemon(25, 70, 90, 65, 0, "Clefable", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[36] = new Pokemon(5, 39, 50, 40, 20, "Vulpix", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[37] = new Pokemon(20, 73, 100, 75, 0, "Ninetales", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[38] = new Pokemon(5, 44, 55, 45, 30, "Jigglypuff", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[39] = new Pokemon(30, 70, 90, 45, 0, "Wigglytuff", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[40] = new Pokemon(5, 40, 50, 30, 18, "Zubat", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[41] = new Pokemon(18, 75, 90, 55, 0, "Golbat", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[42] = new Pokemon(5, 45, 60, 40, 25, "Oddish", tackle, vineWhip, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[43] = new Pokemon(25, 60, 75, 50, 40, "Gloom", tackle, vineWhip, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[44] = new Pokemon(25, 60, 75, 50, 0, "Vileplume", tackle, vineWhip, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[45] = new Pokemon(5, 50, 65, 40, 21, "Paras", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[46] = new Pokemon(21, 60, 95, 55, 0, "Parasect", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[47] = new Pokemon(5, 35, 70, 55, 26, "Venonat", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[48] = new Pokemon(26, 60, 90, 75, 0, "Venomoth", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[49] = new Pokemon(5, 30, 50, 40, 25, "Diglett", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[50] = new Pokemon(25, 50, 80, 60, 0, "Dugtrio", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[51] = new Pokemon(5, 50, 60, 45, 22, "Meowth", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[52] = new Pokemon(22, 65, 115, 70, 0, "Persian", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[53] = new Pokemon(5, 65, 90, 55, 28, "Psyduck", scratch, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[54] = new Pokemon(28, 80, 85, 70, 0, "Golduck", scratch, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[55] = new Pokemon(5, 52, 90, 55, 28, "Mankey", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[56] = new Pokemon(28, 80, 95, 70, 0, "Primeape", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[57] = new Pokemon(5, 35, 72, 40, 22, "Growlithe", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[58] = new Pokemon(22, 60, 90, 50, 0, "Arcanine", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[59] = new Pokemon(5, 40, 55, 35, 25, "Poliwag", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[60] = new Pokemon(25, 65, 90, 50, 40, "Poliwhirl", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[61] = new Pokemon(25, 60, 75, 50, 0, "Poliwrath", tackle, vineWhip, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[62] = new Pokemon(5, 50, 70, 40, 21, "Abra", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[63] = new Pokemon(21, 60, 90, 55, 50, "Kadabra", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[64] = new Pokemon(25, 60, 75, 50, 0, "Alakazam", tackle, vineWhip, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[65] = new Pokemon(5, 45, 60, 40, 28, "Machop", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[66] = new Pokemon(28, 60, 70, 55, 0, "Machoke", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[67] = new Pokemon(25, 60, 75, 50, 0, "Machamp", tackle, vineWhip, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[68] = new Pokemon(5, 55, 55, 50, 25, "Bellsprout", vineWhip, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[69] = new Pokemon(25, 65, 65, 55, 40, "Weepinbell", vineWhip, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[70] = new Pokemon(25, 60, 75, 50, 0, "Victribell", tackle, vineWhip, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[71] = new Pokemon(5, 40, 75, 30, 26, "Tentacool", tackle, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[72] = new Pokemon(26, 80, 100, 65, 0, "Tentacruel", tackle, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[73] = new Pokemon(5, 60, 55, 50, 25, "Geodude", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[74] = new Pokemon(25, 75, 70, 65, 43, "Graveler", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[75] = new Pokemon(25, 60, 75, 50, 0, "Golem", tackle, vineWhip, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[76] = new Pokemon(5, 35, 72, 40, 22, "Ponyta", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[77] = new Pokemon(22, 65, 105, 70, 0, "Rapidash", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[78] = new Pokemon(5, 50, 40, 40, 20, "Slowpoke", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[79] = new Pokemon(20, 95, 30, 70, 0, "Slowbro", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[80] = new Pokemon(5, 65, 65, 60, 30, "Magnemite", tackle, thunderbolt, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[81] = new Pokemon(30, 50, 70, 95, 0, "Magneton", tackle, thunderbolt, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[82] = new Pokemon(5, 70, 30, 55, 28, "Farfetch'd", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[83] = new Pokemon(5, 45, 85, 35, 20, "Doduo", quickAttack, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[84] = new Pokemon(20, 70, 110, 60, 0, "Dodrio", quickAttack, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[85] = new Pokemon(5, 35, 55, 30, 28, "Seel", tackle, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[86] = new Pokemon(28, 65, 75, 50, 0, "Dewgong", tackle, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[87] = new Pokemon(5, 80, 40, 50, 30, "Grimer", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[88] = new Pokemon(30, 105, 50, 75, 0, "Muk", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[89] = new Pokemon(5, 30, 70, 30, 30, "Shellder", tackle, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[90] = new Pokemon(30, 50, 95, 180, 0, "Cloyster", tackle, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[91] = new Pokemon(5, 40, 45, 35, 25, "Gastly", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[92] = new Pokemon(25, 45, 50, 45, 41, "Haunter", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[93] = new Pokemon(25, 60, 75, 50, 0, "Gengar", tackle, vineWhip, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[94] = new Pokemon(5, 60, 30, 35, 31, "Onix", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[95] = new Pokemon(5, 30, 56, 35, 25, "Drowzee", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[96] = new Pokemon(25, 85, 73, 70, 0, "Hypno", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[97] = new Pokemon(5, 65, 90, 55, 30, "Krabby", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[98] = new Pokemon(30, 55, 130, 115, 0, "Kingler", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[99] = new Pokemon(5, 50, 55, 25, 28, "Voltorb", tackle, thunderbolt, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[100] = new Pokemon(28, 60, 100, 70, 0, "Electrode", tackle, thunderbolt, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[101] = new Pokemon(5, 40, 70, 45, 35, "Exeggcute", vineWhip, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[102] = new Pokemon(35, 95, 95, 85, 0, "Exeggutor", vineWhip, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[103] = new Pokemon(5, 50, 55, 45, 25, "Cubone", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[104] = new Pokemon(25, 60, 80, 50, 0, "Marowak", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[105] = new Pokemon(5, 65, 65, 65, 0, "Hitmonlee", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[106] = new Pokemon(5, 50, 35, 50, 0, "Hitmonchan", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[107] = new Pokemon(5, 90, 55, 75, 0, "Lickitung", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[108] = new Pokemon(5, 35, 95, 50, 0, "Koffing", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[109] = new Pokemon(35, 65, 90, 45, 0, "Weezing", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[110] = new Pokemon(5, 40, 80, 35, 20, "Rhyhorn", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[111] = new Pokemon(20, 105, 130, 120, 0, "Rhydon", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[112] = new Pokemon(5, 65, 95, 57, 0, "Chansey", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[113] = new Pokemon(5, 55, 30, 45, 0, "Tangela", vineWhip, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[114] = new Pokemon(5, 80, 85, 90, 0, "Kangaskhan", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[115] = new Pokemon(5, 40, 70, 45, 25, "Horsea", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[116] = new Pokemon(25, 55, 95, 65, 0, "Seadra", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[117] = new Pokemon(5, 45, 75, 60, 27, "Goldeen", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[118] = new Pokemon(27, 80, 92, 65, 0, "Seaking", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[119] = new Pokemon(5, 30, 70, 55, 30, "Staryu", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[120] = new Pokemon(70, 95, 85, 150, 0, "Starmie", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[121] = new Pokemon(5, 40, 80, 35, 0, "Mr. Mime", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[122] = new Pokemon(5, 70, 110, 180, 0, "Scyther", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[123] = new Pokemon(5, 65, 95, 75, 0, "Jynx", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[124] = new Pokemon(5, 75, 125, 95, 0, "Electabuzz", thunderbolt, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[125] = new Pokemon(5, 95, 55, 80, 0, "Magmar", flamethrower, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[126] = new Pokemon(5, 130, 5, 180, 0, "Pinsir", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[127] = new Pokemon(5, 50, 95, 85, 0, "Tauros", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[128] = new Pokemon(5, 20, 10, 55, 20, "Magikarp", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[129] = new Pokemon(20, 95, 125, 79, 0, "Gyarados", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[130] = new Pokemon(5, 70, 55, 45, 0, "Lapras", waterGun, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[131] = new Pokemon(5, 65, 45, 160, 0, "Ditto", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[132] = new Pokemon(5, 35, 55, 30, 31, "Eevee", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[133] = new Pokemon(31, 130, 65, 60, 0, "Vaporeon", tackle, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[134] = new Pokemon(31, 65, 110, 60, 0, "Jolteon", tackle, thunderbolt, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[135] = new Pokemon(31, 65, 130, 60, 0, "Flareon", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[136] = new Pokemon(5, 65, 60, 70, 0, "Porygon", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[137] = new Pokemon(5, 105, 55, 90, 0, "Omanyte", tackle, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[138] = new Pokemon(40, 115, 70, 95, 0, "Omastar", tackle, waterGun, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[139] = new Pokemon(5, 100, 35, 115, 0, "Kabuto", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[140] = new Pokemon(40, 125, 55, 105, 0, "Kabutops", scratch, tackle, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[141] = new Pokemon(5, 80, 85, 90, 0, "Aerodactyl", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[142] = new Pokemon(5, 160, 90, 110, 0, "Snorlax", tackle, scratch, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[143] = new Pokemon(5, 41, 50, 65, 0, "Articuno", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[144] = new Pokemon(5, 41, 50, 65, 0, "Zapdos", tackle, thunderbolt, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[145] = new Pokemon(5, 41, 50, 65, 0, "Moltres", tackle, thunderbolt, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[146] = new Pokemon(5, 41, 50, 65, 0, "Dratini", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[147] = new Pokemon(30, 41, 50, 65, 55, "Dragonair", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[148] = new Pokemon(55, 41, 50, 65, 0, "Dragonite", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[149] = new Pokemon(5, 41, 50, 65, 0, "Mewtwo", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
		pokemons[150] = new Pokemon(5, 41, 50, 65, 0, "Mew", tackle, flamethrower, null, null,
				ImageIO.read(getClass().getResourceAsStream("")), ImageIO.read(getClass().getResourceAsStream("")));
	}

}
