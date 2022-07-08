package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipe {

    private int id;
    private String nome;
    private List<Jogador> listaJogadores = new ArrayList<>();

    public Equipe(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método customizado
    public void adicionarJogador(Jogador j) {
        listaJogadores.add(j);
    }

    public void mostrarJogadoresTitulares() {

        for (Jogador jog : listaJogadores) {
            if (jog.isTitular()) {
                System.out.println(
                        "ID: " + jog.getId() +
                        " - Nome: " + jog.getNome() +
                        " - Camisa: " + jog.getCamisa()
                );
            }
        }
    }

    public int getQuantidadeJogadoresLesionados() {
        int contador = 0;
        for (Jogador jog : listaJogadores) {
            if (jog.isLesionado() && jog.isTitular()) {
                contador++;
            }
        }
        return contador;
    }

}
