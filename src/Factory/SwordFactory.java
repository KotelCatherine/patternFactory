package Factory;

import Interface.WeaponFactory;
import Type.WeaponType;
import Weapon.Sword;
import Error.ErrorTypeOfWeapon;
import Weapon.StandardSword;
import Weapon.ElfSword;
import Weapon.Weapon;

public class SwordFactory implements WeaponFactory {
    @Override
    public Weapon create(WeaponType type) {
        Sword sword = null;

        switch (type) {
            case STANDARD_SWORD -> sword = new StandardSword(1, 10);
            case ELF_SWORD -> sword = new ElfSword(2, 20);
            default -> throw new ErrorTypeOfWeapon("Выбран неверный тип оружия");
        }

        return sword;
    }
}