import entities.ImpressoraCannon;
import entities.ImpressoraEpson;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {

        ImpressoraEpson epson = new ImpressoraEpson(
                "LX-3000", "USB", LocalDate.now(),
                5, 20.0);
        System.out.println(epson);
        epson.imprimir();

        ImpressoraCannon cannon = new ImpressoraCannon(
                "LX-3000", "USB", LocalDate.now(),
                2, 20.0);
        System.out.println(cannon);
        cannon.imprimir();
    }

}
