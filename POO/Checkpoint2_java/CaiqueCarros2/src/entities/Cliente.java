package entities;

public class Cliente {

    private String nome;
    private String cpf;
    private String numero;
    private String email;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String numero, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", numero='" + numero + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
