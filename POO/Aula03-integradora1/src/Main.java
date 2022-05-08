import java.util.Scanner;


public class main {


    public static int quantosPacotes(float qtd) {

        Scanner entrada = new Scanner(System.in);
        float kilo = 0.0f;
        int pacote = 0;

        while (kilo < qtd) {
            System.out.print("digite o peso do pacote: ");
            float peso = entrada.nextFloat();
            kilo = kilo + peso;
            pacote = pacote + 1;
        }



        return pacote;
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("digite o nome do doguinho: ");
        String nome = ler.nextLine();
        System.out.print("digite a qtd de ração: ");
        float quantidade = ler.nextFloat();

        int valor = quantosPacotes(quantidade);
        System.out.printf("seu doguinho vai precisar de %d pacotes", valor);

        ler.close();

    }

}