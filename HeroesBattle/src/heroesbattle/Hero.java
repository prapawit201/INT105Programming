/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesbattle;

/**
 *
 * @author Tisanai.Cha
 */
public class Hero {

    private String name;
    private int health;
    private Armor armor;
    private Weapon weapon;

    public Hero(String name, int health, Armor armor, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" + "name=" + name + ", health=" + health + ", armor=" + armor + ", weapon=" + weapon + '}';
    }

    void changeArmor(Armor armor) {
        setArmor(armor);
    }

    public void changeWeapon(Weapon weapon) {
        setWeapon(weapon);
    }

    public int getAttactPower() {
        return weapon.getPower();
    }

    public void attacted(int power) {
        power -= armor.getArmor();
        if (power > 0) {
            health -= power;
        }
    }

    public void attacted(Hero hero) {
        attacted(hero.getAttactPower());
    }

}
