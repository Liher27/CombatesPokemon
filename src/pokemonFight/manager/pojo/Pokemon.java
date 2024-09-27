package pokemonFight.manager.pojo;

import java.awt.image.BufferedImage;
import java.util.Objects;

public class Pokemon {

	int pokemonLvl = 0;
	int pokemonHP = 0;
	int pokemonSpeed = 0;
	int pokemonDefense = 0;
	int pokemonAttackStat = 0;

	String pokemonName = null;

	Attack pokemonAttack1 = null;
	Attack pokemonAttack2 = null;
	Attack pokemonAttack3 = null;
	Attack pokemonAttack4 = null;

	BufferedImage pokemonBack = null;
	BufferedImage pokemonFront = null;

	public Pokemon(int pokemonLvl, int pokemonHP, int pokemonSpeed, int pokemonDefense, int pokemonAttackStat,
			String pokemonName, Attack pokemonAttack1, Attack pokemonAttack2, Attack pokemonAttack3,
			Attack pokemonAttack4,  BufferedImage pokemonFront, BufferedImage pokemonBack) {
		this.pokemonLvl = pokemonLvl;
		this.pokemonHP = pokemonHP;
		this.pokemonSpeed = pokemonSpeed;
		this.pokemonDefense = pokemonDefense;
		this.pokemonAttackStat = pokemonAttackStat;
		this.pokemonName = pokemonName;
		this.pokemonAttack1 = pokemonAttack1;
		this.pokemonAttack2 = pokemonAttack2;
		this.pokemonAttack3 = pokemonAttack3;
		this.pokemonAttack4 = pokemonAttack4;
		this.pokemonFront = pokemonFront;
		this.pokemonBack = pokemonBack;
	}

	public int getPokemonLvl() {
		return pokemonLvl;
	}

	public void setPokemonLvl(int pokemonLvl) {
		this.pokemonLvl = pokemonLvl;
	}

	public int getPokemonHP() {
		return pokemonHP;
	}

	public void setPokemonHP(int pokemonHP) {
		this.pokemonHP = pokemonHP;
	}

	public int getPokemonSpeed() {
		return pokemonSpeed;
	}

	public void setPokemonSpeed(int pokemonSpeed) {
		this.pokemonSpeed = pokemonSpeed;
	}

	public int getPokemonDefense() {
		return pokemonDefense;
	}

	public void setPokemonDefense(int pokemonDefense) {
		this.pokemonDefense = pokemonDefense;
	}

	public int getPokemonAttackStat() {
		return pokemonAttackStat;
	}

	public void setPokemonAttackStat(int pokemonAttackStat) {
		this.pokemonAttackStat = pokemonAttackStat;
	}

	public String getPokemonName() {
		return pokemonName;
	}

	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}

	public Attack getPokemonAttack(int attack) {
		return pokemonAttack1;
	}
	
	public Attack getPokemonAttack1() {
		return pokemonAttack1;
	}

	public void setPokemonAttack1(Attack pokemonAttack1) {
		this.pokemonAttack1 = pokemonAttack1;
	}

	public Attack getPokemonAttack2() {
		return pokemonAttack2;
	}

	public void setPokemonAttack2(Attack pokemonAttack2) {
		this.pokemonAttack2 = pokemonAttack2;
	}

	public Attack getPokemonAttack3() {
		return pokemonAttack3;
	}

	public void setPokemonAttack3(Attack pokemonAttack3) {
		this.pokemonAttack3 = pokemonAttack3;
	}

	public Attack getPokemonAttack4() {
		return pokemonAttack4;
	}

	public void setPokemonAttack4(Attack pokemonAttack4) {
		this.pokemonAttack4 = pokemonAttack4;
	}

	public BufferedImage getPokemonBack() {
		return pokemonBack;
	}

	public void setPokemonBack(BufferedImage pokemonBack) {
		this.pokemonBack = pokemonBack;
	}

	public BufferedImage getPokemonFront() {
		return pokemonFront;
	}

	public void setPokemonFront(BufferedImage pokemonFront) {
		this.pokemonFront = pokemonFront;
	}

	@Override
	public String toString() {
		return "Pokemon [pokemonLvl=" + pokemonLvl + ", pokemonHP=" + pokemonHP + ", pokemonSpeed=" + pokemonSpeed
				+ ", pokemonDefense=" + pokemonDefense + ", pokemonAttackStat=" + pokemonAttackStat + ", pokemonName="
				+ pokemonName + ", pokemonAttack1=" + pokemonAttack1 + ", pokemonAttack2=" + pokemonAttack2
				+ ", pokemonAttack3=" + pokemonAttack3 + ", pokemonAttack4=" + pokemonAttack4 + ", pokemonBack="
				+ pokemonBack + ", pokemonFront=" + pokemonFront + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pokemonAttack1, pokemonAttack2, pokemonAttack3, pokemonAttack4, pokemonAttackStat,
				pokemonBack, pokemonDefense, pokemonFront, pokemonHP, pokemonLvl, pokemonName, pokemonSpeed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(pokemonAttack1, other.pokemonAttack1)
				&& Objects.equals(pokemonAttack2, other.pokemonAttack2)
				&& Objects.equals(pokemonAttack3, other.pokemonAttack3)
				&& Objects.equals(pokemonAttack4, other.pokemonAttack4) && pokemonAttackStat == other.pokemonAttackStat
				&& Objects.equals(pokemonBack, other.pokemonBack) && pokemonDefense == other.pokemonDefense
				&& Objects.equals(pokemonFront, other.pokemonFront) && pokemonHP == other.pokemonHP
				&& pokemonLvl == other.pokemonLvl && Objects.equals(pokemonName, other.pokemonName)
				&& pokemonSpeed == other.pokemonSpeed;
	}
}
