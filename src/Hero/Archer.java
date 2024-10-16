package Hero;

import Factory.ArmorFactory;
import Factory.BowFactory;

public class Archer extends Hero {

    public Archer() {
        super(new BowFactory(), new ArmorFactory());
    }

    protected Archer(int health) {
        super(health);
    }
}
