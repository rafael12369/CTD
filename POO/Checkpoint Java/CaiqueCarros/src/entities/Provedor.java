package entities;

public class Provedor  {

    public String nome = "caiqueCarros";
    public String cnpj = "02.651.893/0002-41";

    @Override
    public String toString() {
        return "Provedor{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
