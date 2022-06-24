import entities.*;
import entities.pagamentos.*;

import java.util.Scanner;


public class Program {


    //Usar o scanner
    public static void main(String[] args) throws Exception {

        // Criação de objetos
        Carro car1 = new Carro();
        Provedor p1 = new Provedor();
        Cliente c1 = new Cliente();
        Carro car2 = new Carro();
        Provedor p2 = new Provedor();
        Cliente c2 = new Cliente();
        Carro car3 = new Carro();
        Provedor p3 = new Provedor();
        Cliente c3 = new Cliente();

        Pix pix = new Pix();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
        CartaoDeDebito cartaoDeDebito = new CartaoDeDebito();



        // Criação do contrato 1
        // Contrato com forma de pagamento em crédito
        Contrato contrato1 = new Contrato(01, c1, p1, car1, 5, cartaoDeCredito);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(contrato1);
        System.out.println("Taxa total Cartao De Credito: " + contrato1.calculaTaxa());
        System.out.println("Valor com as taxas Cartao De Credito: " + contrato1.totalComTaxas());



        // Criação do contrato 2
        // Contrato com forma de pagamento em débito
        // Criação de contrato com input do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Criação de contrato com apenas o parâmetro de quantidade de diária");
        System.out.print("Você gostaria de quantas diárias? ");
        int qtdDiarias = scanner.nextInt();

        Contrato contrato2 = new Contrato(02, c2, p2, car2, qtdDiarias, cartaoDeDebito);
        System.out.println(contrato2);
        System.out.println("Taxa total Cartao De Debito: " + contrato2.calculaTaxa());
        System.out.println("Valor com as taxas Cartao De Debito: " + contrato2.totalComTaxas());

        System.out.println("-------------------------------------------------------------------");



        Contrato c = new Contrato();

        // MÉTODO QUE CRIA UM CONTRATO COMPLETO COM TODOS OS INPUTS DO USUARIO
        System.out.println(c.gerarContrato());

        System.out.print("Tudo certo? 01 para sim | 02 para não \n");
        int verdadeiro = scanner.nextInt();


        // lista de contratos
        c.adicionarContratoALista(contrato1);
        c.adicionarContratoALista(contrato2);


        //exibindo a lista de contratos

        System.out.print("EXIBINDO LISTA DE CONTRATOS ");
        c.mostrarContratos();

        // sout de contrato já feito
        System.out.println("Mostrando contrato já feito");
        c.gerarContratoFeito(contrato1);


    }
}