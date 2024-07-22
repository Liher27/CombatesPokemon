package pokemonFight.manager.pojo;

import java.awt.image.BufferedImage;
import java.util.Objects;

public class AllyPokemon extends Pokemon {

	int expPoints = 0;

	public AllyPokemon(int pokemonLvl, int pokemonHP, int pokemonSpeed, int pokemonDefense, int pokemonEvolutionLvl,
			int expPoints, String pokemonName, Attack pokemonAttack1, Attack pokemonAttack2, Attack pokemonAttack3,
			Attack pokemonAttack4, BufferedImage pokemonBack, BufferedImage pokemonFront) {
		super(pokemonLvl, pokemonHP, pokemonSpeed, pokemonDefense, pokemonEvolutionLvl, pokemonName, pokemonAttack1,
				pokemonAttack2, pokemonAttack3, pokemonAttack4, pokemonBack, pokemonFront);
		this.expPoints = expPoints;
	}

	@Override
	public String toString() {
		return "AllyPokemon [expPoints=" + expPoints + ", " + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(expPoints);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AllyPokemon other = (AllyPokemon) obj;
		return expPoints == other.expPoints;
	}

	public int getExpPoints() {
		return expPoints;
	}

	public void setExpPoints(int expPoints) {
		this.expPoints = expPoints;
	}

}