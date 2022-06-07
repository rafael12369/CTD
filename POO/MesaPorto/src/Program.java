import entidades.Container;
import entidades.Porto;

public class Program {

    public static void main(String[] args) {

        Container cont1 = new Container(01,"Apple","USA",false);
        Container cont2 = new Container(02,"Amazon","USA",false);
        Container cont3 = new Container(03,"Microsoft","USA",false);
        Container cont4 = new Container();
        cont4.setPerigoso(true);

        Porto porto = new Porto(01, "Buenos Aires");

        porto.adicionarContainer(cont1);
        porto.adicionarContainer(cont2);
        porto.adicionarContainer(cont3);
        porto.adicionarContainer(cont4);

        porto.mostrarContainers();
        System.out.print("Containers perigosos e desconhecidos: ");
        System.out.print(porto.qntContainerPerigosoDesconhecido());
    }
}
