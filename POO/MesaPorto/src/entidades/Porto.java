package entidades;

import java.util.ArrayList;
import java.util.List;

public class Porto {

    private int id;
    private String nome;
    private List<Container> listaContainer = new ArrayList<>();


    public Porto() {
    }

    public Porto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void adicionarContainer(Container j) {
        listaContainer.add(j);
    }

    public void mostrarContainers() {

        for (Container jog : listaContainer) {
            System.out.println(
                    "ID: " + jog.getId() +
                            " - Descricao: " + jog.getDescricao() +
                            " - PaisOrigem: " + jog.getPaisOrigem()
            );
        }
    }


    public int qntContainerPerigosoDesconhecido() {
        int qnt = 0;
        for (Container cont : listaContainer) {
            if (cont.origemDesconhecida() && cont.isPerigoso()) {
                qnt++;
            }
        }
        return qnt;
    }




}
