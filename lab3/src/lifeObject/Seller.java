package lifeObject;

import enums.SoundType;
import interfaces.Sellable;

public class Seller extends Aive implements Sellable {
    public Seller(String name) {
        super(name);
    }
    public void Shout(SoundType t){
        System.out.printf(", который %s выкрикивает: \n", t);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
