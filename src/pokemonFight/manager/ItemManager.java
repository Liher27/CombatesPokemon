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
}
