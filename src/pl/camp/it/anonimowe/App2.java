package pl.camp.it.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Car> listaLiczb = new ArrayList<>();

        listaLiczb.add(new Car("BMW", "3", 123000));
        listaLiczb.add(new Car("Audi", "A5", 276000));
        listaLiczb.add(new Car("Toyota", "Yaris", 47000));
        listaLiczb.add(new Car("Mercedess", "C", 476000));

        //Collections.sort(listaLiczb);

        //System.out.println(listaLiczb);

        Collections.sort(listaLiczb, new PorownywaczPoMarce());

        System.out.println(listaLiczb);

        Collections.sort(listaLiczb, new PorownywaczPoCenie());

        System.out.println(listaLiczb);

        Collections.sort(listaLiczb, new Comparator<Car>() {
            @Override
            public int compare(Car car, Car t1) {
                return car.getModel().compareTo(t1.getModel());
            }
        });


        System.out.println(listaLiczb);
    }
}
