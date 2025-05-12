package model;

public class Vetor {
    private int[] dados;

    public Vetor(int[] dados) {
        this.dados = dados;
    }

    public int[] getDados() {
        return dados;
    }

    public void setDados(int[] dados) {
        this.dados = dados;
    }

    public int getTamanho() {
        return dados.length;
    }
}
