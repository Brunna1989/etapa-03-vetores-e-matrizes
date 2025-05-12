package model;

public class Matriz {
    private int[][] dados;

    public Matriz(int[][] dados) {
        this.dados = dados;
    }

    public int[][] getDados() {
        return dados;
    }

    public int getTamanho() {
        return dados.length;
    }
}
