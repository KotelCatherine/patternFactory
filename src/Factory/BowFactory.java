package Factory;

import Interface.WeaponFactory;
import Type.WeaponType;
import Weapon.Bow;
import Error.ErrorTypeOfWeapon;
import Weapon.StandardBow;
import Weapon.ElfBow;
import Weapon.Weapon;

public class BowFactory implements WeaponFactory {
    @Override
    public Weapon create(WeaponType type) {
        Bow bow = null;

        switch (type) {
            case STANDARD_BOW -> bow = new StandardBow(1, 15);
            case ELF_BOW -> bow = new ElfBow(3, 23);
            default -> throw new ErrorTypeOfWeapon("Выбран неверный тип оружия");
        }

        return bow;
    }
}
