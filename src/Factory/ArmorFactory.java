package Factory;

import Armor.Armor;
import Type.ArmorType;
import Armor.ElfArmor;
import Armor.StandardArmor;
import Armor.StandardHardArmor;
import Armor.ElfHardArmor;

public class ArmorFactory {
    public Armor create(ArmorType type) {
        Armor armor = null;

        switch (type) {
            case HARD_STANDARD_ARMOR -> armor = new StandardHardArmor(15);
            case HARD_ELF_ARMOR -> armor = new ElfHardArmor(23);
            case LIGHT_STANDARD_ARMOR -> armor = new StandardArmor(13);
            case LIGHT_ELF_ARMOR -> armor = new ElfArmor(20);
        }

        return armor;
    }
}
