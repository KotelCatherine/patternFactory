package Interface;

import Type.WeaponType;
import Weapon.Weapon;

public interface WeaponFactory {

    Weapon create(WeaponType type);
}
