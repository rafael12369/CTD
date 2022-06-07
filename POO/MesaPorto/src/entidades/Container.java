package entidades;

public class Container {

    private int id;
    private String descricao;
    private String paisOrigem;
    private boolean perigoso;


    public Container() {

    };

    public Container(int id, String descricao, String paisOrigem, boolean perigoso) {
        this.id = id;
        this.descricao = descricao;
        this.paisOrigem = paisOrigem;
        this.perigoso = perigoso;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }


    public boolean origemDesconhecida() {
        if(getPaisOrigem() == null) {
            return true;
        }else {
        return false;
        }
    }


}
