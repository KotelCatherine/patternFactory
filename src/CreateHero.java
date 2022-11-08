import Hero.Archer;
import Hero.Hero;
import Type.ArmorType;
import Type.WeaponType;

public class CreateHero {

    public static void main(String[] args) {
        Hero archer = new Archer();
        archer.createWeapon(WeaponType.ELF_BOW);
        archer.createArmor(ArmorType.LIGHT_STANDARD_ARMOR);
    }
}