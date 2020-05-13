package com.company;

public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String heroesSuperAbility;

    public Hero(int heroesHealth, int heroesDamage, String heroesSuperAbility) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.heroesSuperAbility = heroesSuperAbility;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getHeroesSuperAbility() {
        return heroesSuperAbility;
    }

}
