package pokemonFight.manager.pojo;

import java.util.Objects;

public class Item {

	private String itemName = null;
	private int itemHealing = 0;
	private int itemCharges = 0;
	
	public Item(String itemName, int itemHealing, int itemCharges) {
		this.itemName = itemName;
		this.itemHealing =itemHealing;
		this.itemCharges = itemCharges;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemHealing() {
		return itemHealing;
	}

	public void setItemHealing(int itemHealing) {
		this.itemHealing = itemHealing;
	}

	public int getItemCharges() {
		return itemCharges;
	}

	public void setItemCharges(int itemCharges) {
		this.itemCharges = itemCharges;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemCharges, itemHealing, itemName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return itemCharges == other.itemCharges && itemHealing == other.itemHealing
				&& Objects.equals(itemName, other.itemName);
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemHealing=" + itemHealing + ", itemCharges=" + itemCharges + "]";
	}

}
