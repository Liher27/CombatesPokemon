package pokemonFight.manager;

import java.util.ArrayList;
import java.util.List;

import pokemonFight.controller.ItemController;
import pokemonFight.manager.pojo.Item;

public class ItemManager {
	List<Item> availableItems = null;

	public List<Item> getItems() {
		availableItems = new ArrayList<Item>();

		return availableItems = new ItemController().loadItems();
	}
//	public void trainerBattle() {
		// INICIALIZAR LOS EQUIPOS
		// LIST<POKEMON> ALLYPOKEMONTEAM = GAMEPANEL.ALLYPOKEMONTEAM
		// LIST <POKEMON>ENEMYPOKEMONTEAM = GAMEPANEL.ENEMYPOKEMONTEAM
		// boolean atacaElPrimero =  allyPokemonTeam.get(0).getPokemonSpeed() >= enemyPokemonTeam.get(0).getPokemonSpeed();;
		// boolean continueBattle = true;
		///////////////////////// (COMBAT.GET(0))////////////////////////////////////////////
		// while (continueBattle) {
		// if(atacaElPrimero????){
		// CREAR ATAQUES
		// DEJAR AL LOCAL ATACAR
		// DESPUES COMPROBAR ESTADO DEL ENEMIGO
		// Y PASAR A SU TURNO
		// if (enemyPokemonTeam.get(0).getHP>0) {
		// si la vida del que ha defendido (enemyPokemonTeam.get(0)) es mayor que 0, ataca el
		// (atacaElPrimero = false?)
		// }else if (ENEMYPOKEMONTEAM.size() > 1) {
		// EL POKEMON ENEMIGO HA MUERTO, COMPROBAR SI QUEDAN MAS POKEMON EN EL ARRAY DEL
		// EQUIPO ENEMIGO, SELECCIONAR UNO Y CAMBIARLO POR EL QUE ESTA EN EL ARRAY
		// COMBAT, ELIMINAR EL DEBILITADO Y DESPUES ATACA EL (atacaElPrimero = false?)
		// }ELSE {
		// MENSAJE PARA QUE HA GANADO, NO QUEDAN POKEMON EN EL EQUIPO ENEMIGO Y EL
		// POKEMON ENEMIGO HA SIDO
		// DEBILITADO, EL COMBATE TERMINA: CONTINUEbATTLE = FALSE;
		// }
		// }
		///////////////////////// (ENEMYPOKEMONTEAM.GET(0))////////////////////////////////////////////
		// else(!atacaElPrimero){
		// CREAR ATAQUES
		// DEJAR AL USUARIO ATACAR
		// COMPROBAR ESTADO DEL ENEMIGO
		// if (allyPokemonTeam.get(0).getHP>0) {
		// si la vida del que ha defendido (allyPokemonTeam.get(0)) es mayor que 0, ataca el
		// (atacaElPrimero = TRUE)
		// }
		// else if (allyPokemonTeam.size() > 1) {
		// EL POKEMON ENEMIGO HA MUERTO, COMPROBAR SI QUEDAN MAS POKEMON EN EL ARRAY DEL
		// EQUIPO ENEMIGO, SELECCIONAR UNO Y CAMBIARLO POR EL QUE ESTA EN EL ARRAY
		// COMBAT, ELIMINAR EL DEBILITADO Y DESPUES ATACA EL (atacaElPrimero = true)
		// }ELSE {
		// MENSAJE PARA EL VISITANTE, HA GANADO Y EL LOCAL HA PERDIDO
		// NO QUEDAN POKEMON EN EL EQUIPO ENEMIGO Y EL POKEMON ENEMIGO HA SIDO
		// DEBILITADO, EL COMBATE TERMINA: CONTINUEbATTLE = FALSE;
		// }
		// }
		// }
//	}
}
