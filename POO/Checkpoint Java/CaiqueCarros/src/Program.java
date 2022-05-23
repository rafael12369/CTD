import entities.Carro;
import entities.Cliente;
import entities.Contrato;
import entities.Provedor;


public class Program {

    public static void main(String[] args) {
        Carro car1 = new Carro();
        Provedor p1 = new Provedor();
        Cliente c1 = new Cliente();
        Carro car2 = new Carro();
        Provedor p2 = new Provedor();
        Cliente c2 = new Cliente();
        Carro car3 = new Carro();
        Provedor p3 = new Provedor();
        Cliente c3 = new Cliente();
        Contrato contrato1 = new Contrato(01, c1, p1, car1, 5);
        System.out.println(contrato1);
        System.out.println(contrato1.total());
    }
}
