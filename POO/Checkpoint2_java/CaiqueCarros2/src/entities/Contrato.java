package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.pagamentos.*;

public class Contrato {

    private int nmro;
    private Cliente cliente;
    private Provedor provedor;
    private Carro carro;
    private int qtdDiarias;
    private OpcaoPagamento opcaoPagamento;
    private double valorDiaria = 200.00;
    private List<Contrato> listaDeContratos = new ArrayList<>();



    public Contrato() { }

    public Contrato(int nmro, Cliente cliente, Provedor provedor, Carro carro, int qtdDiarias, OpcaoPagamento opcaoPagamento ) {
        this.nmro = nmro;
        this.cliente = cliente;
        this.provedor = provedor;
        this.carro = carro;
        this.qtdDiarias = qtdDiarias;
        this.opcaoPagamento = opcaoPagamento;
    }

    public Contrato gerarContrato() throws Exception {
        Cliente cliente = new Cliente();
        Contrato contrato = new Contrato();
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        Provedor provedor = new Provedor();
        Pix pix = new Pix();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
        CartaoDeDebito cartaoDeDebito = new CartaoDeDebito();

            System.out.println("E aí mano qual é o seu nome? ");
            String nomeCLiente = scanner.next();
            cliente.setNome(nomeCLiente);

                System.out.println("E aí mano qual é o seu cpf? ");
                String cpf = scanner.next();
                cliente.setCpf(cpf);

                    System.out.println("E aí mano qual é o seu numero? ");
                    String numero = scanner.next();
                    cliente.setNumero(numero);

                        System.out.println("E aí mano qual é o seu email? ");
                        String email = scanner.next();
                        cliente.setEmail(email);

                            System.out.println("Salve manó, manda a marca do carro pro nois!");
                            String marcaCarro = scanner.next();
                            carro.setModelo(marcaCarro);

                                System.out.println("Agora manda pra nois a corzinha do carrinho da barbie aí meu irmão.");
                                String cor = scanner.next();
                                carro.setCor(cor);

                                        System.out.println("Chama na forma de pagamento apenas os citados! \n 1 - Pix \n 2 - Debito \n 3 - Credito");
                                        int OpPag = scanner.nextInt();
                                        switch(OpPag)
                                        {
                                            case 1:
                                                contrato.setOpcaoPagamento(pix);
                                                break;
                                            case 2:
                                                contrato.setOpcaoPagamento(cartaoDeDebito);
                                                break;
                                            case 3:
                                                contrato.setOpcaoPagamento(cartaoDeCredito);
                                                break;
                                            default:
                                                throw new Exception("Existe isso não meu bem!");

                                        }

                                                    System.out.println("Agora quantas diárias vc quer cusão? ");
                                                    int qtdDiarias = scanner.nextInt();
                                                    contrato.setQtdDiarias(qtdDiarias);

                                                    contrato.setCliente(cliente);
                                                    contrato.setProvedor(provedor);
                                                    contrato.setNmro(01);
                                                    contrato.setCarro(carro);

                                                        return contrato;


    }

    public void gerarContratoFeito(Contrato contrato) {
        System.out.println(contrato);
    }


    public void adicionarContratoALista(Contrato c) { listaDeContratos.add(c); }


    public void mostrarContratos() {
        for (Contrato c : listaDeContratos) {
            gerarContratoFeito(c);
        }
    }

    public double total() {
        return this.valorDiaria * (double) this.qtdDiarias;
    }

    public int getNmro() {
        return nmro;
    }

    public void setNmro(int nmro) {
        this.nmro = nmro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Provedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }

    public Carro getCarro() {
        return carro;
    }
    
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getQtdDiarias() {
        return qtdDiarias;
    }

    public void setQtdDiarias(int qtdDiarias) {
        this.qtdDiarias = qtdDiarias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setOpcaoPagamento(OpcaoPagamento opcaoPagamento) {
        this.opcaoPagamento = opcaoPagamento;
    }

    public double calculaTaxa() {
        return this.opcaoPagamento.taxa(total());
    }

    public double totalComTaxas() {
        return this.opcaoPagamento.totalComTaxas(total());
    }

    @Override
    public String toString() {
        return
                "-------------------------------------------------------------------" + "\n" +
                "Contrato " +
                "nmro = " + nmro + "\n" +
                " cliente = " + cliente + "\n" +
                " provedor = " + provedor + "\n" +
                " carro = " + carro + "\n" +
                " qtdDiarias = " + qtdDiarias + "\n" +
                " valorDiaria = " + valorDiaria + "\n" +
                " taxa = " + calculaTaxa() + "\n" + " total = " + total() + "\n" +
                " total + taxas = " + totalComTaxas() + "\n" +
                        "-------------------------------------------------------------------";


    }
}