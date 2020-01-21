package pl.camp.it.anonimowe;

import java.util.Comparator;

public class PorownywaczPoCenie implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        if(o instanceof Car && t1 instanceof Car) {
            Car c1 = (Car) o;
            Car c2 = (Car) t1;

            return c1.getPrice() - c2.getPrice();
        } else {
            return -1;
        }
    }
}
