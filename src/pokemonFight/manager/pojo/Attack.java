package pokemonFight.manager.pojo;

import java.io.Serializable;
import java.util.Objects;

public class Attack implements Serializable {

	private static final long serialVersionUID = 4873819902174724514L;

	int attackPotency = 0;

	int attackPrecission = 0;

	String attackName = null;

	public Attack(String attackName, int attackPotency, int attackPrecission) {
		this.attackName = attackName;
		this.attackPotency = attackPotency;
		this.attackPrecission = attackPrecission;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(attackName, attackPotency, attackPrecission);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attack other = (Attack) obj;
		return Objects.equals(attackName, other.attackName) && attackPotency == other.attackPotency
				&& attackPrecission == other.attackPrecission;
	}

	@Override
	public String toString() {
		return "Attack [attackPotency=" + attackPotency + ", attackPrecission=" + attackPrecission + ", attackName="
				+ attackName + "]";
	}

	public int getAttackPotency() {
		return attackPotency;
	}

	public void setAttackPotency(int attackPotency) {
		this.attackPotency = attackPotency;
	}

	public int getAttackPrecission() {
		return attackPrecission;
	}

	public void setAttackPrecission(int attackPrecission) {
		this.attackPrecission = attackPrecission;
	}

	public String getAttackName() {
		return attackName;
	}

	public void setAttackName(String attackName) {
		this.attackName = attackName;
	}

}
