package Hero;

import Factory.ArmorFactory;
import Factory.SwordFactory;

public class Knight extends Hero {

    public Knight() {
        super(new SwordFactory(), new ArmorFactory());
    }

    protected Knight(int health) {
        super(health);
    }
}
