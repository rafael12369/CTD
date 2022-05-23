package entities;

public class Contrato {

    private int nmro;
    private Cliente cliente;
    private Provedor provedor;
    private Carro carro;
    private int qtdDiarias;
    private double valorDiaria = 200.0;

    public Contrato() {
    }

    public Contrato(int nmro, Cliente cliente, Provedor provedor, Carro carro, int qtdDiarias) {
        this.nmro = nmro;
        this.cliente = cliente;
        this.provedor = provedor;
        this.carro = carro;
        this.qtdDiarias = qtdDiarias;
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

    @Override
    public String toString() {
        return "Contrato{" +
                "nmro=" + nmro +
                ", cliente=" + cliente +
                ", provedor=" + provedor +
                ", carro=" + carro +
                ", qtdDiarias=" + qtdDiarias +
                ", valorDiaria=" + valorDiaria +
                '}';
    }
}

