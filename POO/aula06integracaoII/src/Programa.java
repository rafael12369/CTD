import entities.Impressora;

import java.util.Date;

public class Programa {

    public static void main(String[] args) {

        Impressora imp1 = new Impressora("dell", "wifi", new Date(), 50);

        System.out.println(imp1);

        imp1.imprimir("Hello world");

    }
}




