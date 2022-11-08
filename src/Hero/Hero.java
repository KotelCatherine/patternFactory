package Hero;

import Factory.ArmorFactory;
import Interface.WeaponFactory;
import Type.ArmorType;
import Type.WeaponType;

public class Hero {
    private WeaponFactory weaponFactory;
    private ArmorFactory armorFactory;
    private int health;

    public Hero(int health) {
        this.health = health;

    }

    public Hero(WeaponFactory weaponFactory, ArmorFactory armorFactory) {
        this.weaponFactory = weaponFactory;
        this.armorFactory = armorFactory;
    }

    public void createWeapon(WeaponType type) {
        weaponFactory.create(type);
    }

    public void createArmor(ArmorType type) {
        armorFactory.create(type);
    }

    private static void attack() {

    }

    private static void damage() {

    }
}

