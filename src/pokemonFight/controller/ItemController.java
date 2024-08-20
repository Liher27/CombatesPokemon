package pokemonFight.controller;

import java.util.ArrayList;
import java.util.List;

import pokemonFight.manager.pojo.Item;

public class ItemController {

	public List<Item> loadItems() {
		List<Item> ret = new ArrayList<Item>();
		Item potion = new Item("Pocion", 30, 10);
		ret.add(potion);
		Item superPotion = new Item("Super Pocion", 50, 5);
		ret.add(superPotion);
		Item hyperPotion = new Item("Hiper Pocion", 200, 2);
		ret.add(hyperPotion);
		
		return ret;
	}
}