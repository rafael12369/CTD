package entities;

public class Carro {

    private String placa;
    private String cor;
    private String modelo;

    public Carro() {
    }

    public Carro(String placa, String cor, String modelo) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro " +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'';
    }
}
