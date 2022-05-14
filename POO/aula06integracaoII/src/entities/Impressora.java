package entities;

import java.util.Date;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private Date dataFabricacao;
    private int folhasDisponíveis;

    private boolean temPapel() {
        if (folhasDisponíveis > 0) {
            return true;
        } else {
            return false;
        }

    }


   public void imprimir(String texto) {
        if (this.temPapel() == true) {
            System.out.println(texto);
        } else {
            System.out.println("Não há papel nessa impressora");
        }

     }


    public Impressora() {
     }

    public Impressora(String modelo, String tipoConexao, Date dataFabricacao, int folhasDisponíveis) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponíveis = folhasDisponíveis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponíveis() {
        return folhasDisponíveis;
    }

    public void setFolhasDisponíveis(int folhasDisponíveis) {
        this.folhasDisponíveis = folhasDisponíveis;
    }

    @Override
    public String toString() {
        return "Impressora{" +
                "modelo='" + modelo + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                ", folhasDisponíveis=" + folhasDisponíveis +
                '}';
    }
}
